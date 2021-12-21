package yogeshNimbalkar;
//Assignment - 8 : 21 Dec 2021

public class A8_BankSystem {
	String username;
	int balance, printCallCount, debitCount, creditCount;
	static int totalDebitCount, totalCreditCount, totalPrintBalCount;
	
	void setUserDetails(String name, int initialBal) {
		username = name;
		balance = initialBal;
	}
	
	void debitAmount(int amt) {
		if(amt <= balance) {
			System.out.println("Amount to be debited is : " + amt);
			balance = balance - amt;
			System.out.println("Now the balance is : " + balance);
		}else {
			System.out.println("Insufficient balance");
			System.out.println("Your balance is : " + balance);
		}
		debitCount++;
		totalDebitCount++;
	}
	
	void creditAmount(int amt) {
		if(amt > 0) {
			System.out.println("Amount to be credited is : " + amt);
			balance = balance + amt;
			System.out.println("Now the balance is : " + balance);
		}else {
			System.out.println("Invalid input");
		}
		creditCount++;
		totalCreditCount++;
	}
	
	void printBalance() {
		System.out.println(username + " current balance is : " + balance);
		printCallCount++;
		totalPrintBalCount++;
	}
	
	void indTransactionSummary() {
		System.out.println(username + " transaction summary : " + "Credit - " + creditCount + " times, Debit - " + debitCount + " times, printBalance - " + printCallCount + " times");
	}
	
	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - " + totalCreditCount + " times, Debit - " + totalDebitCount + " times, printBalance - " + totalPrintBalCount + " times");		
	}
	
	public static void main(String[] args) {
		A8_BankSystem user1 = new A8_BankSystem();
		user1.setUserDetails("Yogesh", 10000);
		user1.creditAmount(5000);
		user1.debitAmount(3000);
		user1.printBalance();
		user1.creditAmount(8000);
		user1.indTransactionSummary();
		A8_BankSystem user2 = new A8_BankSystem();
		user2.setUserDetails("Sagar", 15000);
		user2.debitAmount(12000);
		user2.debitAmount(5000);
		user2.creditAmount(7000);
		user2.creditAmount(9500);
		user2.creditAmount(6500);
		user2.creditAmount(15000);
		user2.creditAmount(2500);
		user2.indTransactionSummary();
		user1.allTransactionSummary();
	}
}

