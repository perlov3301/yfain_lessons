package lesson10;

public class MarketNews3 extends Thread {
   MarketNews3(String str){
	   super(str);
   }
   public void run() {
	   try {
		   for (int i=0;i<10; i++) {
			   sleep(1000);
			   System.out.println("The market is improving"+1);
		   } 

	   }catch(InterruptedException e ) {
		   String a = Thread.currentThread().getName();
		   System.out.println(a+ e.toString());
	   }
   }
}
