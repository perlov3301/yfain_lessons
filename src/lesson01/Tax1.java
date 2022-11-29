package lesson01;

public class Tax1 {
	double a, b;
	public double order(double b) {
		if (b<=200) {
			 a = b*0.3;
		} 
		else if (b>200 && b<=400) {
			a = b*0.35;
		} 
		else { a = b*0.38;}
		return a;
	}
}
