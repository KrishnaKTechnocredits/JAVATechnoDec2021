package vivek;

public class A8_BankSystem {

	int debitIndividualCount;
	int creditIndividualCount;
	int printBalancecount;
	static int debitAllCount;
	static int creditAllCount;
	static int printAllCount;
	String username;
	int balance;



	void setUsersDetails(String user, int bal) {
		username = user;
		balance = bal;
	}
	void debitAmount(int amt) {
		if(amt <= balance) {
			System.out.println("amount to be debited is -" + amt);
			balance = balance - amt;
			System.out.println("Total remaining balance is:-" + balance);
			debitIndividualCount++;
			debitAllCount++;
		}
		else {
			System.out.println("Debit amount - " + amt + " is more than the balance - " + balance);
		}
	}

	void creditAmount(int amt) {
		if(amt >0) {
			System.out.println("amount to be credit is :" + amt);
			balance = balance + amt;
			System.out.println("Total balance remaining - " + balance);
			creditIndividualCount++;
			creditAllCount++;
		}
		else {
			System.out.println("Credit amount is less that zero");
		}
	}

	void printBalance() {
		System.out.println("Total balance is - " + balance);
		printBalancecount++;
		printAllCount++;
	}

	void individualTransactionSummary() {
		System.out.println(username + " - Transaction Summary : Credit - " + creditIndividualCount + " times, Debit - " + debitIndividualCount + " times, Print Balance - " + printBalancecount + " times");
	}

	void allTransactionSummary() {
		System.out.println("All Transaction Summary : Credit - " + creditAllCount + " times, Debit - " + debitAllCount + " times, Print Balance - " + printAllCount + " times");
	}

	public static void main(String[] args) {
		A8_BankSystem bank1 = new A8_BankSystem();
		bank1.setUsersDetails("Vivek", 1000);
		bank1.creditAmount(200);
		bank1.debitAmount(600);
		bank1.printBalance();

		A8_BankSystem bank2 = new A8_BankSystem();
		bank2.setUsersDetails("Kumar", 2000);
		bank2.creditAmount(100);
		bank2.creditAmount(200);
		bank2.creditAmount(400);
		bank2.creditAmount(100);
		bank2.debitAmount(400);
		bank2.debitAmount(400);

		bank2.individualTransactionSummary();
		bank2.individualTransactionSummary();

		bank2.allTransactionSummary();
	}
}
