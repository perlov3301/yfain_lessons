package lesson06;

public class TestStackTrace2 {
   TestStackTrace2(){
	   System.out.println("TestStackTrace2");
	   try {
		   divideByZero();
		   } catch (ArithmeticException e) {
			   System.out.println("don't divide by zero");
		   }
	   }
   int divideByZero() {
	   return 25/0;
   }
}
