package lesson08;

public class CconvertorTest {
   CconvertorTest(){
	   System.out.print("72 101 108 108 111 32 87 111 114 108 100:");
	   String a="";
	   try {
		   a = Cconvertor.getC(72);
	   } catch (Exception e) {
		   System.out.println(e.getMessage().toString());
	   }
	   System.out.print(a);
	   
	   try {
		   a = Cconvertor.getC(101);
	   } catch (Exception e) {
		   System.out.println(e.getMessage().toString());
	   }
	   System.out.print(a);
	   }
}
