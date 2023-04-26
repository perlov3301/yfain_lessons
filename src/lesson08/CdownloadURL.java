package lesson08;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class CdownloadURL {
   public static void main(String[] args) {
	// 27:47
	// http://myflex.org/yf/podru/budam421.mp3  PodcastMarch29.mp3
	// URL->URLConnection->InputStream->read()->data
		// FileOutputStream->write(data)
			if (args.length!=2) {
		System.out.println("Proper Usage: java FileDownload"+
		   " URLofMP3 OutputFileName.mp3");
				System.exit(0);
			}
		
	   InputStream in = null;
	   FileOutputStream fOut = null;
	   System.out.println("CdownloadURL; downloading "+args[0]);
	   try {
		   URL remoteFile= new URL(args[0]);
		   System.out.println("FileDownload;URL="+remoteFile);
		   URLConnection fileStream = remoteFile.openConnection();
		   // Open output and input streams
		   fOut = new FileOutputStream(args[1]);
		   in = fileStream.getInputStream();
		   // save the file
		   int data;
		   byte[] b = new byte[100];
		   while((data=in.read(b))!=-1) {
			   fOut.write(b, 0, data);
		   } // while
	/**
      BufferedInputStream bufferedInputStream = 
      new  BufferedInputStream(new URL(decodedDownloadLink).openStream());
	  int count=0;
        byte[] b = new byte[100];
        while((count = bufferedInputStream.read(b)) != -1) {                
            fileOutputStream.write(b, 0,count);
        }	   
	 */
		   
	   } catch(Exception e) {
		   e.printStackTrace();
	   } finally {
		   System.out.println("the File "+args[0]+
			" has been download successfully as "+args[1]);
		   try {
			   in.close();
			   fOut.flush();
			   fOut.close();
		   } catch(Exception e) { e.printStackTrace();
		   }
		 }
	   
   } // void main
}
