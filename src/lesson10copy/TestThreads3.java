package lesson10copy;

public class TestThreads3 {
  public static void main(String args[]) {
	  System.out.println("TestThreads3");
	  MarketNews3 mn = new MarketNews3("MarketNews3");
	  mn.start();
	  
	  Portfolio3 p = new Portfolio3("Portfolio3 data");
	  p.start();
	  
	  System.out.println("the main method of TestThreads3 is finished");
	  
  }
}
