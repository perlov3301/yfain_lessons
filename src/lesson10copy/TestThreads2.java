package lesson10copy;

public class TestThreads2 {
public static void main (String args[]) {
	System.out.println("TestThreads2");
	MarketNews2 mn2 = new MarketNews2();
	Thread mn = new Thread(mn2,"Market Data");
	mn.start();
	
	Portfolio2 p2 = new Portfolio2();
	Thread p = new Thread(p2, "Portfolio Data");
	p.start();
	
	System.out.println("TestThreads2 is finished");
}

}
