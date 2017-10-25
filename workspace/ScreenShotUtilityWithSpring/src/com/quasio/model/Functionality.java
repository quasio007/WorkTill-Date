package com.quasio.model;

import org.springframework.beans.factory.annotation.Autowired;

import com.quasio.model.daohandler.RdsDaoHandler;

public abstract class Functionality implements Model{
	@Autowired
	protected RdsDaoHandler rdsDaoHandler;

	
	private boolean hook1 =true;
	public void execute(String id) {
	initializeValues();
	if(hook1) {
		methord1();
	}
	methord2();
	complete();
}
	
//	Hook methords can be overriden by child classes , by default it's true :
	protected void changeHook1value() {
		
	}
	
//	Abstract methods which class has to implement corresponding to the needs:
	public abstract void methord1();
	public abstract void methord2();

private void complete() {
		System.out.println("Task Completed");
		System.out.println("Shutting Down Application");
//		System.exit(0);
		
	}

private void initializeValues() {
	
	System.out.println("Vlaues initialized");
}
}
