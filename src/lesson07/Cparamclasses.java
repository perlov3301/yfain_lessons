package lesson07;

public class Cparamclasses {
   Box<Integer> integerBox;
   Cparamclasses(){
	   System.out.println("Cparamclasses");
	   integerBox = new Box<>();
	   int i = 10;
	   integerBox.add(i);
	   Integer someInteger = integerBox.get();
	   System.out.println("someInteger: " + someInteger);
	   
	   Box<Nokia> box1 = new Box<>();
	   Box<Blackberry> box2 = new Box<>();
	   // create a shipment
	   ShippingOrder<String, Box<Nokia>> so1 = 
			   new ShippingOrder<>("ph1234", box1);
	   ShippingOrder<String, Box<Blackberry>> so2 = 
			   new ShippingOrder<>("b4321", box2);
	   System.out.println(so1.getOrder());
	   System.out.println(so2.getOrder());
   }
}
