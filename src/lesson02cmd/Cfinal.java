package lesson02cmd;

public class Cfinal {
	static  final int BOILING = 212;
  static final double convertFC(double far) {
	  double vc;
	  vc = (far-32)*5/9;
	  double vt = vc*100;
	  vc = Math.round(vt);
	  vc = vc/100;
	  return vc;
  }
  void ffinal() {
	  System.out.println("final method can not be overriden"
	  		+ "  ; final class can't be extended; "
	  		+ "  final variable can be assigned only once");
  }
}
