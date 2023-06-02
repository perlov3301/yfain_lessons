package lesson09;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
  public static void main(java.lang.String [] args) {
	  System.out.println("Client");
	  if (args.length==0) {
		  System.out.println("proper Usage: java Client symbol");
		  System.exit(0);
	  }
	  OutputStream outbound = null;
	  InputStream instream = null;
	  BufferedReader inbound = null;
	  Socket clientSocket = null;
	  try {// open a client socket connection
		  clientSocket = new Socket("localhost", 3000);
		  System.out.println("Client: " + clientSocket);
		  // get the streams
		  outbound = clientSocket.getOutputStream();
		  instream = clientSocket.getInputStream();
		  inbound = new BufferedReader(
				  new InputStreamReader(instream));
		  // send stock symbol to the server
		  outbound.write((args[0]+"\n").getBytes());
		  outbound.write("End\n".getBytes());
		  String quote;
		  while(true) {
			  quote = inbound.readLine();
			  if ("End".equals(quote)) {
				  break;
			  }
			  System.out.println("Got the quote for " + 
			  args[0]+":"+quote);
		  }
	  } catch(UnknownHostException uhe) {
		  System.out.println("UnknownHostException: " + uhe);
	  } catch (IOException ioe) {
		  System.err.println("IOException:" + ioe);
	  } finally {// close the streams
		  try {
			  instream.close();
			  outbound.close();
		  } catch(Exception e) {
			  e.printStackTrace();
		  }
	  }
  }
}
