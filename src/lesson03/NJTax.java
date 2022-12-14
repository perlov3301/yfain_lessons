package lesson03;

public class NJTax extends Tax {
	double grossIncome;
	String state;
	int dep;
	double tax;
	NJTax(double v1, Integer v3) {
		super(v1, "NJ" , v3);
//		grossIncome = v1;
//		state = "NJ";
//		dep = v3;
	}
	double calcTax() {
		if (grossIncome<=50000) { tax = 0.1*grossIncome;}
		else { tax = 0.12*grossIncome; }
		return tax;
	}
	double calcTotal() {
		tax = calcTax() - 500;
		return tax;
	}
}
