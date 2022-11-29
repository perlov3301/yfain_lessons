package lesson01;

public class JamesBondCar extends Car{
   final String MANUFACTURER;
   int currentSubmergeDepth;
   boolean isGunOnBoard = true;
   public JamesBondCar(String string) {
	   MANUFACTURER = string;
}

   
   void submerge() {
	   currentSubmergeDepth = 50;
	   System.out.println("submerge");
   }
   void surface() {
	   System.out.println("surface");
   }
   void mycar() {
	   System.out.println("mycar: firm is " + 
   MANUFACTURER + "; color is " + color);
   }
}
