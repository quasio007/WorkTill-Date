package org.quasio.SpringMavenEnvironmentVariablePassing;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Triangle implements Shape{
private String name;

public Triangle(String name) {
	this.name =name;
}

public void draw() {
	System.out.println("Draw a triangle with name : '"+name+"'");
}

@PreDestroy
public void destruct() {
	System.out.println("Using @PreDestroy from Triangle class");
}

@PostConstruct
public void initialize() {
	System.out.println("Using @PostConstruct from Triangle class");
}

}
