package lesson10copy;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.Temporal;

public class TestThreadsJoinNotify {
	String MarketNews = null;
	Duration d1 ;// since before start
	Duration d11; // since before wait
   TestThreadsJoinNotify() {
	   System.out.println("TestThreadsJoinNotify with two joined");
	   MarketNews3Notify mn = new MarketNews3Notify("MN3N",this);
	   Portfolio3Notify p = new Portfolio3Notify("P3N", this);
	   Temporal t1 = LocalTime.now();
	   mn.start();
	   p.start();
	  Object theLockKeeper = new Object();
	   synchronized(theLockKeeper) {
		   try {
			   System.out.println("Start to wait");
			   Temporal t11 = LocalTime.now();
			   theLockKeeper.wait(17000);
			   mn.join();
			   p.join();
			   Temporal t2 = LocalTime.now();
			   d1 = Duration.between(t1, t2);
			   d11= Duration.between(t11, t2);
			   System.out.println("d1="+d1);
			   System.out.println("d11="+d11);
			   
		   }catch(InterruptedException e) {
			   e.printStackTrace();
		   }
	   }
	   System.out.println("TestThreadsJoinNotify was ended");
   }
   void setData(String str) {
	   System.out.println(str);
   }
}
