package lesson10;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CreentrantLock {
  private Lock accountLock = new ReentrantLock();
  boolean validateWithdrawal(int aID, int amount){
	  return true;
  }
  void updateBalance(int aID, 
		 int amount, String action) {
	  
  }
  void withdrawCash(int accountID, int amount){
	 // reading from from file or a database...
	  boolean allowTransaction = 
				validateWithdrawal(accountID,amount);
	 accountLock.lock();
	 
	 try {
		 if(allowTransaction) {
			 updateBalance(accountID, amount, "Withdraw");
		 }else {
			 System.out.println("Not enough money on the account");
		 }
	 } finally {
		 accountLock.unlock();// allow other threads
		 // to update the Balance
		 
	 }
  }
  
}
