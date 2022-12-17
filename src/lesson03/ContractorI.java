package lesson03;
// without super class
public class ContractorI implements Payable {
    private String name;
    ContractorI(String vn) {
    	this.name  = vn;
    }
    String getName() {
    	return ("person's name is " + name);
    }
    public boolean increasePay(int percent) {
    	if (percent <= INCREASE_CAP) {
    		System.out.println("I: increasing Salary by " +
    	percent + "%. " + getName());
    		return true;
    	} else {
    		System.out.println("I: Sorry for "+name+", can't increase" +
    	" more than " + INCREASE_CAP);
    		return false;
    	}
    }
}
