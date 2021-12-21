package kalyani;

public class A8_BankSystem {
	int balance;
	String username;
	int debitCount = 0;
	int creditCount = 0;
	int printBalCount = 0;
	static int summaryCreditCount=0;
	static int summaryDebitCount=0;
	static int summaryPrintBalCount=0;
	
	void setUserDetails(int initialBal, String name) {
		balance = initialBal;
		username = name;
		System.out.println(username + " " + initialBal);
	}
	
	void debitAmt(int amt) {
		if(amt <= balance) {
			System.out.println("Amount to be debited " + amt);
			balance = balance - amt;
		}else
			System.out.println("Insufficient balance");
		
			debitCount++;
			summaryDebitCount++;
	}
	
	void creditAmt(int amt) {
		if(amt>0) {
			System.out.println("Amount credited is " + amt);
			balance= balance+amt;
		}
		else 
			System.out.println("Insufficient balance");
		
			creditCount++;
			summaryCreditCount++;
	}
		
	void printBalance() {
		System.out.println(username + " current balance is : " + balance);
		printBalCount++;
		summaryPrintBalCount++;
	}		
			
	void individualTransactionSummary() {
		System.out.println(username+ " all transaction " + " Credit: " + creditCount + " Debit: " + debitCount + " printbalance: " + printBalCount );
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
	}
	
	static void allTransactionSummary() {
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
		System.out.println("Over all transaction is" + " Credit: " + summaryCreditCount + " Debit: " + summaryDebitCount + " printbalance: " + summaryPrintBalCount);
		System.out.println("--------------------------------------------------------------------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		A8_BankSystem user1 = new A8_BankSystem();
		A8_BankSystem user2 = new A8_BankSystem();
		
		user1.setUserDetails(3000, "Kalyani");
		user1.creditAmt(10000);
		user1.creditAmt(1000);
		user1.creditAmt(1000);
		user1.debitAmt(500);
		user1.debitAmt(2000);
		user1.printBalance();
		user1.individualTransactionSummary();
		
		user2.setUserDetails(8000, "Ragini");
		user2.creditAmt(3000);
		user2.creditAmt(10000);
		user2.debitAmt(100);
		user2.printBalance();
		user2.individualTransactionSummary();
		
		allTransactionSummary();
	}	
}
	


