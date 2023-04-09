package lesson08;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class EmpProcessorExternalizable {
	EmployeeExternalizable emp;
	FileOutputStream fOut = null;
	ObjectOutputStream oOut = null;
	
	EmpProcessorExternalizable() {
		System.out.println("EmpProcessorExternalizable");
		emp= new EmployeeExternalizable();
		emp.fName="John_New";
		emp.lName="Smith_New";
		emp.salary=51000;
		emp.address="12 Main street";
		emp.hireDate = new Date();
		emp.id = 123;
		emp.getEmployee("EmpProcessorExternalizable");
		try {
			fOut=new FileOutputStream(
"c:\\Users\\perlo\\git\\yfain_lessons\\src\\lesson08\\NewEmployee2.ser"
					);
			oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(emp);// serializing emp
			
			fOut=new FileOutputStream(
"c:/Users/perlo/git/yfain_lessons/src/lesson08/NewEmployee3.ser"
							);
			oOut = new ObjectOutputStream(fOut);
			oOut.writeObject(emp);// serializing emp
			System.out.println(
"an Employee new  is externalized" + 
" into 'NewEmployee2.ser' and 'NewEmployee3.ser'");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
