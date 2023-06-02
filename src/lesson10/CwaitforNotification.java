package lesson10;

public class CwaitforNotification  {
	String marketNews = null;
	   CwaitforNotification(){
	   System.out.println("CwaitforNotification");
   }
   /**
    Wakes up a single thread that is waiting on this object'smonitor. If any threads are waiting on this object, one of themis chosen to be awakened. The choice is arbitrary and occurs atthe discretion of the implementation. A thread waits on an object'smonitor by calling one of the wait methods. 
The awakened thread will not be able to proceed until the currentthread relinquishes the lock on this object. The awakened thread willcompete in the usual manner with any other threads that might beactively competing to synchronize on this object; for example, theawakened thread enjoys no reliable privilege or disadvantage in beingthe next thread to lock this object. 
This method should only be called by a thread that is the ownerof this object's monitor.
 A thread becomes the owner of theobject's monitor in one of three ways: 
•By executing a synchronized instance method of that object. 
•By executing the body of a synchronized statementthat synchronizes on the object. 
•For objects of type Class, by executing asynchronized static method of that class. 

Only one thread at a time can own an object's monitor.

    */
   void getNotification() {
	   // CputNotification.class needs a reference to
	   // the locked object to be able to notify it
	   CputNotification myB = new CputNotification(this);
	   myB.start();
	   synchronized(this) {
		   try {
			   wait();
		   } catch(InterruptedException e) {
			   String a = Thread.currentThread().getName();
			   System.out.println(a+e.toString());
		   }
	   }
	   System.out.println("the Thread was awakened ");
	   // some further processing of the MarketData goes here
   }
   public void setData(String news) {
	   marketNews = news;
   }
}
