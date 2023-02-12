package lesson06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class CustomerList {
	File myfile = MyFile.filetext();
	FileReader file;
	FileInputStream input;
	CustomerList() throws Exception{
		System.out.println("CustomerList");
	// cause throws declaration we have to handle it
		try(FileInputStream fis = new FileInputStream(myfile)) {
			getAllCustomers(fis);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
   void getAllCustomers(FileInputStream f) throws Exception {
	  // some code here
	  try {
		  System.out.print("good FileInputStream: ");
		  int ch;
		  while((ch=f.read()) !=-1) {
				System.out.print((char)ch);
			}
		  System.out.println("");
	  }catch (IOException e) {
		throw new Exception("CustomerList is not available " +
	  e.getMessage());
	  }
   }
}
