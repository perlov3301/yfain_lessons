package lesson10copy;

public class MarketNews3 extends Thread {
   MarketNews3(String str){
	   super(str);
	   System.out.println("MarketNews3");
   }
   public void run() {
	   try {
		   for(int i=0;i<10;i++) {
			  sleep(1000);
			  System.out.println("the market is goes"+i);
		   }
	   } catch(InterruptedException e) {
		   System.out.println(
		    Thread.currentThread().getName()+e.toString());
	   }
   }
}
