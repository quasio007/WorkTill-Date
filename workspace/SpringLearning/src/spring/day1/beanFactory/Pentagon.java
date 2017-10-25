package spring.day1.beanFactory;

public class Pentagon implements Shape{
//	Demo for using used defined destroy and init methord by setting them in bean defination itself :
	
private String name ;
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
	

	public void draw() {
		System.out.println("Draw a Pentagon with name '"+getName()+"'");
		
	}
	

	public void userDefinedInit() throws Exception {
	System.out.println("Calling userDefinedInit methord  by setting bean in xml in Class Pentagon");
		
	}
	
	

	public void userDefinedDestroy() throws Exception {
		System.out.println("Calling userDefinedDestroy methord by setting bean in xml in Class Pentagon");
		
	}
	

}
