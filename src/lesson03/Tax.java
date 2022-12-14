package lesson03;

public class Tax {
	double grossIncome;
	String state;
	int dep;
	double tax;
	Tax(double v1, String v2, Integer v3) {
		grossIncome = v1;
		state = v2;
		dep = v3;
	}
	double calcTax() {
		if (grossIncome<=50000) { tax = 0.06*grossIncome;}
		else { tax = 0.08*grossIncome; }
		return tax;
	}

}
