package lesson01;

public class NJTax extends Tax {

	NJTax(double v) {
		super(v);
		// TODO Auto-generated constructor stub
	}
	double adjustedForStudents(double stateTax) {
		double adjustedTax = stateTax - 500;
		return adjustedTax;
	}
   
}
