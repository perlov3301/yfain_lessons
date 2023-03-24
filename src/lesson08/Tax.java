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
   Double calcTax(){
	   double t = 0;
	   if (this.state.equals("New York")) {
		   t = 0.1 * this.gross -dependents*0.011*this.gross;
	   } else {
	    t = 0.07 * this.gross -dependents*0.01*this.gross;
	   }
	  return t; 
   }
   
}
