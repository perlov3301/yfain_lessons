package lesson06;
import java.io.IOException;
import java.sql.SQLException;

public class CmultyRethrow {
   try {
	   readData();
   } catch(IOException | SQLException e) {
	   e.printStackTrace();
   }
   void readData() throws IOException, SQLException {
	   try {
		   SQLException esql = new SQLException("Table Cunt doesn't exist");
		   throw esql;
	   } catch(Exception e) {
		   throw e;
	   }
   }
}
