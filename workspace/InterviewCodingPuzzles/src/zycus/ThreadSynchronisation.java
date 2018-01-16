package zycus;

public class ThreadSynchronisation {

	public static void main(String[] args) {
		Test test1 =new Test();
		Test test2 =new Test();
		
Thread t1 =new Thread(new Runnable() {
	
	@Override
	public void run() {
		Test.m1();
		
	}
});
Thread t2 =new Thread(new Runnable() {
	
	@Override
	public void run() {
		Test.m2();
		
	}
});
Thread t3 =new Thread(new Runnable() {
	
	@Override
	public void run() {
		test1.m3();
		
	}
});
Thread t4 =new Thread(new Runnable() {
	
	@Override
	public void run() {
		test2.m4();
		
	}
});

t1.start();
t2.start();
t3.start();
t4.start();
	}

}

class Test{
	public static synchronized void m1() {
		System.out.println("Starting m1");
		try {
			Thread.sleep(5000);
			}catch(Exception e) {}
		System.out.println("Completing m1");
	}
	
	public static synchronized void m2(){
		System.out.println("Starting m2");
		try {
			Thread.sleep(5000);
			}catch(Exception e) {}
		System.out.println("Completing m2");
	}
	
	public synchronized void m3() {
		System.out.println("Starting m3");
		try {
			Thread.sleep(5000);
			}catch(Exception e) {}
		System.out.println("Completing m3");
	}
	
	public synchronized void m4(){
		System.out.println("Starting m4");
		try {
			Thread.sleep(5000);
			}catch(Exception e) {}
		System.out.println("Completing m4");
	}
}
