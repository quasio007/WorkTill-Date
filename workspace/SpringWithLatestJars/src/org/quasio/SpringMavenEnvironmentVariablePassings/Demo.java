package org.quasio.SpringMavenEnvironmentVariablePassings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

public class Demo {

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		A a = context.getBean(A.class);
		System.out.println(a.b);
		context.close();
	}

}

@Configuration
@ComponentScan({ "org.quasio.SpringMavenEnvironmentVariablePassings" })
class Config {

}


abstract class A implements I{
	@Autowired
	 B b;
}


interface I{
	int a = 12;
	
	static void m() {
		
	}
}

@Component
class B extends A {
	String name = "Mohit";
	int age = 26;

	@Override
	public String toString() {
		return name + " : " + age;
	}
}
