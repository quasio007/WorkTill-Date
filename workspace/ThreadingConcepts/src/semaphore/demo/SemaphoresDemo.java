package semaphore.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SemaphoresDemo {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newCachedThreadPool();
		for (int i = 0; i < 30; i++) {
			executor.submit(new Runnable() {

				
				public void run() {
					Connections.getInstance().connect();

				}
			});
		}
			executor.shutdown();
			try {
				executor.awaitTermination(1, TimeUnit.HOURS);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Connections.getInstance().finalCount();
			
		
	}
}
