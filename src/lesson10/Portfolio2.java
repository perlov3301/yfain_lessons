package lesson10;

public class Portfolio2 implements
     Runnable {
	Portfolio2(){
		System.out.println("Portfolio2:implements Runnable");
	}
   public void run() {
	   System.out.println(
		 " Portfolio2:you have another 100 shares of IBM");
   }
}
