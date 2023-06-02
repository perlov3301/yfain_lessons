package lesson10copy;

public class ClassB extends Thread {
  ClassA parent = null;
  ClassB(ClassA caller){ // caller=creator of instance
	  System.out.println(
		"ClassB called  by ClassA=will be spown by ClassA"+
	  "ClassB will notify at 'parent'");
	  parent=caller;//store the reference to the caller
  }
  public void run() { 
//get some Data, and,when done, notify the parent
	  parent.setData("Economy is recovering...");
	  //synchronized on 'parent' to notify it
	  synchronized(parent) {
		  parent.notify();//notification of the parent 
	  }
  }
}
