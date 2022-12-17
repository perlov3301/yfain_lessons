package lesson03;

public class Woman implements Human {
   private String vname;
   private boolean visrael;
   Woman(String vn, boolean vi) {
	   this.vname = vn;
	   this.visrael = vi;
   }
   public boolean israel() {
	   if (visrael) {
		   System.out.println("She is israel");
		   return true;
	   } else {
		   System.out.println("She is not israel");
		   return false;
	   }
   }
   public void name() {
	   System.out.println("Her name is " + vname);
   }
}
