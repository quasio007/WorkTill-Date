package spring.day1.beanFactory;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAbstractApplicationContext {
	public static Scanner scan =new Scanner(System.in);
	
	public static void main(String[] args) {
//		Initialize the Application Context :
//		If we use Application Context init method would be called but destroy method will not as spring does not now 
//		so we need to use AbstractApplicationContext and call registerShuddownHook using that to let spring know that main methord has ended and it can call destroy methords
		
//		ApplicationContext factory = new ClassPathXmlApplicationContext("spring1.xml");
		
		AbstractApplicationContext factory = new ClassPathXmlApplicationContext("spring1.xml");
		factory.registerShutdownHook();
		
		Shape shape =null;
		System.out.println();
		System.out.println("Enter a shape :");
		String str =scan.nextLine();		
		
		try {
			shape = (Shape) factory.getBean(str);
			shape.draw();
		} catch (Exception e ) {

			System.out.println("Entered shape : '"+str+"' is not correct");
		}
		


	}

}

/*
 * Code not required:

switch(str) {
//Setter dependency injection Example Using Triangle class :
case "equilateralTriangle":
	shape= (Shape) factory.getBean(str);
	break;
case "isosleceTriangle":
	shape= (Shape) factory.getBean(str);
	break;
case "rightAngleTriangle":
	shape= (Shape) factory.getBean(str);
	break;

//	Constructor dependency injection Example Using Rectangle class :
case "rectangleHeightLengthType":
	shape= (Shape) factory.getBean(str);
	break;
case "rectangleHeightLength":
	shape= (Shape) factory.getBean(str);
	break;	
	
//	Object dependency injection Example Using Circle class :
case "circleWithColorAndParameters":
	shape = (Shape) factory.getBean(str);
	break;
	
//	Demo for calling init and destroy methords using interfaces in hexagon class :
case "hexagon":
	shape = (Shape) factory.getBean(str);
	break;
	
//	Demo for calling init and destroy methords using interfaces in hexagon class :
case "pentagon":
	shape = (Shape) factory.getBean(str);
	break;
	
//	Demo for getting values from properties file :
case "septagen":
	shape = (Shape) factory.getBean(str);
	break;
	
	
default:
	System.out.println("Entered shape : '"+str+"' is not correct");
	break;
	
}

*/