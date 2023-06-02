package lesson10copy;

public class MarketNews3Notify extends Thread{
	Object parent =null;
  MarketNews3Notify(String str, 
		  Object caller){
	  super(str);
	  System.out.println("MarketNews3Notify");
	  parent = caller;
  }
  public void run() {
	  try {
		  for(int i=0;i<10;i++) {
			sleep(1000);
	        //parent.setData("the Market news "+i);
			 System.out.println("the Market goes well "+i);
		  } 
  } catch(InterruptedException e) {
	 e.printStackTrace(); 
  }
	  synchronized(parent) {
		parent.notify();  
	  }
}
}
