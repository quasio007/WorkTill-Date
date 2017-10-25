package spring.day1.beanFactory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hexagon implements Shape,InitializingBean,DisposableBean{
//	Demo for calling init and destroy methords using interfaces in hexagon class :
	
private String name ;
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	

	public void draw() {
		System.out.println("Draw a hexagon with name '"+getName()+"'");
		
	}
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
	System.out.println("Calling init methord using InitializingBean interface in Class Hexagon");
		
	}
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Calling destroy methord using DisposableBean interface in Class Hexagon");
		
	}

}
