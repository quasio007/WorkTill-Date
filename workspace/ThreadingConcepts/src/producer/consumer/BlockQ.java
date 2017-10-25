package producer.consumer;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;;

public class BlockQ {
	private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	private static Random ran = new Random();

	public static void producer() throws Exception {
		while (true) {
			queue.put(ran.nextInt(6));
		}
	}

	public static void consumer() throws Exception {
		while (true) {
			Thread.sleep(500);
			if (ran.nextInt(4) == 3) {
				System.out.println();
				System.out.println("Before :"+queue.size());
				Integer value = queue.take();
				Integer val1= queue.take();
				queue.take();
				queue.take();
				queue.take();
				System.out.println("Taken value is: " + value + " and "+val1+", and Queue size is: " + queue.size());
			}
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					producer();
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
					consumer();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
