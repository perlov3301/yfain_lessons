package lesson09;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class CrmiStockServerImpl extends UnicastRemoteObject
           implements CrmiStockServer{
  private String price=null;
  private ArrayList<String> nasdaqSymbols = new ArrayList<>();
  
  public CrmiStockServerImpl() throws RemoteException {
	  super();
	  System.out.println("CrmiStockServerImpl");
	  LocateRegistry.createRegistry(1099);
	  // define some hard-coded NASDAQ symbols
	  nasdaqSymbols.add("AAPL");
	  nasdaqSymbols.add("MSFT");
	  nasdaqSymbols.add("YHOO");
	  nasdaqSymbols.add("AMZN");
	  nasdaqSymbols.add("MOT");
	  
  } 
  public String getQuote(String symbol)
    throws RemoteException {
	  if(nasdaqSymbols.indexOf(symbol.toUpperCase()) != -1) {
		  // generate a random price for valid symbols
		  price = (new Double(Math.random()*100)).toString();
	  }
//this version of the code doesn't process the case if the client
//doesn't specify a valid stock symbol;it just returns the value
//currently stored in the variable price
	  return price;
  }
  public ArrayList<String> getNasdaqSymbols() throws  RemoteException{
	  return nasdaqSymbols;
  }
}
