package spring.day1.beanFactory;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplicationContext {
	public static Scanner scan =new Scanner(System.in);
	
	public static void main(String[] args) {
//		Initialize the Application Context :
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring1.xml");
		Shape shape =null;
		
		System.out.println("Enter a shape :");
		String str =scan.nextLine();
		switch(str) {
//		Setter dependency injection Example Using Triangle class :
		case "equilateralTriangle":
			shape= (Triangle) factory.getBean("equilateralTriangle");
			break;
		case "isosleceTriangle":
			shape= (Triangle) factory.getBean("isosleceTriangle");
			break;
		case "rightAngleTriangle":
			shape= (Triangle) factory.getBean("rightAngleTriangle");
			break;
	
//			Constructor dependency injection Example Using Rectangle class :
		case "rectangleHeightLengthType":
			shape= (Rectangle) factory.getBean("rectangleHeightLengthType");
			break;
		case "rectangleHeightLength":
			shape= (Rectangle) factory.getBean("rectangleHeightLength");
			break;	
			
//			Object dependency injection Example Using Circle class :
		case "circleWithColorAndParameters":
			shape = (Circle) factory.getBean("circleWithColorAndParameters");
			break;
			
			
		default:
			System.out.println("Entered shape : '"+str+"' is not correct");
			break;
			
		}
		
	
		shape.draw();

	}

}
