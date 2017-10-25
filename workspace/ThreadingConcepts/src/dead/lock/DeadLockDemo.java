package dead.lock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockDemo {
	private Accounts act1 = new Accounts();
	private Accounts act2 = new Accounts();
	private Random ran = new Random();
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();

	private void acquireLock(Lock firstLock, Lock secondLock) {
		while (true) {
//			Locks Acquired
			boolean gotFirstLock =false;
			boolean gotSecondLock =false;
			try {
				gotFirstLock =firstLock.tryLock();
				gotSecondLock =secondLock.tryLock();
			} finally {
				if ( gotFirstLock && gotSecondLock) {
					return;
				} 
				if (gotFirstLock) {
					firstLock.unlock();
				}
				if (gotSecondLock) {
					secondLock.unlock();
				}
			}
//			Locks not acquired
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void thread1Methord() {
		acquireLock(lock1, lock2);
		try {

			for (int i = 0; i < 10000; i++) {
				Accounts.transferMoney(act1, act2, ran.nextInt(1000));
			}
		} finally {
			lock1.unlock();
			lock2.unlock();
		}

	}

	public void thread2Methord() {
		acquireLock(lock2, lock1);
		try {
			for (int i = 0; i < 10000; i++) {
				Accounts.transferMoney(act2, act1, ran.nextInt(1000));
			}
		} finally {
			lock1.unlock();
			lock2.unlock();
		}

	}

	public void getFinalBalance() {
		System.out.println("Account1 balance : " + act1.getBalance());
		System.out.println("Account2 balance : " + act2.getBalance());
		System.out.println("Total Balance: " + (act1.getBalance() + act2.getBalance()));
	}
}
