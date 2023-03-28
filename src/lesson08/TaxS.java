package lesson08;

public class TaxS implements java.io.Serializable {
  int gross;
  int dependents;
  String state;
  double taxCalc = 0.0;
  static double roundmy(double a, int i) {
	  int j=0;
	  int k=1;
	  double b =a;
	  while(j<i) {
		  j=j+1;
		  k=k*10;
	  }
	  b = a*k;
	  Long c = Math.round(b);
	  b = c/k;
	  return b;
  }
  double calcTax() {
	  double t=0, t1=0;
	  if (this.state.equals("New York")) {
		  t=0.1 * this.gross-dependents*0.011*this.gross;
	  } else {
		  t = 0.07*this.gross-dependents*0.01*this.gross;
	  }
	  t1 = roundmy(t,2);
	  return t1;
  }
  TaxS(){
	  //this.taxCalc = calcTax();
  }
}
