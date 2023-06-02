package lesson10copy;

public class Portfolio3 extends Thread {
   Portfolio3(String str){
	   super(str);
	   System.out.println("Portfolio3");
   }
   public void run() {
	   try {
		   for(int i=0;i<10;i++) {
			   sleep(700  );// sleep for 700mlsec
			   System.out.println("You have"+(500+i)+
					   " shares of IBM");
		   } 
	   }catch(InterruptedException e) {
		   System.out.println(
			 Thread.currentThread().getName()+e.toString());
	   }
   }
}
