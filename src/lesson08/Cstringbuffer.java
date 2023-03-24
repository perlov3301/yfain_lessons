package lesson08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Cstringbuffer {
	// reading character Stream
   StringBuffer buffer = new StringBuffer();
   File file;
   FileInputStream myFile;
   InputStreamReader inputreader;
   Reader reader;
   Cstringbuffer() {
	   System.out.print("Cstringbuffer; ");
	   try {
		   file = MyFile.filetext();
		   myFile = new FileInputStream(file);
	// piping InputStreamReader and FileInputStream
		   inputreader = new InputStreamReader(myFile, "UTF8");
		   reader = new BufferedReader(inputreader);
		   int ch; // code of one character
		   while ((ch=reader.read())>-1) {
			   buffer.append((char)ch);
		   }
		   String result = buffer.toString();
		   System.out.println("filetext: \n" +result);
	   } catch (IOException e1) {
		   e1.printStackTrace();
	   }
   }
}
