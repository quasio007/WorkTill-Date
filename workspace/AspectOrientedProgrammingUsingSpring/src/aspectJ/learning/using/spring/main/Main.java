package aspectJ.learning.using.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aspectJ.learning.using.spring.service.ShapeProvider;

public class Main {
public static void main(String[] args) {
	ApplicationContext factory = new ClassPathXmlApplicationContext("aspectJ.xml");
	ShapeProvider shape = (ShapeProvider) factory.getBean("shapeProvider");
	System.out.println(shape.getCircle().getName());
//	System.out.println(shape.getTriangle().getName());
}
}
