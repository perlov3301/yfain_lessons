package lesson10;

public class PortfolioSleep extends
      Thread {
	int ncycle;
   PortfolioSleep(String str, int i){
	   super(str);
	   this.ncycle = i;
	   System.out.println("PortfolioSleep");
   }
   public void run() {
	   try {
		   for(int i=0;i<ncycle;i++) {
			   sleep(700);// sleep for 700ms
			   System.out.println(
			"PortfolioSleep: you have "+(500+i)+"shares");
		   }
	   } catch(InterruptedException e) {
		   System.out.println(Thread.currentThread()+
				   e.toString());
	   }
   }
}
