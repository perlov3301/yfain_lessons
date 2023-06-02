package lesson10copy;

public class TestThreads {
   public static void main (String args[]) {
	   System.out.println("TestThreads");
	   MarketNews mn = new MarketNews("MaketNews");
	   mn.start();
	   
	   Portfolio p = new Portfolio("Portfolio data");
	   p.start();
	   
	   System.out.println("TestThreads is finished");
   }
}
