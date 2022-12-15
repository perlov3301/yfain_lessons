package lesson03;

public class Employee extends Person 
     implements Payable {
  String first;
  String last;
//  String name;
  Employee(String name) {
	  super(name);
  }
  
  public boolean increasePay(int percent) {
	  System.out.println("increasing salary by " + percent +
			  "% " + getName());
	  return true;
  }
  void mdata () {
	  System.out.println("Employee's data: " +
        first + " " + last);
  }
  
}
