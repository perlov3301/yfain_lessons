package lesson10;

import java.util.concurrent.TimeUnit;
public class TestThreadsWait {
	public static void main(String args[]) {
		System.out.println("TestThreadsWait");
		MarketNewsSleep mn = new MarketNewsSleep("MarketNews",3);
		mn.start();
		PortfolioSleep p = new PortfolioSleep("Portfolio data",3);
		p.start();
		
		Object theLockKeeper = new Object();
		synchronized(theLockKeeper) {
			try {
				System.out.println("Starting to wait...");
				theLockKeeper.wait(1500);
			} catch (InterruptedException e) {
				System.out.println("The main thread is interrupted");
			}
		}
		System.out.println("the main method is finished ");
	}

}
