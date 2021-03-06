package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainWithApplicationContext {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		AbstractClass child = factory.getBean(ChildClass.class);
			child.callStudent();
			child.callTeacher();
	
			factory.close();
	}

}

