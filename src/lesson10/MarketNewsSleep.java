package lesson10;

public class MarketNewsSleep extends Thread {
	int ncycle;
  MarketNewsSleep(String str, int i){
	  super(str);
	  this.ncycle = i;
	  System.out.println("MarketNewsSleep");
  }
  public void run() {
	  try {
		  for (int i=0;i<ncycle;i++) {
			  sleep(1000);//sleep for 1 second
			  System.out.println("MarketNewsSleep:"+
			  " the market is improving"+i );
		  }
	  } catch(InterruptedException e) {
		  System.out.println(Thread.currentThread().getName()
				  +e.toString());
	  }
  }
}
