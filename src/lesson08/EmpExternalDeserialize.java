package lesson08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmpExternalDeserialize {
  FileInputStream fIn = null;
  ObjectInputStream oIn =null;
  EmployeeExternalizable newEmp = null;
  
  EmpExternalDeserialize(){
	  System.out.println("EmpExternalDeserialize");
	  boolean deserialize = true;
	  try {// only id and salary
		  fIn = new FileInputStream(
	"c:\\Users\\perlo\\git\\yfain_lessons\\src\\lesson08\\NewEmployee2.ser"
				  );
		  oIn = new ObjectInputStream(fIn);
		  System.out.println("EmpExternalDeserialize; oIn:"+oIn);
		  newEmp = (EmployeeExternalizable) oIn.readObject();
		  System.out.println("EmpExternalDeserialize; newEmp:"+newEmp);
	  } catch(ClassNotFoundException cnf) {
		  cnf.printStackTrace();
	  } catch(IOException ioe) {
		  try {
			  oIn.close();
			  fIn.close();
		  } catch (IOException e) {
			  e.printStackTrace();
		  } 
	  } finally {
		  if (oIn != null) {
			  System.out.println("the EmployeeExternalizable object" +
		  " has been deserialized from NewEmployee2.ser");
		  }
	System.out.println("object newEmp:"+newEmp);
	newEmp.getEmployee("EmpExternalDeserialize",true);

	  }
  }
}
