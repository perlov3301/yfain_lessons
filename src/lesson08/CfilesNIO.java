package lesson08;

import java.io.IOException;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CfilesNIO {
   Path pathCustomers;
   Path pathCustomers1;
   List<String> customers =null ;
   byte[] customers1;
   Reader reader;
  CfilesNIO () {    	
		System.out.println("CfilesNIO");
	 try {
		 pathCustomers = 
		   		   FileSystems.getDefault().getPath("c:", 
//		   				"\\Customers.txt"
	"\\Users\\perlo\\git\\yfain_lessons\\src\\lesson08\\Customers.txt"
		   				   );
	 } catch (Exception e) {
		 System.out.println("CfilesNIO; pathCustomers is wrong");
		 e.printStackTrace();
	 }
	 try {
		 pathCustomers1 = FileSystems.getDefault().getPath(
		   		   "c:", 
	"/Users/perlo/git/yfain_lessons/src/lesson08/Customers1.txt"
		   		   );
	 } catch (Exception e) {
		 System.out.println("CfilesNIO; pathCustomers1 is wrong");
		 e.printStackTrace();
	 }
	  // read file as Lines of strings
      System.out.println("CfilesNIO; customers, escape backlash :");
     try {
    	   customers = 
    	Files.readAllLines(pathCustomers, Charset.defaultCharset());
     } catch (IOException e1) {
    	 e1.printStackTrace();
     }
     System.out.println(customers);
     System.out.println("CfileNIO; customers1,normal backlash:");
     try {
    	 customers = 
    	Files.readAllLines(pathCustomers1, Charset.defaultCharset());
     } catch (IOException e1) {
    	 e1.printStackTrace();
     }
     System.out.println(customers);
     // using buffer for efficiency
     try {
    	 reader = Files.newBufferedReader(pathCustomers,
    			 Charset.defaultCharset());
         System.out.println("CfilesNIO; BufferedReader:"+reader.read());
     } catch (IOException e1) {
    	 e1.printStackTrace();
     }
     // read file as bytes
	  try {
		  customers1 = Files.readAllBytes(pathCustomers);
	  } catch (IOException e1) {
	    	 e1.printStackTrace();
	     }
	  // create a file
	  Path fileName;
	  Path customers2;
	 try {
		 fileName = Paths.get(
		"c:\\Users\\perlo\\git\\yfain_lessons\\src\\lesson08\\CustomersNew.txt"
				);
	 } catch(Exception e) {
		 System.out.println("CfilesNOI; path 'fileName' is wrong");
		 e.printStackTrace();
	 }
	 try {
		// customers2 = Paths.createFile(fileName);
	 } catch (Exception e) {
		 e.printStackTrace();
	 }

  }
   
}
