package lesson08;

import java.io.FileInputStream;
import java.io.IOException;

public class TestFileInputStream {
   FileInputStream myFile = null;
   TestFileInputStream() {
	   try  (FileInputStream myFile  = new FileInputStream(MyFile.filetext());)
	   {
		   boolean eof = false;
		   while (!eof) {
			   int byteValue = myFile.read();
			   System.out.println(byteValue + " ");
			   if (byteValue == -1) {
				   eof =true;
			   }
		   }
	   } catch (IOException e) {
		   System.out.println("Could not read file:" + 
	          e.toString());
	   } 
   }
}
