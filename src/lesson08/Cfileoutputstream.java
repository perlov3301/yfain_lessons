package lesson08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Cfileoutputstream {
  //byte values are represented by integers from 0 to 255
	int  somedata[] = {72,101,108,108,111, 32, 87, 111, 114, 108, 100};
	File file;
	FileOutputStream myFile = null;
	Cfileoutputstream(){
		try {
			file = MyFile.file2();
			myFile = new FileOutputStream(file);
			for (int i = 0; i<somedata.length; i++) {
				myFile.write(somedata[i]);
			}
		} catch (IOException e) {
			e.printStackTrace();
	System.out.println("could not write to a file: " +
			e.toString());
		} finally {
			if (myFile != null) {
				try {
					myFile.close();
				}   catch (Exception e3) {
					e3.printStackTrace();
				}
			}
		}
		
	}
}
