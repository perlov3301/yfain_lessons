package lesson09;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface CrmiStockServer extends Remote {
	public String getQuote(String symbol) throws  RemoteException;
	
	public List<String> getNasdaqSymbols() throws RemoteException;
  
}
