package lesson08;

public class Employee implements java.io.Serializable {
// marker Interface=without methods to implement
   String lName;
   String fName;
   double salary;
   Employee(){
 // object state = values of the fields for instance 
//	   this.lastName = last;
//	   this.firstName = first;
//	   this.salary = sal;
   }
 // rather than sending to a stream one property
 // at a time, send one object  at a time using
 // ObjectOutputStream-> serializing and 
 // ObjectInputStream-> de-serializing
}
