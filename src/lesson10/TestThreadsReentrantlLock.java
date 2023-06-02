package lesson10;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TestThreadsReentrantlLock {
	public static void main(String args[]) {
		System.out.println("TestThreadsReentrantlLock");
		
		MarketNewsSleep mn = new MarketNewsSleep("MarketNews",5);
		mn.start();
		
		PortfolioSleep p = new PortfolioSleep("Portfolio data", 5);
		p.start();
		
		ReentrantLock theLock = new ReentrantLock();
		final Condition notDone = theLock.newCondition();
		
		theLock.lock();
		try {
			System.out.println(" Starting to wait...");
			notDone.await(15, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			System.out.println("The main thread is interrupted");
		}
		
		theLock.unlock();
		
		System.out.println("The main void of TestThread is finished");
	}

}
