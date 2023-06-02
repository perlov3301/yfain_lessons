package lesson10copy;

public class MarketNews extends Thread {
   MarketNews(String threadName){
	   super(threadName);
	   System.out.println("MarketNews");
   }
   public void run () {
	  System.out.println("The stock market is goes A");
   }
}
