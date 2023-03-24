package lesson08;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Cbufferedinputstream {
// middleman between FileInputStream object and the file
// it pipes one time to file(to read another chunk)
// then to object
	File file;
	FileInputStream myFile = null;
	BufferedInputStream buff = null;
	Cbufferedinputstream(){
		System.out.println("Cbufferedinputstream");
		try {
			file = MyFile.filetext();
			System.out.println("untitled1.txt");
			myFile = new FileInputStream(file);
			buff = new BufferedInputStream(myFile);
			boolean eof = false;
			while (!eof) {
				int byteValue = buff.read();
				String s = Cconvertor.getC(byteValue);
				if (s==null) {
					s="\n";
				}
				System.out.print(s + " ");
				if (byteValue == -1) {
					eof = true;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (myFile != null) {
				try {
					buff.close();
					myFile.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		}
	}
}

