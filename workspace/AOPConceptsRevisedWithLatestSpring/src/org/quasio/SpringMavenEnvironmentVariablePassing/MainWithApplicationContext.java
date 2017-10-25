package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainWithApplicationContext {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		ShapeFactory shapeFactory = factory.getBean(ShapeFactory.class);
		shapeFactory.getShape("circle").draw();

 factory.close();
		
	
	}

}

