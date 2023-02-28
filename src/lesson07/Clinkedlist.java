package lesson07;

import java.util.LinkedList;
import java.util.ListIterator;

public class Clinkedlist {
   LinkedList passengerList;
   ListIterator iterator;
   Clinkedlist(){
	   System.out.println("ClinkedList");
	   passengerList = new LinkedList();
	   passengerList.add("Alex Smith");
	   passengerList.add("Mary Lou");
	   passengerList.add("Sim Monk");
	   // get the list iterator and print every element
	   iterator = passengerList.listIterator();
	   System.out.print("passengerList; iterator:");
	   int coma = 0;
	   while(iterator.hasNext()) {
		   if (coma ==0) {
			   System.out.print(" "+ iterator.next());
			   coma = 1;
		   } else {
			   System.out.print(", " +iterator.next());
		   }
	   }
	   System.out.println("");
	   
   }
}
