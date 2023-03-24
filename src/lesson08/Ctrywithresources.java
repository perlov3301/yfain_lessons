package lesson08;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Ctrywithresources {
  File file;
//  FileInputStream myFile = null;
//  BufferedInputStream buff = null;
  Ctrywithresources(){
	  System.out.print("Ctrywithresources; Untitled1.txt\n");
	  try {
		file = MyFile.filetext();
	} catch (IOException e1) {
		e1.printStackTrace();
	}
	  try(FileInputStream myFile = new FileInputStream(file);
			 BufferedInputStream buff = new BufferedInputStream(myFile); 
			  ) {
		  boolean eof =false;
		  while (!eof) {
			  int byteValue = buff.read();
			  String s = Cconvertor.getC(byteValue);
			  if (s==null) { s="\n"; }
			  System.out.print(s + " ");
			  if (byteValue == -1) {
				  eof = true;
			  }
		  }
	  } catch(IOException e) {
		  e.printStackTrace();
	  }
  }
}
