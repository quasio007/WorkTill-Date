package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainWithApplicationContext {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
 factory.getBean(ShapeFactory.class).getShape("circle").draw();
 
// factory.getBean(Triangle.class).draw();
 factory.getBean(ComponentAnnotationDemo.class).demo();
factory.close();


	
	}

}

/*
 * 
 * Shape shape = factory.getBean(Square.class); shape.draw();
 */
