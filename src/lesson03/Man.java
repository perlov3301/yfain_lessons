package lesson03;

public class Man implements Human{
	 private String vname;
	   private boolean visrael;
	   Man(String vn, boolean vi) {
		   this.vname = vn;
		   this.visrael = vi;
	   }
	   public boolean israel() {
		   if (visrael) {
			   System.out.println("He is israel");
			   return true;
		   } else {
			   System.out.println("He is not israel");
			   return false;
		   }
	   }
	   public void name() {
		   System.out.println("his name is " + vname);
	   }
}
