package com.quasio.model.daohandler;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.quasio.model.Model;
import com.quasio.model.event.ModelEvent;
@Component
@Lazy
public class RdsDaoHandler implements Model{
	@PostConstruct
	public void intialize() {
		System.out.println("RdsDaoHandler bean created");
	}
	
	public void rdsMethod1() {
		System.out.println("Starts :: Rds Methord Called\n");
	try {
		m1();
		Thread.sleep(1000);
		m2();
		Thread.sleep(1000);
		m3();
		Thread.sleep(1000);
		m4();
		Thread.sleep(1000);
		m5();
	} catch (Exception e) {
		// TODO: handle exception
	}
		System.out.println("\nEnds :: Rds Methord Called");
		
	}
	
	public void rdsMethod2() {
		System.out.println("Starts :: Rds Methord Called\n");
	try {
		m1();
		Thread.sleep(1000);
		m2();
		Thread.sleep(1000);
		m3();
		Thread.sleep(1000);
		m4();
		Thread.sleep(1000);
		m5();
	} catch (Exception e) {
		// TODO: handle exception
	}
		System.out.println("\nEnds :: Rds Methord Called");
		
	}
	
	void m1() {
		fireEvent(new ModelEvent(this, "Check0"));
	}
	void m2() {
		fireEvent(new ModelEvent(this, "Check1"));
	}
	void m3() {
		fireEvent(new ModelEvent(this, "Check2"));
	}
	void m4() {
		fireEvent(new ModelEvent(this, "Check3"));
	}
	void m5() {
		fireEvent(new ModelEvent(this, "Check4"));
	}
}
