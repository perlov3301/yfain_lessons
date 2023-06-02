package lesson10;

public class CsynchronizingBlock {
//...
	boolean validateWithdrawal(
			int accountID, int amount) {
		return true;
	}
	void updateBalance(
		int accountID, int amount, String action) {
		
	}
	void withdrawCash(int  accountID, int amount) {
		// some thread-safe code goes here.
		//reading from a file or a database
		synchronized(this) {
			boolean allowTransaction = 
				validateWithdrawal(accountID, amount);
			if (allowTransaction) {
			  updateBalance(accountID, amount, "Withdraw");
			} else {
			  System.out.println(
				"Not enough many on the account");	
			}
		}
	}
}
