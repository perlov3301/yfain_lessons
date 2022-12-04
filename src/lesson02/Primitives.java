package lesson02;

import java.util.ArrayList;
import java.util.Arrays;

public class Primitives {
	public void do1() {
		 String [] friends = new String [10];// declare and instantiate
	      friends[0] = "Masha";
	      friends[1] = "Matilda";
	      friends[2] = "Rosa";
	      // ...
	      friends[9] = "natasha" ; // initializing the last element
	      // another way
	      String [] friends1 = {"Masha", "Matilda", "Rosa"};
	      for(String grl: friends) {
	    	  System.out.print(grl + " ");
	      }
	      System.out.println("");
	      System.out.println("friends " + Arrays.toString(friends1));
	      String myGF = new String("Oksana");
	      String myGF1 = "Oksana";
	      myGF1 = "Oksana Smith";
	      System.out.println("myGF1 "+ myGF1);
	      String friends2 [][] =new String [10][2];
	      friends2[0][0] = "Masha";
	      friends2[0][1] = "732 2341212";
	      friends2[1][0] = "Matilda";
	      friends2[1][1] = "732 125 3588";
	      ArrayList myNumbers = new ArrayList();
	      myNumbers.add(6);
	      myNumbers.add(7);
	      System.out.println("at second position item is " + myNumbers.get(1));
	      
	}

}
