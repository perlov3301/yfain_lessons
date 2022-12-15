package lesson03;

public class Contractor extends Person implements Payable {
	 String first;
	  String last;
//	  String name;
	  Contractor(String name) {
		  super(name);
	  }
	  void mdata () {
		  System.out.println("Contractor's data: " +
	        first + " " + last);
	  }
	
	public boolean increasePay(int percent) {
		if(percent < Payable.INCREASE_CAP)   {
			System.out.println("Increasing hourly rate by " +
		percent + "%. " + getName());
			return true;
		} else {
			System.out.println("Sorry, can't increase hourly rate" +
		    " more than " + Payable.INCREASE_CAP);
			return false;
		}
//		return true;
	}
}
