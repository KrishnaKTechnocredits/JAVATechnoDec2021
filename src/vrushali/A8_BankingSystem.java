package vrushali;

public class A8_BankingSystem {
	int credeitAmt;
	int debitAmt;
	int initialBalance;
	int printBalance;
	static int systemDebitAmt;
	static int systemCreditAmt;
	static int systemPrintbalance;
	
	String username;
	
	void setUserDetails(int initialBalace, String name) {
		initialBalance = initialBalace;
		username = name;
		System.out.println(name + " your initial balance is " + initialBalace);
	}
	
	void debitAmount(int amt) {
		if(amt <= initialBalance) {
			System.out.println("Amount to be debited " + amt);
			initialBalance = initialBalance- amt;
			System.out.println("Now balance is " + initialBalance);
		}
		else
			System.out.println("Insufficient balance");
		debitAmt++;
		systemDebitAmt++;
	}
	
	void creditAmount(int amt) {
		if(amt > 0) {
			System.out.println("Credited amount is " +amt);
			initialBalance = initialBalance +amt;
			
		}else
			System.out.println("Invalid Input	");
		credeitAmt++;
		systemCreditAmt++;
	}
	
	void printBalance() {
		System.out.println(initialBalance);
		printBalance++;
		systemPrintbalance++;
	}
	
	void individualTransactionSummary() {
		System.out.println(username + " transaction summary is: credit " +credeitAmt+ " debit " + debitAmt + " printBalanc " + printBalance);
	}
	
	void allTransactionSummary() {
		System.out.println("Total transaction summary is: credit " +systemCreditAmt+ " debit " + systemDebitAmt + " printBalanc " + systemPrintbalance);
	}
	
	public static void main(String[] args) {
		A8_BankingSystem user1 = new A8_BankingSystem();
		user1.setUserDetails(1000, "Vrushali");
		user1.creditAmount(500);
		user1.creditAmount(1000);
		user1.debitAmount(1000);
		user1.printBalance();
		user1.individualTransactionSummary();
		
		A8_BankingSystem user2 = new A8_BankingSystem();
		user2.creditAmount(2000);
		user2.setUserDetails(1000, "Sagar");
		user2.creditAmount(1000);
		user2.creditAmount(500);
		user2.creditAmount(500);
		user2.creditAmount(20000);
		user2.debitAmount(2000);
		user2.debitAmount(1000);
		user2.individualTransactionSummary();
		user2.allTransactionSummary();
		
	}
}
