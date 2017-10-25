package spring.day1.beanFactory;

public class Rectangle implements Shape{
//	Constructor dependency injection Example Using Rectangle class :
	private int height ;
	private int length ;
	private String type =new String("Square");


	
public Rectangle(int height, int length, String type) {
		
		this.height = height;
		this.length = length;
		this.type = type;
	}

public Rectangle(int height, int length) {
		
		this.height = height;
		this.length = length;
	}

public int getHeight() {
	return height;
}

public int getLength() {
	return length;
}

public String getType() {
	return type;
}

public void draw() {
	System.out.println("Draw a Rectangle of type '"+getType()+"' with Height '"+getHeight()+"' and Lenght '"+getLength()+"'");
}
}