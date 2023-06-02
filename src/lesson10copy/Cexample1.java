package lesson10copy;

public class Cexample1 extends Thread {
   synchronized void withdrawCash(int accountID, int amount) {
	   // reading from a database
	   boolean allowTransaction = validateWithdrawal(
			   accountID, amount);
	   if (allowTransaction) {
		   updateBalance(accountID, amount, "Withdraw");
	   } else {
		   System.out.println("Not enough money on the account");
	   }
	   
   }
   boolean validateWithdrawal(
		   int accountID,int amount) {
	   return true;
   }
   void updateBalance(int accountID, int amount,
		   String message) {
	   
   }
}
