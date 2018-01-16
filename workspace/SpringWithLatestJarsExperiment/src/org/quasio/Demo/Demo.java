package org.quasio.Demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.stereotype.Component;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		A a = context.getBean(A.class);
		System.out.println(a);
		B b = context.getBean(B.class);
		b.id();
		System.out.println(a);
		C c = context.getBean(C.class);
		c.name();
		System.out.println(a);
		((AbstractApplicationContext) context).close();
	}

}

@Configuration
@ComponentScan({ "org.quasio.Demo" })
class SpringConfig {

}

@Component
class A implements InitializingBean {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		id = 1;
		name = "Aman";
	}

	@Override
	public String toString() {
		return id + " : " + name;
	}

}

@Component
class B {
	@Autowired
	private A a;

	public void id() {
		a.setId(3);
	}
}

@Component
class C {
	@Autowired
	private A a;

	public void name() {
		a.setName("Mohit");
	}
}