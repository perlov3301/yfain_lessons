package lesson02cmd;

public class Tax {
	double grossIncome;
	String state;
	int dep;
	double tax;
	Tax(double vg, String vs, int vd){
		grossIncome = vg;
		state = vs;
		dep = vd;
	}
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
