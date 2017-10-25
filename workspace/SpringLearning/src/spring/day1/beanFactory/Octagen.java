package spring.day1.beanFactory;

import org.springframework.beans.factory.annotation.Required;

public class Octagen implements Shape {
	// Demo for Required Annotation using Octagen class:

	// @Required annotation is placed over setter methord of those fields which have
	// to be initialized by spring,
	// if not the application shoud not proceed and remove the cahnce of null
	// pointer exception later on , easy in debubbing

	private String name;

	private int sideLength;

	// @Required is no good here spring only checks set methord
	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public int getSideLength() {
		return sideLength;
	}

	public void setSideLength(int sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public void draw() {
		System.out.println("Draw a octagen with name '" + getName() + "' and side length of '" + getSideLength() + "'");

	}

}
