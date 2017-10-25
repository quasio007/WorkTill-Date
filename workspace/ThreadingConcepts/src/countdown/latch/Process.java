package countdown.latch;

import java.util.concurrent.CountDownLatch;

public class Process implements Runnable {
	private CountDownLatch latch ;
public Process(CountDownLatch latch){
	this.latch =latch;
}
	
	@Override
	public void run() {
		System.out.println("Starting latch: "+latch);
		try {
			System.out.println("Waiting for 1 sec");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(latch.getCount());
		latch.countDown();
		System.out.println(latch.getCount());
		System.out.println("Ending ID: "+latch );
	}



}
