package volatiile;

public class Myclass extends Thread {
private volatile boolean running =true;

public void shutDown(){
	System.out.println("Name: "+Thread.currentThread().getName());
	System.out.println("ID: "+Thread.currentThread().getId());
//	System.out.println("Priority: "+ Thread.currentThread().getPriority());
	running =false;
}
	@Override
	public void run() {
while(running){
	System.out.println("Name in run: "+Thread.currentThread().getName());
	System.out.println("ID in run: "+Thread.currentThread().getId());
//	System.out.println("Priority in run: "+ Thread.currentThread().getPriority());
	System.out.println("Hello");
	System.out.println();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}


	}

}
