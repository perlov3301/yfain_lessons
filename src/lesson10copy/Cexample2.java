package lesson10copy;

public class Cexample2 extends Thread {
  boolean validateWithdrawal(
		  int accountID, int amount) {
	  return true;
  }
  void updateBalance(int accountID, int amount, String str) {
	  
  }
  void withdrawCash(int accountID, int amount){
	  // reading a database
	  synchronized(this) {
		  boolean allowTransaction=validateWithdrawal(
				  accountID, amount);
		  if (allowTransaction) {
			  updateBalance(accountID, amount, "Withdraw");
		  } else {
			  System.out.println("Not enough money");
		  }
	  }
  }
}
