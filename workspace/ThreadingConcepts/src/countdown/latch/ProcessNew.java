package countdown.latch;

public class ProcessNew implements Runnable {
	private int id;
public ProcessNew(int id){
	this.id =id;
}
	
	@Override
	public void run() {
		System.out.println("Starting ID: "+this.id );
		try {
			System.out.println("Waiting for 1 sec");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ending ID: "+this.id );
	}



}
