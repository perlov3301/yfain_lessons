package lesson08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ClassA {
  Employee emp = new Employee();
  FileOutputStream fOut = null;
  ObjectOutputStream oOut = null;
  ClassA(){
	  emp.lName = "John";
	  emp.fName = "Smith";
	  emp.salary = 50000;
	  try {
   //"C:\\Users\\perlo\\git\\yfain_lessons\\src\\lesson08"
		  fOut = new FileOutputStream(
	 "c:\\Users\\perlo\\git\\yfain_lessons\\src\\lesson08\\BestEmployee.ser"
				  );
		 oOut = new ObjectOutputStream(fOut);
		 oOut.writeObject(emp);// serialization
	  } catch (IOException e) {
		  e.printStackTrace();
	  }
  }
}
