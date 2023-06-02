package lesson10copy;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.Temporal;
import java.util.concurrent.Callable;

public class Cexecutor  implements 
  Callable<Integer>{
	//private String name=null;
	private volatile boolean stopMe = false;
	void stopMe(){
		stopMe=true;
	}
// to overcome drawback of run():cannot return
	@Override
	public Integer call()  {
		System.out.println("Cexecutor");
		Integer a = 3;
		Integer b = 2;
		a = a +b;
		Temporal t1=null;
		Temporal t2 = null;
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		while(!stopMe) {
			t1 = LocalTime.now();
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		if(stopMe) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		Duration d1 = Duration.between(t1, t2);
		System.out.println("Cexecutor;call is ended after "+d1);
		return a;
	}

}
