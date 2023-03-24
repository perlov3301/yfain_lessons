package lesson06;

import java.io.IOException;

public class Lesson06 {

	public static void main(String[] args) throws IOException {
      System.out.println("Lesson06");
      new TestStackTrace2();
      new TestStackTrace();
      try {
    	  new CIOExeption();
      } catch(IOException e) {
    	  System.out.println("Lesson06: CIOException don't work");
      }
      
      try {
    	  new CcustomerList();
      }catch(IOException e) {
    	  e.getMessage();
      }
      
      try {
		new CustomerTrywithresources();
	  } catch (Exception e) {
		e.printStackTrace();
	  }
      //new CmultyRethrow();
      new CgridbagListener();
	}

}
