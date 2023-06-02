package lesson09;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;

public class CrmiStartServer {

  public static void main (String args[]) {
	  try {
		  CrmiStockServerImpl ssi = new CrmiStockServerImpl();
		  Naming.rebind("rmi://localhost:1099/QuoteService", ssi);
		  System.out.println("<QuouteService> server is ready");
	  } catch (MalformedURLException e1) {
		  System.out.println(e1.getMessage());
	  } catch(RemoteException ex) {
		  ex.printStackTrace();
	  }
  }
}
