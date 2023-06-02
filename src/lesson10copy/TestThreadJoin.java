package lesson10copy;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.Temporal;

public class TestThreadJoin {
  public static void main(String args[]) {
	  System.out.println("TestThreadJoin");
	  MarketNews3 mn = new MarketNews3("MN");
	  Portfolio3 p = new Portfolio3("P");
	  Temporal t1 = LocalTime.now();
	  Temporal t11 = null;
	  mn.start();
	  p.start();
	  try {
		  //mn.join();
		  p.join();
		  t11 = LocalTime.now();
	  } catch(InterruptedException e) {
		  e.printStackTrace();
	  }
	  Temporal t2 = LocalTime.now();
	  Duration d1 = Duration.between(t1, t2);
	  Duration d11 = Duration.between(t11, t2);
	  System.out.println(
		"The main method of TestThreadJoin is finished after brutto "
			  + d1+" netto="+d11);
  }
}
