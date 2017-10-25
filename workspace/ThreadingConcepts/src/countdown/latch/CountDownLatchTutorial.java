package countdown.latch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatchTutorial {
	private static double startTime,endTime;
	 
	public static void main(String[] args) {
		CountDownLatch latch =new CountDownLatch(2);
	
		ExecutorService executor = Executors.newFixedThreadPool(3);
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 2; i++) {
			executor.submit(new Process(latch));
		}
		try {
			latch.await();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Check Point1");
		executor.shutdown();
		System.out.println("Task submitted Successfull");
		try {
			executor.awaitTermination(1, TimeUnit.MINUTES);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		endTime = System.currentTimeMillis();
		System.out.println("Task completed Successfull");
		System.out.println("Total time taken: "+((endTime-startTime)/(1000))+" sec");

	}

}
