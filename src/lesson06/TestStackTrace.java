package lesson06;

public class TestStackTrace {
	TestStackTrace(){
		   System.out.println("TestSTCKtRACE");
		   try {
			   divideByZero();
		   } catch(ArithmeticException e) {
			   System.out.println("some one divided by zero");
		   }
//		   divideByZero();
	}
	int divideByZero() {
		return 25/0;
	}
}
