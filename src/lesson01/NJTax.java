package lesson01;

public class NJTax extends Tax {
    double tax;
	NJTax(double v, String str, int dep ) {
		super(v, str, dep);
		// TODO Auto-generated constructor stub
	}
	double adjustedForStudents(double stateTax) {
		double adjustedTax = stateTax - 500;
		return adjustedTax;
	}
	// overriding
	public double calcTax() {
	    if (grossIncome<=50000) {
	    	tax = grossIncome * 0.1;
	    } else {
	    	tax = grossIncome * 0.13;
	    }
		return tax;
	}
   
}
