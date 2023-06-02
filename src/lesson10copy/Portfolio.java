package lesson10copy;

public class Portfolio extends Thread {
	  Portfolio(String threadName){
		super(threadName);
		System.out.println("Portfolio");
	}
	  public void run() {
		 System.out.println("You have 500 shares of A");
	  }

}
