package lesson06;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Logger;

public class CmultyRethrow {
   CmultyRethrow(){
	   System.out.println("CmultyRethrow");
	   try {
		   readData();
	   } catch(IOException | SQLException e) {
		   // e parameter is implicity final: assumed to be final
		   Logger.getLogger(e.toString());
		   e.printStackTrace();
	   }
   }
   void readData() throws IOException, SQLException {
	   try {
		   // some code that may generate Exception
		   //and then:
		   SQLException esql = new SQLException("Table Cunt doesn't exist");
		   throw esql;
//		   IOException eio = new IOException("Table Cunt doesn't exist");
//		   throw eio;
	   } catch(final Exception e) {
		   // final means that I can't change object e
		   throw e;
	   }
   }
}
