package lesson10;

import java.util.concurrent.Callable;

public class PortfolioCallable implements Callable<Integer> {
  public Integer call() {
	  int a = 1 +2/3;
	  return a;
  }
}
