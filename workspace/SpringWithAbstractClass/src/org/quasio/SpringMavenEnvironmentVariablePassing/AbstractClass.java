package org.quasio.SpringMavenEnvironmentVariablePassing;

import org.springframework.beans.factory.annotation.Autowired;


public abstract class AbstractClass {

	@Autowired
	protected Student student;
	
	@Autowired
	protected Teacher teacher ;
	
	public void callStudent() {
		System.out.println(student.getName()+" is called.");
	}
	
	public void callTeacher() {
		System.out.println(teacher.getName()+" is called.");
	}
}
