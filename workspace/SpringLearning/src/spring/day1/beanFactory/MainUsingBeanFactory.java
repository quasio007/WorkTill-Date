package spring.day1.beanFactory;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MainUsingBeanFactory {
	public static Scanner scan =new Scanner(System.in);
	
	public static void main(String[] args) {
//		Initialize the XML bean factory :
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		Shape shape =null;
		
		System.out.println("Enter a shape :");
		String str =scan.nextLine();
		switch(str) {
		case "circle":
			shape = (Circle) factory.getBean("circle");
			break;
		case "triangle":
			shape= (Triangle) factory.getBean("triangle");
			break;
		case "rectangle":
			shape= (Rectangle) factory.getBean("rectangle");
			break;
		default:
			System.out.println("Entered shape : '"+str+"' is not correct");
			break;
			
		}
		
	System.out.println("Check");
		shape.draw();

	}

}
