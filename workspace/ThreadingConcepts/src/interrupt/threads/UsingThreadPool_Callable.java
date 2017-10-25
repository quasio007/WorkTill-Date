package interrupt.threads;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class UsingThreadPool_Callable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Started...");
ExecutorService executor  = Executors.newCachedThreadPool();
Future<Void> fut = executor.submit(new Callable<Void>() {

	@Override
	public Void call() throws Exception {
		// TODO Auto-generated method stub
		Random ran =new Random();
		
		for(int i=0; i<1E8;i++){
			if(Thread.currentThread().isInterrupted()){
				System.out.println("Thread Interruped!!!");
				break;
			}
			Math.sin(ran.nextDouble());
		}
		return null;
	}
});
executor.shutdown();
Thread.sleep(1000);
fut.cancel(true);

//executor.shutdownNow();
executor.awaitTermination(1, TimeUnit.MINUTES);
System.out.println("Finished");
	}

}
