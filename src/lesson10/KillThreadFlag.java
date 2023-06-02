 package lesson10;

public class KillThreadFlag {
   public static void main(String args[]) {
	   PortofolioWithFlag p = new PortofolioWithFlag("P data");
	   
	   p.start();
	   //...
	   p.stopMe();
	   // this method won't work if a thread is not
	 // doing any processing, e.g. waits for the user's
	   // input. In such cases use p.interrupt();
   }
}
