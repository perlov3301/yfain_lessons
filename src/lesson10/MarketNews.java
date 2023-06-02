package lesson10;

public class MarketNews extends Thread {
   MarketNews(String threadName){
	   super(threadName);
	   System.out.println("MarketNews:extends Thread");
   }
   public void run() {
	   System.out.println("  MarketNews:the StockMaret is improving");
   }
}
