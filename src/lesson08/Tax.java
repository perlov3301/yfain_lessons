package lesson08;

public class Tax {
	int gross;
	int dependents;
	String state;
	Tax(int dep, String st, int gr) {
		this.gross = gr;
		this.dependents = dep;
		this.state = st;
	}
	double roundtwo(double a) {
		double b = a*100;
		Long c = Math.round(b);
		b = c/100;
		return b;
	}
   Double calcTax(){
	   double t = 0;
	   if (this.state.equals("New York")) {
		   t = 0.1 * this.gross -dependents*0.011*this.gross;
	   } else {
	    t = 0.07 * this.gross -dependents*0.01*this.gross;
	   }
	   double t1 = roundtwo(t);
	  return t1; 
   }
   
}
