package lesson03;

public class Contractor extends Person implements Payable {
	 String first;
	  String last;
	  String name;
	  Contractor(String name) {
		  super(name);
	  }
	  void mdata () {
		  System.out.println("Contractor's data: " +
	        first + " " + last);
	  }
	  public String getName() {
		   return (" Contractor's name is " + name);
	   }
	@Override
	public boolean increasePay(int percent) {
		return true;
	}
}
