package join.synchronised.methord;

public class Demo {
	private static int count = 0;
	private static synchronized void countIncrement(){
//		System.out.println("ID in count: "+Thread.currentThread().getId());
//		System.out.println("Priority in count: "+ Thread.currentThread().getPriority());
		count++;
	}
	private static  void loop() {
		for (int i = 0; i < 10000; i++) {
		
//			System.out.println("ID in loop: "+Thread.currentThread().getId());
//			System.out.println("Priority in loop: "+ Thread.currentThread().getPriority());
			countIncrement();
			// System.out.println(Thread.currentThread().getId()+"Value: "+i);
		}
	}

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				loop();

			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				loop();

			}
		});
		
		t1.start();
		t2.start();
	
		t1.join();
		t2.join();
		
		System.out.println("Count Value :" + count);
	}

}

/*
  One way to do it::
 
t1.start();
t1.join();
t2.start();
t2.join();

*/