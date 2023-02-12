package lesson06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class CcustomerList {
	File myfile = MyFile.filetext();
	FileReader file;
	Scanner sc;
	InputStream myIntputStream = null;
	FileInputStream input;
	CcustomerList() throws IOException{
		System.out.println("CcustomerList");
		try {
			getAllCustomers();
		} catch (IOException e) {
			e.getMessage();
		}finally {
			if (file != null) {
				try {
					file.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		try {
			readAll();
		}catch(IOException e) {
			e.getMessage();
		}finally {
			if (input != null) {
				try {
					input.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
		// try with resources
		try(FileOutputStream fos  = new FileOutputStream(myfile)){
			String text = "Hello World";
			byte arr[] = text.getBytes();
			// text written in the file
			fos.write(arr);
		} catch(Exception e) {
			System.out.println(e);
		} // resources are closed
		try(FileInputStream af = new FileInputStream(myfile)){
			int ch;
			System.out.print("FileInputStream as resources: ");
			while((ch=af.read()) !=-1) {
				System.out.print((char)ch);
			}
			System.out.println("");
		}catch(Exception e) {
			e.printStackTrace();
		}// resources are closed
	}
   void readAll() throws IOException{
	   System.out.print("FileInputStream: ");
	   input = new FileInputStream(myfile);
	   int ch;
	   while ((ch=input.read()) != -1) {
		   System.out.print((char)ch);
		   }
	   System.out.println("");
   }
   void getAllCustomers() throws IOException{
	  // we are not handling exceptions here
	  // without try/catch
	  
	  System.out.print("good FileReader: ");
	  file = new FileReader(myfile);
	  int i;
	  while ((i = file.read()) !=-1) {
		  System.out.print((char)i);
	  }
	  System.out.println("");
	  
   }
}
