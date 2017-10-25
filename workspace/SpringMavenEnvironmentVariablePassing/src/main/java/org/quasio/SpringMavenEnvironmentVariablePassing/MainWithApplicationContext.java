package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainWithApplicationContext {

	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext();
//		factory.getBean(arg0);
//		Circle c =new Circle("Caty");
//		c.draw();
	}

}
