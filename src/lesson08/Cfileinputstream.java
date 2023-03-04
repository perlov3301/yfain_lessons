package lesson08;

import java.io.*;

public class Cfileinputstream {
   // to work with files:reading from FileInputStream
	File file1;
	FileInputStream myFile = null;
  Cfileinputstream() throws IOException{
	  System.out.println("Cfileinputstream");
	  file1 = MyFile.filetext();
	  System.out.print("untitled1.txt:");
	  try {
		  myFile = new FileInputStream(file1);
		  boolean eof = false;
		  while (!eof) {
			  int byteValue = myFile.read();
			  System.out.print(byteValue+" ");
			  if (byteValue == -1) {
				  eof = true;
			  }
		  } // myFile.close(); don't do it here->finally
	  } catch (IOException e) {
		 System.out.println("Could not read file cause:" +
	    e.toString());
	  } finally {
		  if (myFile !=null) {
			  try {
				  myFile.close();
			  } catch (Exception e1) {
				  e1.printStackTrace();
			  }
		  }
	  }
  }
}
