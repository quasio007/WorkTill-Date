package spring.day1.beanFactory;

public class Triangle implements Shape{
//	Setter dependency injection Example :
	
	private String type;
public void draw() {
	System.out.println("Draw Triangle of type : '"+getType()+"'");
}

public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}

}
