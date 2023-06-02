package lesson10;

public class CputNotification extends Thread {
	CwaitforNotification parent = null;
	
   CputNotification(CwaitforNotification caller){
	   System.out.println("CputNotification");
	   parent = caller;// reference to the caller
   }
     public void run() {
    // get data, then notify the parent
    	parent.setData("Economy is recovering");
    // ...
    	synchronized(parent) {
    		parent.notify();// notification of the caller
    	}
   }
}
