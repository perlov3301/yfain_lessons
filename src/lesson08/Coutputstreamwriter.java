package lesson08;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Coutputstreamwriter {
   // writing into Character Stream
  String myAddress = "123 Broadway, New York, NY 10011";
  File file;
  FileOutputStream myFile;
  OutputStreamWriter output;
  Writer outwriter;
  Coutputstreamwriter(){
	  System.out.print("Coutputstreamwriter;");
	  file = MyFile.filewrite();
	  try {
		myFile = new FileOutputStream(file);
		output = new OutputStreamWriter(myFile, "UTF8");
	// for efficiency we use BufferedWriter
		outwriter = new BufferedWriter(output);
		outwriter.write(myAddress);
		System.out.println(" Address was writen to untitled2.txt");
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e1) {
		e1.printStackTrace();
	} finally {
		if (myFile !=null) {
			try {
				outwriter.close();
				myFile.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
  }
}
