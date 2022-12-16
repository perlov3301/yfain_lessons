package lesson03;

abstract public class PersonA { // abstract==unfineshed
	String name;
	PersonA(String vn) {
		name = vn;
	}
   public void changeAddress(String address) {
	   System.out.println("New address is " + address);
   }
   // means giving one day off and raising the
   // amount in the pay check
   public void promote() {
	   
   };
   public void giveDayOff() {
	   
   };
   // an abstract method to be implemented in subclass
   public abstract boolean increasePay(int percent);
  
}
