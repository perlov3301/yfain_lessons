package lesson10copy;

public class Portfolio3Notify extends Thread{
  Object parent = null;
  Portfolio3Notify(String str,
		  Object caller){
	 super(str);
	 System.out.println("P3Notify");
	 parent = caller;
	 
  }
  public void run() {
	  try {
		  for(int i=0;i<10;i++) {
			 sleep(700);
			 System.out.println("IBM shares "+i);
		    // parent.setData("IBM shares"+i);
		  }
	  } catch (InterruptedException e) {
		  e.printStackTrace();
	  }
	  synchronized(parent) {
		  parent.notify();
	  }
  }
}
