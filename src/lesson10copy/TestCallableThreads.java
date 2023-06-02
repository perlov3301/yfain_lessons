package lesson10copy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TestCallableThreads 
   implements Future 
   {  // java8 introduced CompletableFuture : asynchronious
	  // http://www.nurkiewicz.com/2013/05/java-8-definitive-
	  // -guide-to.html
	
  public static void main(String args[]) 
     throws InterruptedException, ExecutionException{
	  // a Placeholder for Future object result of Thread doings
	  List<Future<Integer>> futures = new ArrayList<Future<Integer>>();
	  // a Placeholder for results
	  List<Integer> results = new ArrayList<Integer>();
	  
	  final ExecutorService service = 
			  Executors.newFixedThreadPool(3);// pool of 3 threads
	  
	  try {
		  futures.add(service.submit(new PortfolioCallable()));
		  System.out.println("test; Portfolio submitted");
		  futures.add(service.submit(new MarketNewsCallable()));
		  System.out.println("test; MarketNews submitted");
		  for (Future<Integer> future : futures) {
			  System.out.println("test future:"+future);
			  int a = future.get();//an Equivalent of joining
			  results.add(a);
		  }
	  } finally {
		  service.shutdown();
		  System.out.println("test;service shutdowned");
	  }
	  for (Integer res: results) {
		  System.out.println("\nGot the result: "+res);
	  }
	  System.out.println("the main method is finished");
  }

@Override
public boolean cancel(boolean mayInterruptIfRunning) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isCancelled() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isDone() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public Object get() throws InterruptedException, ExecutionException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
	// TODO Auto-generated method stub
	return null;
}
}
