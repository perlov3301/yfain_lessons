package lesson06;

import java.io.File;
import java.io.IOException;

public class MyFile {
   static File filetext() throws IOException {
	  File a =  new File(
				"C:\\Users\\perlovshlomoalexande\\git\\yfain_lessons\\src\\lesson06\\fileCustomer.txt");
	return a;
   }
   static String filestring () {
	   return 
	"C:\\Users\\perlovshlomoalexande\\git\\yfain_lessons\\src\\lesson06\\fileCustomer.txt";
   }
}
