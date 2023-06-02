package lesson10;

public class PortofolioWithFlag extends Thread {
	private String name=null;
	private volatile boolean stopMe = false;
   PortofolioWithFlag(String str){ 
	   System.out.println("PortofolioWithFlag");
	   this.name=str;
   }
   public void stopMe() { stopMe=true; }
   public void run() {
	   while(!stopMe) {
		   try {
			   wait(1000);
			   // processing portofolio
		   }catch(InterruptedException e) {
			   String a = Thread.currentThread().getName();
			   System.out.println(a + e.toString());
		   }
	   } 
   }
}
