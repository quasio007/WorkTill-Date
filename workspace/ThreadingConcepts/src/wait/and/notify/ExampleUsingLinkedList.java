package wait.and.notify;

import java.util.LinkedList;
import java.util.Random;

public class ExampleUsingLinkedList {
	private  LinkedList<Integer> list = new LinkedList<Integer>();
	private  final int maxLimit = 10;
	private  Object lock = new Object();

	public  void producer() throws Exception {
		int val = 0;
		
		while (true) {
		synchronized (lock) {
			/* Can use any of the 2 functions here:
		1.	while(list.size() ==maxLimit){
				lock.wait();
			}
		2.		if(list.size() ==maxLimit){
					lock.wait();
				}
			*/
			while(list.size() ==maxLimit){
				lock.wait();
			}
				list.add(val);
//				System.out.println("New Element added to the list: "+val+", and current size is: "+list.size());
				lock.notify();
				val++;
			}
		}
		

	}

	public  void consumer() throws Exception {
		Thread.sleep(200);
		Random ran =new Random();
		while (true) {
		synchronized (lock) {
			/* Can use any of the 2 functions here:
		1.	while(list.size()==0){
				lock.wait();
			}
		2.		if(list.size()==0){
					lock.wait();
				}
			*/
	
				
				if(list.size()==0){
					lock.wait();
				}
				int removedElement = list.removeFirst();
//				Thread.sleep(ran.nextInt(1000));
				lock.notify();
				
				System.out.println("Element '"+removedElement+"' removed from list, now the size of list is: "+list.size());
			}
		Thread.sleep(ran.nextInt(1000));
		}

	}

	public static void main(String[] args) throws Exception {
		ExampleUsingLinkedList ex = new ExampleUsingLinkedList();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					ex.producer();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					ex.consumer();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		// Thread t3 = new Thread(new Runnable() {
		//
		// @Override
		// public void run() {
		// // TODO Auto-generated method stub
		//
		// }
		// });

		t1.start();
//		Thread.sleep(1000);
		t2.start();
		// t3.start();

		t1.join();
		t2.join();
		// t3.join();
	}

}
