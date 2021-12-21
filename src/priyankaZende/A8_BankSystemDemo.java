package priyankaZende;

public class A8_BankSystemDemo {
	String username;
	static int overAllDebitCount, overAllCreditCount, overAllPrintCount;
	int balance, debitCount, creditCount, printCount;

	void setUserDetails(String name, int initialBal) {
		username = name;
		balance = initialBal;
	}

	void debitAmount(int amt) {
		System.out.println(" amount to be debited is: " + amt);
		if (balance >= amt) {
			balance = balance - amt;
			System.out.println("Avaliable balance is: " + balance);
		} else
			System.out.println("Insufficient Balance");
		debitCount++;
		overAllDebitCount++;
	}

	void creditAmount(int amt) {
		System.out.println(" amount to be credited is: " + amt);
		balance = balance + amt;
		System.out.println("Avaliable balance is: " + balance);
		creditCount++;
		overAllCreditCount++;
	}

	void printBalance() {
		System.out.println("For user " + username + " available balace is: " + balance);
		printCount++;
		overAllPrintCount++;
	}

	void individualTransactionSummary() {
		System.out.println(username + " transaction summary : Credit - " + creditCount + " times, Debit - " + debitCount
				+ " times, printBalance - " + printCount + " times");
	}

	static void allTransactionSummary() {
		System.out.println(" All transaction summary : Credit - " + overAllCreditCount + " times, Debit - "
				+ overAllDebitCount + " times, printBalance - " + overAllPrintCount + " times");
	}

	public static void main(String[] args) {
		A8_BankSystemDemo a8_BankSystemDemo1 = new A8_BankSystemDemo();
		System.out.println("----------------------------------------");
		a8_BankSystemDemo1.setUserDetails("User1", 10000);
		a8_BankSystemDemo1.creditAmount(1000);
		a8_BankSystemDemo1.creditAmount(2000);
		a8_BankSystemDemo1.debitAmount(3000);
		a8_BankSystemDemo1.printBalance();
		a8_BankSystemDemo1.individualTransactionSummary();

		A8_BankSystemDemo a8_BankSystemDemo2 = new A8_BankSystemDemo();
		a8_BankSystemDemo2.creditAmount(2000);
		a8_BankSystemDemo2.creditAmount(1000);
		a8_BankSystemDemo2.creditAmount(3000);
		a8_BankSystemDemo2.creditAmount(5000);
		a8_BankSystemDemo2.creditAmount(7000);
		a8_BankSystemDemo2.debitAmount(3000);
		a8_BankSystemDemo2.debitAmount(2000);
		a8_BankSystemDemo2.individualTransactionSummary();
		A8_BankSystemDemo.allTransactionSummary();
	}

}
