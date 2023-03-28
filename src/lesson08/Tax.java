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
   static double roundmy(double a, int i) {
	   int j=0;
	   int k = 1;
	   double b=a;
	   while(j<i) {
		   j=j+1;
		   k = k*10;
	   }
	   b = a*k;
	   Long c = Math.round(b);
	   b = c/k;
	   return b;
   }
   Double calcTax(){
	   double t = 0;
	   if (this.state.equals("New York")) {
		   t = 0.1 * this.gross -dependents*0.011*this.gross;
	   } else {
	    t = 0.07 * this.gross -dependents*0.01*this.gross;
	   }
	   double t1 = roundmy(t,2);
	  return t1; 
   }
   
}
