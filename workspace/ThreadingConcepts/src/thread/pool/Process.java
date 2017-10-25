package thread.pool;

public class Process implements Runnable {
	private int id;
public Process(int id){
	this.id =id;
}
	
	@Override
	public void run() {
		System.out.println("Thread ID : '"+Thread.currentThread().getId()+"' Thread name : '"+Thread.currentThread().getName()+"' Starting ID: "+this.id );
		try {
//			System.out.println("Waiting for 1 sec");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ending ID: "+this.id );
	}



}
