package lesson01;

public class Tax {
  double grossIncome;
  double tax;
  String state;
  int dependents;
  Tax(double v) {
	  grossIncome = v;
  }
  public double calcTax() {
	  if (grossIncome<=50000) {
		  tax = 0.06 * grossIncome;
	  } 
	  else {
		  tax = 0.08 * grossIncome;
	  }
	return tax;
  }
}
