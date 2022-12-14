package lesson03;

public class Person {
   String first;
   String last;
   Person(String vf, String vl){
	   first = vf;
	   last = vl;
   }
   void mdata() {
	   System.out.println(" person's data: " +
         first + " " + last);
   }
}
