package lesson10;

public class CsyncronizingMethod extends Thread {
   // ...
	synchronized void
	 withdrawCash(int accountID, int amount){
	// Some thread-safe code goes here
	//,i.e. reading from a file or a database
		boolean allowTransaction = 
				validateWithdrawal(accountID, amount);
		if (allowTransaction) {
			updateBalance(accountID, amount, "Withdraw");
		} else {
			System.out.println(
				"Not enough money on the account");
		}
	}
	boolean validateWithdrawal(int accountID, int amount) {
		return true;
	}
	void updateBalance(int accountID, int amount, 
			String action) {
		
	}
	
}
