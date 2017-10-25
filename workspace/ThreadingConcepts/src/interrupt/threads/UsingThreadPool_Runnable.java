package interrupt.threads;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UsingThreadPool_Runnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Started...");
ExecutorService executor  = Executors.newCachedThreadPool();
executor.submit(new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Random ran =new Random();
		for(int i=0; i<1E8;i++){
			if(Thread.currentThread().isInterrupted()){
				System.out.println("Thread Interruped!!!");
				break;
			}
			Math.sin(ran.nextDouble());
		}
	}
});

executor.shutdown();
Thread.sleep(1000);
executor.shutdownNow();
executor.awaitTermination(1, TimeUnit.MINUTES);
System.out.println("Finished");
	}

}
