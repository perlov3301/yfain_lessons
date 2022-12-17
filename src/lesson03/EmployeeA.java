package lesson03;

public class EmployeeA extends PersonA {
	
    public EmployeeA(String name) {
    	super(name);
    }
    public boolean increasePay(int percent) {
    	System.out.println("A: Increase salary by " + 
         percent + "%. " + getName());
    	return true;
    }
}
