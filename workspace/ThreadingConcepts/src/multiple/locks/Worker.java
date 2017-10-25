package multiple.locks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {
	private Random ran = new Random();
	private List<Integer> l1 = new ArrayList<Integer>();
	private List<Integer> l2 = new ArrayList<Integer>();
	
	private Object lock1 =new Object();
	private Object lock2 =new Object();

	private  void elementTol1()  {
		synchronized (lock1) {
			try {
//				System.out.println("Name in loop1: "+Thread.currentThread().getName());
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l1.add(ran.nextInt(100));
		}
		
	}

	private  void elementTol2()  {
		synchronized (lock2) {
			try {
//				System.out.println("Name in loop1: "+Thread.currentThread().getName());
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			l2.add(ran.nextInt(100));
		}
		
	}
	
	private  void addElements() {
		for(int i=0;i<1000;i++){
			elementTol1();
			elementTol2();
		}
	}

	public  void main(){
		double startTime,endTime;
		System.out.println("Starting the process...");
		startTime =System.currentTimeMillis();
//		  addElements();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				addElements();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				addElements();
			}
		});
//
		t1.start();
		t2.start();
//
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		endTime =System.currentTimeMillis();
		System.out.println("Total time taken: "+(endTime-startTime));
		System.out.println("List1 Size: "+l1.size() +"; List2 Size: "+l2.size());

	}

}
