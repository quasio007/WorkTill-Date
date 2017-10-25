package spring.day1.beanFactory;

import javax.annotation.Resource;

public class Circle implements Shape{
//	Object dependency injection Example Using Circle class :
	
	private Color color;
	private Parameter param;
	
	
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Parameter getParam() {
		return param;
	}
	@Resource
	public void setParam(Parameter param) {
		this.param = param;
	}
	
	public void draw() {
	System.out.println("Draw Circle with colors : '"+color.getFirstColor()+"' and '"+color.getSecondColor()
					  +	"' \n With radius : '"+param.getRadius());
}
}