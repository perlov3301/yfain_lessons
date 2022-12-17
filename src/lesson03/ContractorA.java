package lesson03;

public class ContractorA extends PersonA {
    private String aname;
	public ContractorA(String name) {
		super(name);
		this.aname = name;
	}
	public boolean increasePay(int percent) {
		if(percent < INCREASE_CAP) {
			System.out.println("A: Increase salary by " + 
		percent + "%. " + getName());
			return true;
		} else {
			System.out.println("A: Sorry for "+aname+", can't increase more than " +
		INCREASE_CAP);
			return false;
		}
	}
}
