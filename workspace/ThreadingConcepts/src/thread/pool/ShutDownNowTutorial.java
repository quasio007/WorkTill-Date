package thread.pool;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ShutDownNowTutorial {
	
	 
	public static void main(String[] args) {
		
	
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		for (int i = 0; i < 5; i++) {
			executor.submit(new Process(i));
		}
		List<Runnable> r=executor.shutdownNow();
		for(Runnable run:r){
			System.out.println("Id's are: "+run);
		}
	}

}