package lesson10;

public class TestThreads {
   public static void main (String args[]) {
	   MarketNews mn = new MarketNews("MarketNews");
	   mn.start();
	   Portfolio p = new Portfolio("Portfolio Data");
	   p.start();
	   System.out.println("TestThreads is finished");
	   }
}
