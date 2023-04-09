package lesson08;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Date;
//import java.sql.Date;

public class EmployeeExternalizable 
   implements Externalizable, Serializable
//Externalizabel is subInterface of Serializable
 {
  String lName;
  String fName;
  String address;
  Date hireDate;
  int id;
  double salary;
  private static final long serialVersionUID = 1L;  // InvalidClassException
  
  void getEmployee(String cla, boolean b) {
	  if (b) {
		  System.out.println(cla +"; id " + id + " salary $" + salary);
	  } else {
		  System.out.println(cla+"; Employee "+
				     fName + " "+ lName+ " id " + id+  
				     " hired "+hireDate+
				     " with salary $"+salary
				     + " version "+serialVersionUID);
	  }
	  
  }
  void getEmployee(String cla) {
	  getEmployee(cla, false);
  }
// @Override
public void writeExternal(ObjectOutput stream) 
		throws java.io.IOException {// Order must  be the same as of reads
	stream.writeDouble(salary);
	stream.writeInt(id);
}
//@Override
public void readExternal(ObjectInput stream)
		throws java.io.IOException {// Order must  be the same as of writes
	salary = stream.readDouble();
	id = stream.readInt();
}
}
