package lesson07;
import java.util.*;
public class Chashtable {
  Chashtable(){
	  Customer cust = new Customer("David", "Lee");
	  Order ord = new Order(123, 500, "IBM");
	  Portfolio port = new Portfolio(123);
	  // hashtable is synchronized (first thread 
	  // that calls to it will dominate) but slow;
	  // use concurentHashMap or synchronize HashMap
	  Hashtable data = new Hashtable();
	  // below, string is a key (can be any object)
	  data.put("Customer", cust);
	  data.put("Order", ord);
	  data.put("Portfolio", port);
	  
	  //get object by key
	  Order myOrder = (Order) data.get("Order");
  }
}
