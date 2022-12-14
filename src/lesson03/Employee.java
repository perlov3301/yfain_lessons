package lesson03;

public class Employee extends Person 
     implements Payable,Promotionable {
  String first;
  String last;
  Employee(String vf, String vl) {
	  super(vf, vl);
  }
  @Override
  public boolean increasePay(int percent) {
	  return true;
  }
  void mdata () {
	  System.out.println("Employee's data: " +
        first + " " + last);
  }
  
}
