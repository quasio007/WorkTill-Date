package semaphore.demo;

import java.util.concurrent.Semaphore;

public class Connections {
	private static Connections instance =new Connections();
	private int count =0;
	private Semaphore sem =new Semaphore(12,true);
	
	private Connections(){
		
	}

public static Connections getInstance(){
	return instance;
}
public void connect(){
	
	try {
		sem.acquire();
		doConnect();
	} catch (Exception e) {
		// TODO: handle exception
	}
	finally {
		sem.release();
	}
}

public void doConnect(){
	synchronized (this) {
		count++;
		System.out.println("Current connections (max 12 allowed): " + count);
	}
	try {
//		System.out.println("Working on connections " + Thread.currentThread().getName());
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
synchronized (this) {
		count--;
		
//		System.out.println("I'm done " + Thread.currentThread().getName() + " Connection is released , connection count: " + count);
	}
}
public void finalCount(){
	System.out.println("Final count is: "+count);
}





}
