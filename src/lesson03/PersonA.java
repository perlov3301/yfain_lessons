package lesson03;

abstract public class PersonA { // abstract==unfineshed
	
	private String name;
	final int INCREASE_CAP = 20;// cap on pay increase
	
	public PersonA(String vn) {
		this.name = vn;
	}
	public String getName() {
		return "Person's name is " + name;
	}
   public void changeAddress(String address) {
	   System.out.println("New address is " + address);
   }
   // means giving one day off and raising the
   // amount in the pay check
   public void giveDayOff() {
	   System.out.println("Giving a day off to " + name);
   };
   public void promote(int percent) {
	   System.out.print(" Promoting a worker...");
	   giveDayOff();
	   
   };
   // an abstract method to be implemented in subclass
   public abstract boolean increasePay(int percent);
  
}
