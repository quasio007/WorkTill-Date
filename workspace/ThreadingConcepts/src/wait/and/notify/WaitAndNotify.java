package wait.and.notify;

public class WaitAndNotify {
	private static Object lock =new Object();

private  void producer() throws InterruptedException{
	synchronized (lock) {
//		for(int i=0;i<10;i++){
		System.out.println("Thread Name is: "+Thread.currentThread().getName());
		System.out.println("Producer Thread Running");
/*	Use lock.wait() is using any particular lock
	If using this then just simply use wait() and the same holds true for notify() and notifyAll()
	*/
//		lock.wait(2000);
		Thread.sleep(5000);
		lock.wait();
		System.out.println("Resumed with Thread"+Thread.currentThread().getName());
		lock.notify();
//		}
	}
}
private  void consumer() throws InterruptedException{
	synchronized (lock) {
		
		System.out.println();
		System.out.println("In Consumer and Thread Name is: "+Thread.currentThread().getName());
//		notify();
		lock.notifyAll();
//		notify
		System.out.println("Completing consumer block");
		System.out.println();
	}
}
	public static void main(String[] args) throws Exception {
		WaitAndNotify w =new WaitAndNotify();
		Thread t1 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					w.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					w.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		Thread t3 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					w.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		Thread.sleep(1000);
		t2.start();
		Thread.sleep(1000);
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
	}

}
