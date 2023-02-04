package lesson06;

import java.io.IOException;
import java.sql.SQLException;

public class CSQLException {
    CSQLException() throws SQLException, IOException{
    	System.out.println("CSQLException");
    	readSomeData();
    }
    static void readSomeData()
      throws SQLException, 
             IOException
    {
      try {
    	  // some code and after that:
    	SQLException esql = new SQLException("Table doesn't exist");
    	throw esql;
      } catch(Exception e) {
    	  throw e; // rethrow the exception
      }
    }
}
