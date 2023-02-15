package lesson06;

import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
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
	File myfile;
	FileReader file;
	BufferedReader br;
	Scanner sc;
	List<String> lines;
	CIOExeption() throws IOException{
		System.out.println("CIOExecption ");
//		System.out.println("textfile " + MyFile.filetext());
		try {
			myfile = MyFile.filetext();
			System.out.print("good FileReader: ");
			file = new FileReader(myfile);
			int i;
			while((i = file.read()) != -1) {
				System.out.print((char)i);
			}
			System.out.println("");
			System.out.print("BufferedReader: ");
			file = new FileReader(myfile);
			br = new BufferedReader(file);
			String st;
			while ((st=br.readLine()) != null) {
				System.out.print(st);
			}
			System.out.println("");
			System.out.print("good Scanner: ");
			File fi = myfile;
			Scanner sc = new Scanner(fi);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			System.out.println("");
			System.out.print("good Scanner with delimeter next(): ");
			sc = new Scanner(fi);
            sc.useDelimiter("\\Z");
            System.out.println(sc.next());
            
            System.out.println("");
			System.out.print("List with Iterator: ");
			Path path1 = Paths.get(MyFile.filestring());
            lines = Collections.emptyList();
            lines = Files.readAllLines(path1, StandardCharsets.UTF_8);
            //List l = lines;
            Iterator<String> itr = lines.iterator();
            while (itr.hasNext()) {
            	System.out.print(itr.next());
            }
            System.out.println("");
			System.out.print("good readAllBytes(file as String): ");
			String data = "";
			data = new String(Files.readAllBytes(path1));
			System.out.print(data);
		} catch(FileNotFoundException | EOFException e) {
			System.out.println("problem reading file "+ e.getMessage());
			e.printStackTrace();
		}catch(Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
		System.out.println("");
	}

}
