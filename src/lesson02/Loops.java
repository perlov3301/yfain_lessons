package lesson02;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Loops {
	void do1() {
		 String [] friends = new String [10];// declare and instantiate
	      friends[0] = "Masha";
	      friends[1] = "Matilda";
	      friends[2] = "Rosa";
	      friends[8] = "Hillary";
	      friends[9] = "natasha" ;
		int totalElements = friends.length;
		int i;
		System.out.print("My good friends ");
		for (i=0; i<totalElements; ++i) {
			if(friends[i] == null) {continue;}
			System.out.print(friends[i] + " ");
		}
		System.out.println("");
		// for-each
		System.out.print("I love ");
		System.out.print("");
		for (String girl : friends) {
			if (girl == null) { continue;}
			System.out.print(girl + " ");
		}
		System.out.println("");
		List<Integer> vlist = new ArrayList<>();
		long startTime ;
		long endTime;
		for (int i1=0; i1<1000000; i1++) { vlist.add(i1);}
		//
		startTime = Calendar.getInstance().getTimeInMillis();
		for(int i1: vlist) { int a=i1; }
		endTime = Calendar.getInstance().getTimeInMillis();
		long vdiff = endTime - startTime;
		System.out.println("for-each loop: " + vdiff + " mls");
		//
		startTime = Calendar.getInstance().getTimeInMillis();
		for(int i1 = 0; i1 < vlist.size() ; i1++) { 
			int a = vlist.get(i1); }
		endTime = Calendar.getInstance().getTimeInMillis();
		vdiff = endTime - startTime;
		System.out.println("for loop: " + vdiff + " mls");
		//
		i = 0;
		startTime = Calendar.getInstance().getTimeInMillis();
		while (i < vlist.size()) { 
			int a = vlist.get(i); 
			i++; };
		endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("while loop: " + vdiff + " mls");
		//
		i = 0;
		startTime = Calendar.getInstance().getTimeInMillis();
		do { 
			int a = vlist.get(i); 
			i++; } while (i < vlist.size());
		endTime = Calendar.getInstance().getTimeInMillis();
		System.out.println("do while loop: " + vdiff + " mls");
	}

}
