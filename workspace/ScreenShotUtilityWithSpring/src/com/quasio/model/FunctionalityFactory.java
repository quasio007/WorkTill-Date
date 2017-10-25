package com.quasio.model;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//Below method will initialize just 1 Bean for Model :
@Component
@Lazy
public class FunctionalityFactory implements ApplicationContextAware{

private ApplicationContext context;
	
	public  Model getFunctionality(String functionality) {
		switch (functionality) {
		case "Single Payment":
			return (Model)context.getBean("functionality1");
		case "Multiple Payment":
			return (Model)context.getBean("functionality2");
		default:
			return null;
		}
	}

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context =context;
		
	}

	
}

// 

/*
 * Other Method : the problem with this method is that Beans of all the classes are created in each case

@Component
@Lazy
public class FunctionalityFactory {
@Autowired
private Model functionality1;

@Autowired
private Model functionality2;
	
	public  Model getFunctionality(String functionality) {
		switch (functionality) {
		case "Single Payment":
			
			return functionality1;
		case "Multiple Payment":
			
			return functionality2;
			

		default:
			return null;
			
			
		}
	}
	
}
 

*/