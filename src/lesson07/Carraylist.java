package lesson07;

import java.util.*;

public class Carraylist {
   Carraylist(){
	   // default number of memebers is 10
	   // ArrayList<Customer> customers = new ArrayList<>(10);
	   ArrayList customers = new ArrayList();
	   // instances of Customer object
	   Customer cust1 = new Customer("David", "Lee");
	   Customer cust2 = new Customer("Ringo", "Starr");
	   Order ord = new Order(123, 500, "IBM"); 
	   // adding memory addresses of objects 
	   // = Customer instances to ArrayList
	   customers.add(cust1);
	   customers.add(cust2);
	   //customers.add(ord);
	   
	   int totalElem = customers.size();
	   System.out.print("Carraylist; customers: ");
	   for(int i = 0; i<totalElem;i++) {
		  try {
			  Customer current = (Customer) customers.get(i);
			  if (i==0) {
				   System.out.print(current.getName());
			   } else {
				   System.out.print(","+current.getName());
			   }
		  } catch(Exception e) {
			  System.out.println("\n"+e.getMessage().toString() );
		  }
		   
	   }
	   
	   
   }
}
