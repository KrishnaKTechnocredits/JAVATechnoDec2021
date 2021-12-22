package naquibalam;

public class A8_Bank {

	String userName;
	int balance;
	int creditIndividual;
	int debitIndividual;
	int printBalIndividual;
	static int creditAll;
	static int debitAll;
	static int printBalAll;
	
	void userDetails(String User, int bal) {
		userName = User;
		balance = bal;
	}
	
	void debit(int amt) {
		if (amt <= balance) {
			System.out.println("Amount to be debited - " + amt);
			balance = balance - amt;
			System.out.println("Total balance remaining - " + balance);
			debitIndividual++;
			debitAll++;
		} else
			System.out.println("Debit amount - " + amt + " is more than the balance - " + balance);
	}
	
	void credit(int amt) {
		if (amt > 0) {
			System.out.println("Amount to be credited - " + amt);
			balance = balance + amt;
			System.out.println("Total balance remaining - " + balance);
			creditIndividual++;
			creditAll++;
		} else
			System.out.println("Credit amount is less that zero");
	}
	
	void printBalance() {
		System.out.println("Total balance is - " + balance);
		printBalIndividual++;
		printBalAll++;
	}
	
	void individualTransactionSummary() {
		System.out.println(userName + " - Transaction Summary : Credit - " + creditIndividual + " times, Debit - " + debitIndividual + " times, Print Balance - " + printBalIndividual + " times");
	}
	
	static void allTransactionSummary() {
		System.out.println("All Transaction Summary : Credit - " + creditAll + " times, Debit - " + debitAll + " times, Print Balance - " + printBalAll + " times");
	}
	
	public static void main(String[] args) {
		A8_Bank user1 = new A8_Bank();
		user1.userDetails("Naquib", 5000);
		user1.credit(200);
		user1.credit(300);
		user1.debit(600);
		user1.printBalance();

		A8_Bank user2 = new A8_Bank();
		user2.userDetails("Hussain", 2000);
		user2.credit(100);
		user2.credit(200);
		user2.credit(400);
		user2.credit(300);
		user2.credit(100);
		user2.debit(400);
		user2.debit(400);

		user1.individualTransactionSummary();
		user2.individualTransactionSummary();
		
		A8_Bank.allTransactionSummary();
	}
}
