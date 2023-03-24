package lesson08;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestBufferedInputStream {
   TestBufferedInputStream(){
		System.out.print("TestBufferedInputStream; ");
		File file = null;
	   try {
		   file = MyFile.filetext();
		   file = MyFile.filestates();
	   } catch (FileNotFoundException e1) {
		   e1.printStackTrace();	   }
	     catch (IOException e2) {
	    	 e2.printStackTrace();
	     }
	   try(
		FileInputStream myFile = new FileInputStream(file);
	    BufferedInputStream buff = new BufferedInputStream(myFile);
			   ){
		   System.out.println("states.txt:");
		   System.out.print("");
		   int inull = 0;
		   boolean eof = false;
		   while(!eof) {
			   int byteValue = buff.read();
			   String s = Cconvertor.getC(byteValue);
			   if (s==null && inull==0) {
				   s="\n";
				   inull = 1;
			   } else { 
				   if (s==null) { s="";}
				   inull = 0;
			   }
			   System.out.print(s + " ");
			   if (byteValue == -1) {
				   eof = true;
			   }
		   }
	   } catch (IOException e3) {
		   System.out.println(e3.toString());
	   }
   }
}
