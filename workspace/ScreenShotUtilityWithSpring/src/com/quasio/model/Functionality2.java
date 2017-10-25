package com.quasio.model;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Functionality2 extends Functionality {
	@Autowired
	private Model mapDaoHandler;
	
	@PostConstruct
	public void intialize() {
		System.out.println("Functionality2 bean created");
	}

	@Override
	public void methord1() {
		System.out.println("methord1 called from Functionality2");
		
	}

	@Override
	public void methord2() {
		System.out.println("methord1 called from Functionality2");
		
	}

}
