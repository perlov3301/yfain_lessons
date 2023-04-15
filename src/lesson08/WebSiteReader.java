package lesson08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class WebSiteReader {
   WebSiteReader () {
	   System.out.println("WebSiteReader");
	   String nextLine;
	   String host;
	   URL url = null; 
	   URLConnection urlConn = null;
	   
	   InputStreamReader inStream = null;
	   BufferedReader buff =null;
	   
	   try {
		 String page = "https://developer.mozilla.org/en-US/docs/Web/HTML";
		 url = new URL(page);
// InputStreamReader inStream=new InputStreamReader(url.openConnection());
// JSONObject property=new JsonParser().parse(inStream).getAsJsonObject().get(0).getAsJsonObject();
// String texture=property.get("value").getAsString();
// String signature=property.get("signature").getAsString();
// return new Property("textures", texture, signature);		 
		 urlConn = url.openConnection();
		 inStream = new InputStreamReader(urlConn.getInputStream(), "UTF8");
		 buff = new BufferedReader(inStream);
		 int i =0;
		 while (i<10) {
			 nextLine=buff.readLine();
			 if (nextLine !=null) {
				 System.out.println("WebSiteReader:"+nextLine);
				 i++;
			 } else {
				 break;
			 }
		 }
	   } catch(MalformedURLException e) {
		   System.out.println("Please check the URL"+e.toString());
		   
	   } catch(IOException e1) {
		   System.out.println("Can't read online:"+e1.toString());
	   } 
   }
}
