package lesson10;

public class MarketNews2 implements 
  Runnable {
	MarketNews2(){
		System.out.println("MarketNews2:implementes Runnable");
	}
   public void run() {
	   System.out.println(
			" MarketNews2:The stock Market2 is improving ");
   }
}
