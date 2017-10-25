package spring.day1.beanFactory;

public class Septagen implements Shape{
//	Demo for calling init and destroy methords using interfaces in hexagon class :
	
private String name ;
private int sides;

	public int getSides() {
	return sides;
}

public void setSides(int sides) {
	this.sides = sides;
}

	public String getName() {
	return name;
}
	
public void setName(String name) {
	this.name = name;
}
	

	public void draw() {
		System.out.println("Draw a septagen with name '"+getName()+"' and sides '"+getSides()+"'");
		
	}
	


}
