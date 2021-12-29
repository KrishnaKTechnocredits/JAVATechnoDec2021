
package ashutosh;

public class A8_BankSystem {
	
	int balance;
	String username;
	
	int debitCount;
	int creditCount;
	int printCount;
	
	static int OverallDebitCount;
	static int overallCreditCount;
	static int overallPrintCount;
	
	void setUserDetails (String user, int initialbalance) {
		username=user;
		balance=initialbalance;
		
	}	
	
	void debitAmount(int amt) {
		
		debitCount++;
		OverallDebitCount++;
	}
	
	void creditAmount(int amt) {

		creditCount++;
		overallCreditCount++;
	
	}
	
	void printBalance() {
		
		 printCount++;
		 overallPrintCount++;		
		
	}
	
	void individualTransactionSummary(String user) {
		
		System.out.println(user + " Credit "+ creditCount + " Debit " + debitCount + " Print " + printCount );
	}
	 
    static void allTransactionSummary() {
    	
		System.out.println("OverallCredit "+ overallCreditCount + " OverallDebit " + OverallDebitCount + " OverallPrint " + overallPrintCount );
	
	}
		
	public static void main (String [] Args) {
		A8_BankSystem user1=new A8_BankSystem();
		A8_BankSystem user2=new A8_BankSystem();
		user1.setUserDetails("Ashu", 1000);
		user1.debitAmount(100);
		user1.debitAmount(100);
		user1.creditAmount(200);
		user1.creditAmount(200);
		user1.printBalance();
		user1.individualTransactionSummary("Ashu");
		
		user2.setUserDetails("Shahi", 1000);
		user2.debitAmount(100);
		user2.creditAmount(200);
		user2.printBalance();
		user2.individualTransactionSummary("Shahi");
		
		allTransactionSummary();
		
			
	}

}
 