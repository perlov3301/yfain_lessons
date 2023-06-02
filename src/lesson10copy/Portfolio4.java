 package lesson10copy;

public class Portfolio4 extends Thread {
  Portfolio4 (String str){
	  super(str);
  }
  private volatile boolean stopMe = false;
  void stopMe() {// the flag will be arosen
	  stopMe = true; 
  }
  public void run() {
	  while(!stopMe) {
		  try {
			  // processing Portfolio...
			  sleep(100);
		  } catch(InterruptedException e) {
			 System.out.println(
				Thread.currentThread().getName()+e.toString());
		  }
	  }
  }
}
