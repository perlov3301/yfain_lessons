package lesson10copy;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Cexample3 extends Thread {
	private Lock accountLock = new ReentrantLock();
	void updateBalance(int accountID, int amount,
			String str) {
		
	}
	boolean allowWithdrawal(int accountId, int amount){
		return true;
	}
	void withdrawCash(int accountID, int amount) {
		// reading a database
		accountLock.lock();
		boolean allowTransaction=allowWithdrawal(
				accountID,amount);
		try {
			if(allowTransaction) {
			updateBalance(accountID, amount, "Withdraw");
			}else {
				System.out.println("Not enough money");
			}
		} finally {
			accountLock.unlock();// allow other threads
		}
	}

}
