package lesson07;

public class TimeToShip {
  TimeToShip(){
	  Box<Nokia> boxOfPhones = new Box<>();
	  // Create a shipment of Nokia phones
	  ShippingOrder<String, Box<Nokia>> so1 = 
			  new ShippingOrder<>("ph1234", boxOfPhones);
  }
}
