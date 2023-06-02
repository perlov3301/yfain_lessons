package lesson10copy;

public class ClassA {
	ClassA(){
		System.out.println(
		"ClassA=parent.ClassA will cal to ClassB."+
		"Read about 'Condition' interface");
		
	}
   String marketNews =null;
   void someMethod() {
   //the ClassB needs a reference to the locked parent
   // object(ClassA) to be able to notify it
	   ClassB myB = new ClassB(this);
	   myB.start();
	// synchronized on this(ClassA) to await to data 
	// from ClassB and then to be notified from ClassB
	   synchronized(this) { 
	// if more than one ClassA exists we using notifyAll()
		   try {
			   wait();
		   } catch(InterruptedException e) {
			   System.out.println(
				Thread.currentThread().getName()+e.toString());
		   }
	   }
	  // some further processing of the MarketData
	  // goes here
   }
   
   void setData(String news) {
	   marketNews=news;
   }
}
