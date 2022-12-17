package lesson03;
// without super class
public class EmployeeI implements Payable {
	private String name;
	EmployeeI(String vn){
		this.name = vn;
	}
	String getName() {
		return ("Person's name is " + name);
	}
    public boolean increasePay(int percent) {
    	System.out.println("I: Increasing Salary by " + percent +"%");
    	return true;
    }
}
