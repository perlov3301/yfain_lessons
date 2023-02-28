package lesson07;

import java.util.ArrayList;
// alt+shift+Q, P
public class Cgeneric {
	ArrayList<Customer> customers;
  Cgeneric(){
	  System.out.println("Generic type is the one " + 
        "that can have parameters");
	  customers = new ArrayList<>(); 
	  Customer cust1 = new Customer("David", "Lee");
	  customers.add(cust1);
	  Customer cust2 = new Customer("Ringo", "Starr");
	  customers.add(cust2);
	  Order ord1 = new Order(123,500,"IBM");
	  //customers.add(ord1); // compiler error 
	  // Iterating parameterized ArrayList without casting
	  // from object to Customer
	  System.out.print("iterating customers without "+
	  "need to cast:\n");
	  int iafter=0;
	  for (Customer c:customers) {
		  if (iafter==0) {
		  System.out.print(" Customer " + c.getName());
		  iafter =1;} else {
			  System.out.print(", Customer " + c.getName());
		  }
			
	  }
	  System.out.println("");
  }
}
