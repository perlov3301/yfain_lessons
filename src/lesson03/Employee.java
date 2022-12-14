package lesson03;

public class Employee extends Person 
     implements Payable,Promotionable {
  String first;
  String last;
  String name;
  Employee(String name) {
	  super(name);
  }
  @Override
  public boolean increasePay(int percent) {
	  return true;
  }
  void mdata () {
	  System.out.println("Employee's data: " +
        first + " " + last);
  }
  public String getName() {
	   return (" Employee's name is " + name);
  }
  
}
