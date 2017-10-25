package dead.lock;

public class Runner {

	public static void main(String[] args) throws Exception {
		System.out.println("Starting process...");
		System.out.println();
		DeadLockDemo deadLock =new DeadLockDemo();
		Thread t1 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				deadLock.thread1Methord();
			}
		});
		Thread t2 =new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				deadLock.thread2Methord();
			}
		});
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		deadLock.getFinalBalance();

	}

}
