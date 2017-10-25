package thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class IsTerminatedTutorial {
	private static double startTime,endTime;
	 
	public static void main(String[] args) {
		
	
		ExecutorService executor = Executors.newFixedThreadPool(2);
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 5; i++) {
			executor.submit(new Process(i));
		}
		executor.shutdown();
		
		System.out.println("Task submitted Successfull");
		while(!executor.isTerminated()){
			System.out.println("Task Going on");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
			}
		}
		System.out.println("");
		if(executor.isTerminated()){
		endTime = System.currentTimeMillis();
		System.out.println("Task completed Successfull");
		System.out.println("Total time taken: "+((endTime-startTime)/(1000))+" sec");	
		}else{
			System.out.println("Task not completed till now");
		}
	

	}

}