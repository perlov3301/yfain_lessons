package lesson02;

public class Loops {
	void do1() {
		 String [] friends = new String [10];// declare and instantiate
	      friends[0] = "Masha";
	      friends[1] = "Matilda";
	      friends[2] = "Rosa";
	      // ...
	      friends[9] = "natasha" ;
		int totalElements = friends.length;
		int i;
		System.out.print("I love ");
		for (i=0; i<totalElements; ++i) {
			System.out.print(friends[i] + " ");
		}
		System.out.println("");
	}

}
