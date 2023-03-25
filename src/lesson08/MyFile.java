package lesson08;

import java.io.File;
import java.io.IOException;

public class MyFile {
   static File filetext() throws IOException {
	  File a =  new File(
	"C:\\Users\\perlovshlomoalexande\\git\\yfain_lessons\\src\\lesson08\\Untitled1.txt");
	return a;
   }
   static String filestring () {
	   return 
	"C:\\Users\\perlovshlomoalexande\\git\\yfain_lessons\\src\\lesson08\\Untitled1.txt";
   }
   static File file2() throws IOException {
		  File a =  new File(
	"C:\\Users\\perlovshlomoalexande\\git\\yfain_lessons\\src\\lesson08\\untitled2.txt");
		return a;
	   }
   static File filewrite () {
	   return new File(
	"C:\\Users\\perlovshlomoalexande\\git\\yfain_lessons\\src\\lesson08\\untitled2.txt"
              );
   }
   static File filewriter1 () {
	   return new File (
	"C:\\Users\\perlovshlomoalexande\\git\\yfain_lessons\\src\\lesson08\\untitled3.txt"
			   );
   }
   static File filestates () {
	   return new File (
	"C:\\Users\\perlovshlomoalexande\\git\\yfain_lessons\\src\\lesson08\\states.txt"
			   );
   }
   
}
