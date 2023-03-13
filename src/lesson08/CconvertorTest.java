package lesson08;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class CconvertorTest {
	File file1;
	FileInputStream myFile = null;
   CconvertorTest(){
	   System.out.println("CconvertorTest");
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
	   System.out.print("\ncopy from Cfileinputstream: ");
	   try {
		file1 = MyFile.filetext();
	} catch (IOException e) {
		e.printStackTrace();
	}
	   System.out.println("untitled1.txt");
	   try {
		   myFile = new FileInputStream(file1);
		   boolean eof = false;
		   while (!eof) {
			   int byteValue = myFile.read();
			  // System.out.print(byteValue + " ");
			   try {
				   a = Cconvertor.getC(byteValue);
				   if (a==null) {
					   a = "\n";
				   }
			   } catch (Exception e2) {
				   System.out.println(e2.getMessage().toString());
			   }
			   System.out.print(a + " ");
			   if (byteValue == -1) {
				   eof = true;
			   }
		   }// myFile.close();
	   } catch (IOException e) {
		   System.out.println("could not read file cause:" +
	   e.toString());
	   } finally {
		   if (myFile != null) {
			   try {
				   myFile.close();
			   } catch (Exception e1) {
				   e1.printStackTrace();
			   }
		   }
	   }
  }// end of Constructor
}
