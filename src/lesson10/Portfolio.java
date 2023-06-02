package lesson10;

public class Portfolio extends Thread {
    Portfolio(String threadName){
    	super(threadName);
    	System.out.println("Portfolio:extends Thread");
    }
    public void run() {
       System.out.println("  Portfolio:you have 600 shares of IBM");
    }
}
