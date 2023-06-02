package lesson10;

public class Lesson10 {

	public static void main(String[] args) {
      System.out.println("Lesson10"); 
      MarketNews mn = new MarketNews("MarketNews");
      mn.start();
      try {
    	  Thread.sleep(30);
      } catch(InterruptedException e) {
    	  System.out.println(
    		Thread.currentThread()+e.toString());
      }
      Portfolio p = new Portfolio("Portfolio data");
      p.start();
      System.out.println("test of Threads finished");
      MarketNews2 mn2 = new MarketNews2();
      Thread mn21 = new Thread(mn2, "Market News2");
      mn21.start();
      
      Runnable port2 = new Portfolio2();
      Thread p21 = new Thread(port2, "Portfolio Data2");
      p21.start();
      System.out.println("test2 of Threads finished");
      int ncycle = 3;
      MarketNewsSleep mnsleep = new MarketNewsSleep("MarketNewsSleep",ncycle);
      mnsleep.start();
      PortfolioSleep psleep = new PortfolioSleep("PortfolioSleep",ncycle);
      psleep.start();
      System.out.println("test of Thread with sleeping finished");
	}

}
