package lesson09;

import java.net.MalformedURLException;
import java.rmi.*;

public class CrmiClient {//RMI Players: 
// 1.Start registry -< RMI registry 
// 2.Register server with registry service-<RMI Server
// 3.Client looks up server by name-< RMI Client+Registry
// 4. Server found, stub received-<RMI Client
// 5. Client call stub method, which communicates
// with method on server. -< RMI Client+Server
// You have to declare a remote Java interface (StockServer)
// and then to implement this interface(StockServerImpl)
// Computer A: Start the registry and register RMI server
// Computer B: Start the server and the client applications
// Computer C: Start a Java client that looks up for remote services 
//   using a naming service which runs on a known host and port number
// in register Computer A and connects to the server Computer B
// and calls remote methods.
	public static void main (String args[]) {
		if (args.length==0) {
			System.out.println("\nUsage: java "+
		"-Djava.security.policy=security.policy Client AAPL");
			System.exit(0);
		} 
		try {
			CrmiStockServer myServer = (CrmiStockServer)
		Naming.lookup("rmi://localhost:1099/QuoteService");
			String price = myServer.getQuote(args[0]);
			if (price != null) {
				System.out.println("the Price of "+args[0]+
						" is: $"+price);
			} else {
				System.out.println("Invalid Nasdaq symbol."+
			  "Please use one of these:"+
				myServer.getNasdaqSymbols().toString());
			}
		} catch(MalformedURLException ex) {
			System.out.println(ex.getMessage());
		} catch(RemoteException ex2) {
			System.out.println(ex2.getMessage());
		} catch(NotBoundException ex3) {
			ex3.printStackTrace();
		}
	}
	CrmiClient(){
		System.out.println("CrmiClient");
	}
}
