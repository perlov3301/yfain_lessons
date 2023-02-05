package lesson06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class CIOExeption {
	FileReader file;
	BufferedReader br;
	Scanner sc;
	List<String> lines;
	CIOExeption() throws IOException{
		System.out.println("CIOExecption ");
		try {
			System.out.print("FileReader: ");
			file = new FileReader(
	"C:\\Users\\perlovshlomoalexande\\git\\yfain_lessons\\src\\lesson06\\fileCustomer.txt");
			int i;
			while((i = file.read()) != -1) {
				System.out.print((char)i);
			}
			//file.read();
			System.out.println("");
			System.out.print("BufferedReader: ");
			file = new FileReader(
					"C:\\Users\\perlovshlomoalexande\\git\\yfain_lessons\\src\\lesson06\\fileCustomer.txt");
			br = new BufferedReader(file);
			String st;
			while ((st=br.readLine()) != null) {
				System.out.print(st);
			}
			System.out.println("");
			System.out.print("Scanner: ");
			File fi = new File(
		"C:\\Users\\perlovshlomoalexande\\git\\yfain_lessons\\src\\lesson06\\fileCustomer.txt");
			Scanner sc = new Scanner(fi);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			System.out.println("");
			System.out.print("Scanner with delimeter next(): ");
			sc = new Scanner(fi);
            sc.useDelimiter("\\Z");
            System.out.println(sc.next());
            
            System.out.println("");
			System.out.print("List with Iterator: ");
			Path path1 = Paths.get(
					"C:\\Users\\perlovshlomoalexande\\git\\yfain_lessons\\src\\lesson06\\fileCustomer.txt");
            lines = Collections.emptyList();
            lines = Files.readAllLines(path1, StandardCharsets.UTF_8);
            //List l = lines;
            Iterator<String> itr = lines.iterator();
            while (itr.hasNext()) {
            	System.out.print(itr.next());
            }
		} catch(IOException e) {
			System.out.println("there seems to be problem");
			e.printStackTrace();
		}
		
	}

}
