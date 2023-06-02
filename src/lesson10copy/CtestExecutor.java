package lesson10copy;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CtestExecutor implements Future  {
   public static void main(String args[]) {
	   System.out.println("CtestExecutor");
	   Temporal t1=null;
	   Temporal t11 = null;
	   Temporal t2 = null;
	   Duration d1;
	   Duration d11;
	   Cexecutor cex = new Cexecutor();
	   // instance of Future Object
	   List <Future<Integer>> threadResults = new ArrayList<Future<Integer>>();
	   ExecutorService myExecutorService =
			   Executors.newFixedThreadPool(3);
	   // Callable<T>:Future
	   //Executors.newFixedThreadPool(3).submit(Callable<T>);
	   t1=LocalTime.now();
	   threadResults.add(myExecutorService.submit(new Cexecutor()));
	   //threadResults.add(myExecutorService.submit(new Portfolio()));
	   //threadResults.add(myExecutorService.submit(new MaketData()));
	   //wait for threads to complete like case of 'join' method
	   for(Future<Integer> future:threadResults) {
		   try {
			   future.get();// an equivalent of joining
		   } catch(ExecutionException e) {
			   e.printStackTrace();
		   } catch(InterruptedException e1) {
			   e1.printStackTrace();
		   } finally {
			   myExecutorService.shutdown();
		   }
	   }
	   myExecutorService.shutdown();
	   
	   t11 = LocalTime.now();
	   //cex.start();
      // cex.interrupted();
	   t2=LocalTime.now();
	   d1 = Duration.between(t1,t2);
	   d11 = Duration.between(t11,t2);
	   System.out.println(
			   "CtestExcecutor is finished "+d11+" "+d1);
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
