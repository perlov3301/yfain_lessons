package lesson02cmd;

public class Homework {
  static void assignment() {
	  System.out.println("Homework:");
	  String gfriend = "Masha";
	  String gfriend2 = "Masha";

	  boolean vb1 = gfriend =="Masha";
	  System.out.println("gfriend var==value:" + vb1);
	  vb1 = gfriend == gfriend2;
	  System.out.println("literal assigned gfriend==gfriend2:" + vb1);
	  String gfriendO1 = new String("Natasha");
	  String gfriendO2 = new String("Natasha");
	  vb1 = gfriendO1==gfriendO2;
	  System.out.println("the same value object1==object2 :" + vb1);

  }
}
