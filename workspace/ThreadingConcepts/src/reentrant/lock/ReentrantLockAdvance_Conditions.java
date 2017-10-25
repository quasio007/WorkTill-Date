package reentrant.lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockAdvance_Conditions {
	private static Lock renLock = new ReentrantLock();
	private static Condition con = renLock.newCondition();
	private static int count = 0;

	private static void increment() {
		for (int i = 0; i < 100000; i++) {
			count++;
		}

	}

	private static void methord1() {
		try {

			renLock.lock();
			System.out.println("Started executing methord1");
			System.out.println("ohh no! Have to wait for methord2 to execute first");
			System.out.println("Waiting starts now...");
			System.out.println();
			con.await();
			System.out.println();
			System.out.println("Controls Received");
			System.out.println("Continuing Execution with Methord1 again");
			increment();
			System.out.println("Count value after Methord 2 is: " + count);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			renLock.unlock();

			System.out.println();
		}

	}

	private static void methord2() {
		try {
			Thread.sleep(200);
			renLock.lock();
			System.out.println("Controls shifted to methord2");
			System.out.println("Started executing methord2");
			increment();
			con.signal();
			System.out.println("Count value after Methord 2 is: " + count);
			System.out.println("Methord2 done and controls released ");
			System.out.println("Passing Controls back to Methord1");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
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
