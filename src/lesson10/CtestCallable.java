package lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class CtestCallable 
//extends FutureTask<Integer> 
{

	List<java.util.concurrent.Future<Integer>>
	threadResults =new ArrayList<java.util.concurrent.Future<Integer>>();
//	CtestCallable(){
//		super();
//		System.out.println("CtestCallable");
//		threadResults.add(myExecutorService.submit(new PortfolioCallable()));
//		threadResults.add(myExecutorService.submit(new MarketDataCallable));
//		for(Future<Integer> future: threadResults) {
//			future.get();// an equivalent of joining
//		}
//	}
	
}
