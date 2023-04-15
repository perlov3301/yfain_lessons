package lesson08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class CnetURL {
	URL myurl = null;
	URLConnection urlConn = null;
	InputStreamReader inStream = null;
	BufferedReader buff = null;
	String nextLine;
	
   CnetURL(){ 
	   System.out.println("CnetURL");
	   // rules==protocols
	   System.out.println("netURL; protocols: TCP/IP, UDP/IP, FTP, HTTP, HTTPS");
	   System.out.println("  LAN stand for Local Area Network (wired computers)");
	   System.out.println("  WAN stand for Wide Area Network(remote computers)");
	   System.out.println("  WWW stand for World Wide Web");
	   System.out.println(" URL stands for Uniform Resource Locators");
	   System.out.println("Host name converted to the IP address by ISP=Internet Service Provider");
	   System.out.println(" IP address 122.65.98.11 or  2001:db8:1234:0:567:8:1");
	   System.out.println(" most people are getting dynamic IP address.For a fee you can request"+""
	   		+ " a name and a static IP address  ");
	   System.out.println(" using the Table that maps DNS and IP addresses");
	   // 1.Create the instance of class URL.
	   String page = "https://developer.mozilla.org/en-US/docs/Web/HTML";
	   try {
		   myurl = new URL(page);
		   System.out.println("myurl:"+myurl);
	   } catch (MalformedURLException e) {
		   System.out.println("please, check the URL:" + e.toString());
	   } finally {
		   System.out.println("end of myrl try:");
	   }
	   //create an instance of URLConnection class and open connection
	   try {
		   urlConn = myurl.openConnection();
		   inStream = new InputStreamReader(urlConn.getInputStream(),"UTF8");
		   buff = new BufferedReader(inStream);
		   System.out.println("buff "+buff);
		   int i = 0;
		   while (i<10) {
			   nextLine=buff.readLine();
			   if (nextLine != null) {
				   System.out.println("CnetURL"+nextLine);
				   i++;
			   } else {
				  break; 
			   }
		   }
	   } catch(IOException e1) {
		   System.out.println("Can't read from the Internet:" + e1.toString());
	   } finally {
		   if (inStream != null) {
			   try {
				   inStream.close();
				   buff.close();
			   } catch (IOException e1) {
				   System.out.println("Can't close stream:" + e1.getMessage());
			   }
		   }
	   }
   }
}
