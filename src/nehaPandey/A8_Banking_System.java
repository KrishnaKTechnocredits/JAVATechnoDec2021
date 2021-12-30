package nehaPandey;

public class A8_Banking_System {

	int balance;
	String username;
	int DebitCount, CreditCount, PrintBalanceCount;

	static int TotalDebitCount, TotalCreditCount, TotalPrintBalanceCount;

	void debitAmount(int amount) {
		if (balance > 0 && amount < balance) {
			balance = balance - amount;
			DebitCount++;
			TotalDebitCount++;
		}

		else {
			System.out.println("You do not have sufficient balance");

		}

	}

	void creditAmount(int amount) {
		balance = balance + amount;
		CreditCount++;
		TotalCreditCount++;
	}

	void printBalance() {

		PrintBalanceCount++;
		TotalPrintBalanceCount++;

	}

	void individualTransactionSummary() {

		System.out.println(username + " transactions summary: Debit- " + DebitCount + " times, Credit- " + CreditCount
				+ " times, printbalance- " + PrintBalanceCount + " times");
		System.out.println();

	}

	static void allTransactionSummary() {

		System.out.println("All transactions summary:" + " Debit- " + TotalDebitCount + " times, Credit- "
				+ TotalCreditCount + " times, printbalance- " + TotalPrintBalanceCount + " times");
	}

	void SetUsername(String user) {

		username = user;
		System.out.println("Current balance of " + username + ": " + balance);
		individualTransactionSummary();
	}

	void SetInitialBalance(int bal) {
		balance = bal;

	}

	public static void main(String[] args) {
		A8_Banking_System user1 = new A8_Banking_System();
		user1.SetInitialBalance(3000);
		user1.debitAmount(600);
		user1.debitAmount(1000);
		user1.creditAmount(600);
		user1.debitAmount(100);
		user1.SetUsername("Anmesh");

		A8_Banking_System user2 = new A8_Banking_System();
		user2.SetInitialBalance(6000);
		user2.debitAmount(400);
		user2.creditAmount(600);
		user2.debitAmount(100);
		user2.printBalance();
		user2.SetUsername("Navya");
		allTransactionSummary();

	}
}
