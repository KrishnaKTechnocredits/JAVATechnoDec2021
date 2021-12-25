package shwetaBhosale;

public class A8_BankSystem {
	String name;
	int totalAmount;
	int debitCount = 0;
	int creditCount = 0;
	int printBalanceCount = 0;
	static int totalDebitCount = 0;
	static int totalCreditCount = 0;
	static int totalPrintBalanceCount = 0;

	void customerDetails(String customerName, int intialAmount) {
		name = customerName;
		totalAmount = intialAmount;
	}

	void debitAmount(int amount) {
		while (amount <= totalAmount)
			totalAmount = totalAmount - amount;
		debitCount++;
		totalDebitCount++;
	}

	void creditAmount(int amount) {
		totalAmount = totalAmount + amount;
		creditCount++;
		totalCreditCount++;
	}

	void printBalance() {
		System.out.println("Current Balance in " + name + "'s account : " + totalAmount);
		printBalanceCount++;
		totalPrintBalanceCount++;
	}

	void individualTransactionSummary() {
		System.out.println(name + " transaction summery : Credit - " + creditCount + " times, Debit - " + debitCount
				+ " times, printBalance - " + printBalanceCount + " times");

	}

	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - " + totalCreditCount + " times, Debit - "
				+ totalDebitCount + " times, Printbalance - " + totalPrintBalanceCount + " times");

	}

	public static void main(String[] args) {
		A8_BankSystem a8_bankingSystem1 = new A8_BankSystem();
		a8_bankingSystem1.customerDetails("Ria", 5000);
		a8_bankingSystem1.creditAmount(500);
		a8_bankingSystem1.debitAmount(1500);
		a8_bankingSystem1.creditAmount(1000);
		a8_bankingSystem1.printBalance();
		a8_bankingSystem1.individualTransactionSummary();
		A8_BankSystem bankingSystem2 = new A8_BankSystem();
		bankingSystem2.customerDetails("Tia", 10000);
		bankingSystem2.creditAmount(100);
		bankingSystem2.debitAmount(1500);
		bankingSystem2.creditAmount(1000);
		bankingSystem2.creditAmount(400);
		bankingSystem2.creditAmount(4000);
		bankingSystem2.creditAmount(500);
		bankingSystem2.debitAmount(3000);
		bankingSystem2.individualTransactionSummary();
		// bankingSystem2.printBalance();
		a8_bankingSystem1.allTransactionSummary();

	}

}