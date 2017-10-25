package extra.practice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadInThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ExecutorService executor =  Executors.newCachedThreadPool();
  System.out.println("Cuttent Thread is (In Main methord) :"+Thread.currentThread().getName());
  executor.submit(new Runnable() {
	
	@Override
	public void run() {
		System.out.println("Cuttent Thread is (In Run methord) :"+Thread.currentThread().getName());
		executor.submit(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Cuttent Thread is (In Run-run methord) :"+Thread.currentThread().getName());
				
				executor.submit(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("Cuttent Thread is (In Run-run-runnn methord) :"+Thread.currentThread().getName());
						executor.shutdown();
					}
				});
			}
		});
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
});
  
	}

}
