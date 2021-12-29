package jagdish;

public class A8_Assignment_BankingSystem {
	
	 String username;
	 int individualCreditCount,individualdebitCount,individualbalancePrint;
	 static int allCredit, allDebit, allPrint;
	 int balance;

	void setUserDetails(String name , int initialbal) {
			 username= name;
			 balance = balance+initialbal;
			 System.out.println("Initial opening balance for " + username + " : Rs " + balance);
		}
		
	void debitAmount(int amt) {
		if(amt <=balance) {
			System.out.println("Amount to be Debited:- " + amt);
			balance = balance - amt;
			individualdebitCount++;
			allDebit++;
		}else
			System.out.println("Insuffient balance");
	} 
	
	void creditAmount(int amt) {
			if(amt >0) {
				System.out.println("Amount to be Credited:- " + amt);
			   balance = amt  + balance;
			  // System.out.println("The Current Balance after credit is:- " + balance);
			   individualCreditCount++;	
			   allCredit++;
			}		
	}

	void printBalance() {
	  System.out.println("Current balance for " + username + " is : Rs. " + balance);
	  individualbalancePrint++; //Non-static
	  allPrint++; //static	
	}
	
	void individualTransactionSummary() {
		System.out.println("Customer name "+username+" & transaction summary's are : Credit - "+individualCreditCount+" times, Debit - "+individualdebitCount+" times, printBalance - "+individualbalancePrint+" times");
	}
	
	void allTransactionSummary() {
		System.out.println(" All Transaction Summary  : ");
		System.out.println(" Credit Transactions is  : " + allCredit);
		System.out.println(" Debit Transactions is  : " + allDebit);
		System.out.println(" Print Transactions is : " + allPrint);
	} 
	
	public static void main(String[] args) {
		A8_Assignment_BankingSystem  user1 = new A8_Assignment_BankingSystem();
		user1.setUserDetails("Jagdish",10000);
		user1.debitAmount(500);
		user1.creditAmount(1000);
		user1.creditAmount(500);
		user1.debitAmount(200);
		user1.debitAmount(350);
		user1.creditAmount(25);
		user1.printBalance();
		user1.individualTransactionSummary();
		
		A8_Assignment_BankingSystem user2 = new A8_Assignment_BankingSystem();
		user2.setUserDetails("Anil",1500);
		user2.creditAmount(900);
		user2.debitAmount(900);
		user2.creditAmount(900);
		user2.debitAmount(100);
		user2.debitAmount(200);
		user2.debitAmount(100);
		user2.printBalance();
		user2.individualTransactionSummary();
		System.out.println();
		user2.allTransactionSummary();	
	}

}