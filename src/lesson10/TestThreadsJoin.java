package lesson10;

public class TestThreadsJoin {
   public static void  main (String args[]) {
	   System.out.println("the main method of TestThreadsJoin"+
          " is started");
	   MarketNewsSleep mn = new MarketNewsSleep("Market News",7);
	   mn.start();
	   
	   PortfolioSleep p = new PortfolioSleep("Portfolio data", 7);
	   p.start();
	   
	   try { // main thread is running while 'mn'&'p' are running
		   mn.join();
		   p.join();
	   } catch (InterruptedException e) {
		   e.printStackTrace();
	   }
	   System.out.println("The main method of TestThreadsJoin"+
	      " is finished");
   }
}
