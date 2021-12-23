package apurva;

public class A8_Static_AtmTransaction {

	int balance;
	String userName;
	int debitcount;
	int creditcount;
	int printcount;
	static int debitcnt;
	static int creditcnt;
	static int printcnt;

	void setUserDetails(int amount, String name) {
		balance = amount;
		userName = name;
	}

	void debitAmount(int amount) {
		if (amount <= balance) {
			balance = balance - amount;
		} else
			System.out.println("Invalid amount");
		debitcount++;
		debitcnt++;
	}

	void creditAmount(int amount) {
		balance = balance + amount;
		creditcount++;
		creditcnt++;
	}

	void printBalance() {
		System.out.println("Balance in given account: " + balance + "Rs");
		printcount++;
		printcnt++;
	}

	void individualTransactionSummary() {
		System.out.println(userName + " transaction Summary: " + "Credit - " + creditcount + " times, " + "debit - "
				+ debitcount + " times," + " Print Balance - " + printcount + " time");
	}

	void allTransactionSummary() {
		System.out.println("All transaction Summary: " + "Credit - " + creditcnt + " times, " + "debit - " + debitcnt
				+ " times," + " Print Balance - " + printcnt + " time");
	}

	public static void main(String[] a) {
		A8_Static_AtmTransaction atm = new A8_Static_AtmTransaction();
		atm.setUserDetails(5000, "User1");
		atm.creditAmount(1000);
		atm.debitAmount(300);
		atm.creditAmount(800);
		atm.printBalance();
		atm.individualTransactionSummary();
		System.out.println("----------------------------------------------------------");
		A8_Static_AtmTransaction atm1 = new A8_Static_AtmTransaction();
		atm1.setUserDetails(10000, "User2");
		atm1.creditAmount(1000);
		atm1.debitAmount(1000);
		atm1.creditAmount(500);
		atm1.creditAmount(100);
		atm1.debitAmount(100);
		atm1.creditAmount(50);
		atm1.creditAmount(100);
		atm1.individualTransactionSummary();
		System.out.println("----------------------------------------------------------");
		atm.allTransactionSummary();

	}

}
