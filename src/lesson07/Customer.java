package lesson07;

public class Customer {
	private String firstName;
	private String lastName;
   Customer(String first, String last) {
	   this.firstName = first;
	   this.lastName = last;
   }
   String getName(){
	   return firstName + " " + lastName;
   }
}
