package lesson08;

public class Employee implements java.io.Serializable {
// marker Interface=without methods to implement
   String lName;
   String fName;
   // I do not want to serialize 'salary'
   transient double salary;
   Employee(){// object state = values of the fields for instance 
   }
 // rather than sending to a stream one property at a time, send one object  at a time using
 // ObjectOutputStream-> serializing and 
 // ObjectInputStream-> de-serializing
   void getEmployee(String cla) {
	   // salary wont be serialized
	   System.out.println(cla +"; Employee "+fName+" "+lName
			   + " with the Salary of $"+salary+"(transient variable)");
   } 
}
