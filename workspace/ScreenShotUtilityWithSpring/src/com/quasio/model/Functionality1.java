package com.quasio.model;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Functionality1 extends Functionality{

	@PostConstruct
	public void intialize() {
		System.out.println("Functionality1 bean created");
	}

	@Override
	public void methord1() {
		System.out.println("Start :: methord1 called from Functionality1");
		rdsDaoHandler.rdsMethod1();
		System.out.println("End :: methord1 called from Functionality1");
		
	}

	@Override
	public void methord2() {
		System.out.println("methord1 called from Functionality1");
		rdsDaoHandler.rdsMethod2();
	}

}
