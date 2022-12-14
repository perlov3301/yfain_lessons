package lesson03;

public class Person {
   String first;
   String last;
   String name;
   Person(String name){
	  this.name = name;
   }
   void mdata() {
	   System.out.println(" person's data: " +
         first + " " + last);
   }
   public String getName() {
	   return (" person's name is " + name);
   }
}
