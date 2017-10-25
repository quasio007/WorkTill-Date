package org.quasio.SpringMavenEnvironmentVariablePassing;

public class Square implements Shape{
private String name;

public Square(String name) {
	this.name =name;
}

public void draw() {
	System.out.println("Draw a square with name : '"+name+"'");
}
}
