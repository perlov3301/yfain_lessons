package lesson10copy;

import java.util.concurrent.Callable;

public class MarketNewsCallable implements 
   Callable<Integer> {

	@Override
	public Integer call() throws Exception {
		for (int i=0;i<5;i++) {
			Thread.sleep(1000);//sleep for 1sec
			System.out.println("The Market is improving "+i);
		}
		// just return some Number
		return 12345;
	}

}
