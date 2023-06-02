package lesson10copy;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.Temporal;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class TheReentrantLock {
	void setData(String str) {
		System.out.println(str);
	}
 public static void main(String args[]) {
	 System.out.println("TheReentrantLock");
	 String MarketNews = null;
	  MarketNews3 mn = new MarketNews3("MN3N");
	  Portfolio3 p = new Portfolio3("P3");
	  Duration d1;
	  Duration d11;
	  Temporal t1 = LocalTime.now();
	  Temporal t11 = null;
	  mn.start();
	  p.start();
/**	  Object theLockKeeper = new Object();
	  synchronized (theLockKeeper) {
		  try {
			  System.out.println("start to wait");
			  Temporal t11 = LocalTime.now();
			  the
		  }
	  }
	*/ // synchronized/wait with Condition/await
	  ReentrantLock theLock = new ReentrantLock();
	  final Condition notDone = theLock.newCondition();
	  
	  theLock.lock();
	  try {
		  System.out.println("Is starting to wait...");
		  
		  t11 = LocalTime.now();
		  notDone.await(15, TimeUnit.SECONDS);
	  } catch (InterruptedException e) {
		  System.out.println("the main Thread is interrupted");
	  }
	  theLock.unlock();
	  Temporal t2 = LocalTime.now();
	  d1 = Duration.between(t1, t2);
	  d11 = Duration.between(t11,t2);
	  System.out.println("main Thread is finished after "+d1);
	  System.out.println("Awaiting was "+d11);
  }
}
