package lesson10copy;

public class KillTheThread {
   public static void main(String args[]) {
	   System.out.println("KillTheThread;main");
	   Portfolio4 p = new Portfolio4("Portfolio4 data");
	   p.start();
	   // some code goes here
	   //...
	   // and now it's time to kill the thread
	   p.stopMe();
	//if a thread is not doing any processing,e.g.waits
	   // use p.iterrupt();
   }
}
