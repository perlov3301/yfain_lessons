package lesson06;

import java.io.FileReader;
import java.io.IOException;

public class CIOExeption {
	FileReader file;
	CIOExeption() throws IOException{
		System.out.println("CIOExecption: ");
		try {
			file = new FileReader(
	"C:\\Users\\perlovshlomoalexande\\git\\yfain_lessons\\src\\lesson06\\fileCustomer.txt");
			int i;
			while((i = file.read()) != -1) {
				System.out.print((char)i);
			}
			file.read();
		} catch(IOException e) {
			System.out.println("there seems to be problem");
		}
	}

}
