package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.springframework.beans.factory.annotation.Value;

public class Circle implements Shape{
private String name;

@Value("${name}")
private String value;

public Circle(String name) {

	this.name = name;
}

public void draw() {
	System.out.println("Draw a circle with name : '"+name+"'");
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Circle name is :'"+name+"'";
}
}
