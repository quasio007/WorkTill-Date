package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Circle implements Shape,InitializingBean,DisposableBean{
private String name;


private String checkingRequiredKeyword;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCheckingRequiredKeyword() {
	return checkingRequiredKeyword;
}
@Required
public void setCheckingRequiredKeyword(String checkingRequiredKeyword) {
	this.checkingRequiredKeyword = checkingRequiredKeyword;
}

@Value("${name}")
private String value;

public Circle(String name) {

	this.name = name;
}

public void draw() {
	System.out.println("Draw a circle with name : '"+name+"'");
	System.out.println("Value : '"+value+"'");
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Circle name is :'"+name+"'";
}

@Override
public void destroy() throws Exception {
	System.out.println("From Destroy methord in circle class");
	
}

@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("From Init methord in Circle class");	
}
}
