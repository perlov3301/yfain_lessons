package lesson08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClassA {
	// serializing the Employee object into the file
	// c:/users/perlo/git/yfain_lessons\src/lesson08\BestEmployee.ser
  Employee emp = new Employee();
  FileOutputStream fOut = null;
  ObjectOutputStream oOut = null;//serializing
  ClassA(){
	  System.out.println("ClassA");
	  // populate with data
	  emp.lName = "John";
	  emp.fName = "Smith";
	  emp.salary = 50000;
	  emp.getEmployee("ClassA");
	  try {
		  fOut = new FileOutputStream(
	 "c:\\Users\\perlo\\git\\yfain_lessons\\src\\lesson08\\BestEmployee.ser"
				  );
		 oOut = new ObjectOutputStream(fOut);
		 oOut.writeObject(emp);// serialization
	  } catch (IOException e) {
		  e.printStackTrace();
	  }
	  try {
		  fOut = new FileOutputStream(
	 "c:/Users/perlo/git/yfain_lessons/src/lesson08/BestEmployee1.ser"
				  );
		 oOut = new ObjectOutputStream(fOut);
		 oOut.writeObject(emp);// serialization
	  } catch (IOException e) {
		  try {
			  oOut.flush();
			  oOut.close();
			  fOut.close();
		  } catch (Exception ioe) {
			  ioe.printStackTrace();
		  }
	  } finally {
		  
	  }
  }
}
