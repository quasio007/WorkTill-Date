package org.quasio.SpringMavenEnvironmentVariablePassing;

public class Circle {
private String name;

public Circle(String name) {
	super();
	this.name = name;
}

public void draw() {
	System.out.println("Draw a circle with name : '"+name+"'");
}
}
