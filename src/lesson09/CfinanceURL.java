package lesson09;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;

public class CfinanceURL {
	URL url;
	URLConnection connect = null;
	InputStream in = null;
	InputStreamReader inreader = null;
	BufferedReader buff = null;
	String theWholePage;
	String txt;
	String finance;
   CfinanceURL(){
	   System.out.println("CfinanceURL");
	   finance = "https://finance.yahoo.com/q?s=AAPL";
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
	   } catch (Exception e) {
		   System.out.println("CfinanceURL;can't to be read:"+e.getMessage());
		   e.printStackTrace();
	   }
	   try {
		   while ((txt=buff.readLine()) != null){
			   theWholePage = theWholePage + txt;
		   }
	   } catch (Exception e) {
		   e.printStackTrace();
	   }
	   System.out.println("CfinanceURL;theWholePage:"+theWholePage);
	   System.out.println(theWholePage);
   }// end of structer
}
