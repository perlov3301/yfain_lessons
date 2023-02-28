package lesson07;
import java.util.*;

public class Citerator {
	ArrayList<Customer> customers = new ArrayList<>(10);
   Citerator(){
	   System.out.println("Citerator");
	   Customer cust1 = new Customer("David", "Lee");
	   Customer cust2 = new Customer("Ringo", "Starr");
	   customers.add(cust2);
	   customers.add(cust1);
	   Iterator iCust = customers.iterator();
	   System.out.print("iterator on customers:");
	   while (iCust.hasNext()) {
		   Customer c = (Customer)iCust.next();
		   System.out.print(c.getName()+" ");  
	   }
	   System.out.println("");
   }
}// use foreach instead iterator
