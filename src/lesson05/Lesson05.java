package lesson05;

public class Lesson05 {

	public static void main(String[] args) {
      System.out.println("lesson05");
      new CgridbagListener();
      //new WindowEventDemo("windoweventDemo");
      //new CjavapointWindowListener();
      Tax t = new Tax(2, "NY", 50000);
      Tax.TaxOptimizer tOptimizer = t.getTaxOptimizer();
      tOptimizer.setTaxCode(123 );
	}

}
