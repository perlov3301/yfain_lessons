package lesson06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class CustomerList {
	File myfile = new File(
			"C:\\Users\\perlo\\git\\yfain_lessons\\src\\lesson06\\fileCustomer.txt");;
	FileReader file;
	FileInputStream input;
	CustomerList() throws Exception{
		System.out.println("CustomerLIst");
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
	  }catch (IOException e) {
		throw new Exception("CustomerList is not available " +
	  e.getMessage());
	  }
   }
}
