package lesson05;

public class Tax {
	double grossIncome;
	int dependents;
	String state;
	Tax(int a, String b, double c){
		this.dependents = a;
		this.state = b;
		this.grossIncome = c;
	}
	
	double calcStateTax() {
		int newCode;
		double mytax;
		TaxOptimizer tOpt = new TaxOptimizer();
		newCode =  tOpt.optimize(grossIncome, dependents);
		return 0;
	}
	public TaxOptimizer getTaxOptimizer() { return new TaxOptimizer(); }
	
	class TaxOptimizer {
		int taxCode; 
		
		void setTaxCode(int tCode) {taxCode = tCode;}
		int optimize(double grossIncome, int dep) {return 0;}
	}

}
