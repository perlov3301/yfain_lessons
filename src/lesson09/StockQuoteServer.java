package lesson09;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class StockQuoteServer {
   public static void main (java.lang.String[] args) {
	   System.out.println("StockQuoteServer");
	   ServerSocket serverSocket = null;
	   Socket client = null;
	   InputStreamReader inStream= null;
	   BufferedReader inbound = null;
	   OutputStream outbound = null;
	   try {
		   serverSocket = new ServerSocket(3000);
		   System.out.println("Waiting for a quote request..");
		   while (true) {
			  // wait for a request
			  client = serverSocket.accept();
			  //get the streams
			  inStream = new InputStreamReader(client.getInputStream());
			  inbound = new BufferedReader(inStream);
			  outbound = client.getOutputStream();
			  String symbol = inbound.readLine();
			  // generate a random price
			  Double a = Math.random()*100;
			  String price = a.toString();
			  byte[] out = ("\n the Price of "+symbol+
					  " is "+price+"\n").getBytes();
			  outbound.write(out);
			  System.out.println("Request for " + symbol+
				"; price is:" + price+"\n" );
			  outbound.write("End\n".getBytes());
		   }
	   } catch(IOException ioe) {
		   System.out.println("Error in Server: "+ioe);
	   }
   }
}
