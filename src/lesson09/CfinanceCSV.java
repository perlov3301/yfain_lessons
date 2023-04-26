package lesson09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.StringTokenizer;

public class CfinanceCSV {
   URL url;
   URLConnection connect = null;
   InputStream in = null;
   InputStreamReader inreader = null;
   BufferedReader buff = null;
   String txt;
   String thePage;
   String finance;
   StringTokenizer tokenizer = null;
   CfinanceCSV() {
	   System.out.println("CfinanceCSV");
	   finance = "https://quote.yahoo.com/d/quotes.csv?s=AAPL&f=sl1d1t1c1ohgv&e=.csv";
	   try {
		   url = new URL(finance);
	   } catch (MalformedURLException e) {
		   e.printStackTrace();
	   }
	   try {
		   connect = url.openConnection();
		   in = connect.getInputStream();
		   inreader = new InputStreamReader(in);
		   buff = new BufferedReader(inreader);
	   } catch(IOException e) {
		   System.out.println("CfinanceURL;page can't to be read");
		   e.printStackTrace();
	   }
	   try {
		   while ((txt=buff.readLine()) != null) {
			  tokenizer = new StringTokenizer(txt, "");
			  while (tokenizer.hasMoreTokens()) {
				  thePage = thePage + tokenizer.nextToken();
			  }
		   }
	   } catch(IOException e) {
		   System.out.println("CfinanceCSV;can't print page "+e.getMessage());
		   e.printStackTrace();
	   }
   }
}
