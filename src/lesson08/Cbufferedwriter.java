package lesson08;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

public class Cbufferedwriter {
   File file;
   FileOutputStream myFile;
   OutputStreamWriter output;
   Writer outwriter;
   Cbufferedwriter() {
	   System.out.print("Cbufferedwriter; ");
	   String myAddress1 = "125 Broadway, New York, NY 10011";
	   file = MyFile.filewriter1();
	   try {
		   myFile = new FileOutputStream(file);
		   output = new OutputStreamWriter(myFile, "UTF8");
		   outwriter = new BufferedWriter(output);
		   outwriter.write(myAddress1);
		   System.out.println(" Address1 was writen to untitled3.txt");
	   } catch(FileNotFoundException e) {
		   e.printStackTrace();
	   } catch(UnsupportedEncodingException e1) {
		   e1.printStackTrace();
	   } catch (IOException e2) {
		   e2.printStackTrace();
	   } finally {
		   if (myFile != null) {
			   try {
				   outwriter.close();
				   myFile.close();
			   } catch (Exception e3) {
				   e3.printStackTrace();
			   }
		   }
	   }
   }
}
