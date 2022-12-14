package lesson03;

public class Contractor extends Person implements Payable {
	 String first;
	  String last;
	  Contractor(String vf, String vl) {
		  super(vf, vl);
	  }
	  void mdata () {
		  System.out.println("Contractor's data: " +
	        first + " " + last);
	  }
	@Override
	public boolean increasePay(int percent) {
		return true;
	}
}
