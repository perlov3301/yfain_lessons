package lesson01;

public class Car {
   String color;
   int numberOfDoors;
   boolean started = false;
   boolean stoped = true;
   void startEngine(String a) {
	   started = true;
	   stoped = false;
	   System.out.println(a + " is started");
	   }
   void stopEnginge(String a) {
	   int tempCounter = 0;
	   stoped = true;
	   System.out.println(a + " is stoped");
   }
}
