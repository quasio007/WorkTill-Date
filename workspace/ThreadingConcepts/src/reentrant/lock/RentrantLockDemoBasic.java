package reentrant.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RentrantLockDemoBasic {
	private static Lock renLock = new ReentrantLock();
	
	private static int count = 0;

	private  static void increment() {
		for (int i = 0; i < 100000; i++) {
			count++;
		}

	}

	private static void methord1() {
		try {
			renLock.lock();
			increment();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			renLock.unlock();
		}
			
		
	}

	private static void methord2() {
		try {
			Thread.sleep(200);
			renLock.lock();
			increment();
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			renLock.unlock();
		}
	}

	public static void main(String[] args) {
		// RentrantLockDemo ren =new RentrantLockDemo();
		ExecutorService executer = Executors.newCachedThreadPool();
		executer.submit(new Runnable() {

			@Override
			public void run() {
				methord1();
			}
		});
		executer.submit(new Runnable() {

			@Override
			public void run() {
				methord2();
			}
		});

		executer.shutdown();

		while (!executer.isTerminated()) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Waiting for the Process to end...");
			System.out.println();
		}
		System.out.println("Final count is :" + count);

	}

}
