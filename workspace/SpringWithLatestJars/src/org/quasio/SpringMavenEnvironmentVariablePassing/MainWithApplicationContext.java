package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainWithApplicationContext {

	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
 factory.getBean(ShapeFactory.class).getShape("circle").draw();

		
	
	}

}

/*
 * 
 * Shape shape = factory.getBean(Square.class); shape.draw();
 */
