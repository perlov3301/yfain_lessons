package lesson02cmd;

public class TaxPropr {
	protected double grossIncome;
	String state;
	int dep;
	double tax;
	public double calcTax() {
		if (grossIncome<=50000) {
			tax = 0.06 * grossIncome;
		} else { tax = 0.08*grossIncome; }
		return tax;
	}
   void mydata () {
	   calcTax();
	   System.out.println("Tax is " + tax);
   }
}
