package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AwaitTerminationTutorial {
	private static double startTime,endTime;
	 
	public static void main(String[] args) {
		
	
		ExecutorService executor = Executors.newFixedThreadPool(5);
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			executor.submit(new Process(i));
		}
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
