package lesson10copy;

import java.util.concurrent.TimeUnit;
import java.time.*;
import java.time.temporal.Temporal;

public class TestThreadsWait {
	public static void main(String args[]) {
		System.out.println("TestThreadsWait");
		MarketNews3 mn = new MarketNews3("MarketNews3");
		mn.start();
		Portfolio3 p = new Portfolio3("Portfolio3 data");
		p.start();
		LocalDateTime date1;
		LocalDateTime date2;
		Duration duration;
		Duration duration1;
		Object theLockKeeper = new Object();
		synchronized(theLockKeeper) {
		  try {
			System.out.println("Start to wait...");
		//	date1 = LocalDateTime.now(); 
			Temporal t1 = LocalTime.now();
			theLockKeeper.wait(15000);
			//date2 = LocalDateTime.now();
			Temporal t2 = LocalTime.now();
			//duration = Duration.between(date1, date2);
			duration1 = Duration.between(t1, t2);
		//	System.out.println("Stopped to wait after "+duration);
			System.out.println("Duration is "+duration1);
		  } catch(InterruptedException e) {
			 System.out.println("The main thread is interrupted");
		  }
		}
		
		System.out.println(
		  "the main method of TestThreads3 is finished");
	}

}
