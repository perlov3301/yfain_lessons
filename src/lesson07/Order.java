package lesson07;

public class Order {
  private int quantity;
  private double cost;
  private String firm;
  Order(int q, double c, String f) {
	  this.quantity=q;
	  this.cost = c;
	  this.firm = f;
  }
  String getOrder(){
	  return "there are " + quantity +
		" computers of '" + firm + "' costs $" +
	    cost+ " each";
  }
}
