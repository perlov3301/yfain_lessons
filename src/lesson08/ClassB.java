package lesson08;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ClassB {
  FileInputStream fIn = null;
  ObjectInputStream oIn = null;
  Employee bestEmpl = null;
  ClassB() {
	  System.out.println("Class B");
	  try {// salary wont be serialized
		  fIn = new FileInputStream(
	"c:\\Users\\perlo\\git\\yfain_lessons\\src\\lesson08\\BestEmployee.ser");
		  oIn = new ObjectInputStream(fIn);
		  System.out.println("ClassB;oIn: " + oIn);
		  bestEmpl = (Employee) oIn.readObject();
		  System.out.println("ClassB; bestEmp1:" + bestEmpl);
		  
	  } catch(ClassNotFoundException cnf) {
		  cnf.printStackTrace();
	  } 
	  catch (IOException e) {
		  try {
			  oIn.close();
			  fIn.close();
		  }catch(IOException ioe) {
			  ioe.printStackTrace();
		  }
	  } finally {
		  if (oIn != null) {
			  System.out.println("the Employee object"+
		  " has been deserialized from BestEmployee.ser");
		  }
		bestEmpl.getEmployee("ClassB");// print to console

	  }
  }
}
