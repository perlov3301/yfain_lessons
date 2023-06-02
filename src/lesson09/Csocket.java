package lesson09;

import java.net.ServerSocket;
import java.net.Socket;

public class Csocket {
  Csocket(){
	  try { // two lines create a server that is listening
		   // to port 3000
		  ServerSocket serverSocket = 
				  new ServerSocket(3000);
		  Socket client = serverSocket.accept();
		  
	  } catch(Exception e) {
		e.getMessage();  
	  }
	  try {// the client program creates an instance of
// the class Socket pointing at the computer/port on wich
// ServerSocket is running(pair of IP address and port.
		  Socket clientSocket = 
				  new Socket("124.67.98.101",3000);
	  } catch (Exception e) {
		  e.getMessage();
	  }
  }
  // WebSocket is HTML5 standard of communication over
  // the internet.https://enterprisewebbook.com/ch8_websockets.html
}
