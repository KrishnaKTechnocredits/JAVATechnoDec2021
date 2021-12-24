package sandip;

public class Assignment8 {

	int creditcount;
	int debitcount;
	int printbalance;
	int balance = 1000;
	static int creditno;
	static int debitno;
	static int printbal;

	void debitAmt(int amt) {
		if (amt <= balance) {
			balance = balance - amt;
			debitcount++;
			debitno++;
		}
	}

	void creditAmt(int amt) {
		if (amt > 0) {
			balance = balance + amt;
			creditcount++;
			creditno++;
		}
	}

	void printBalance() {
		System.out.println(balance);
		printbalance++;
		printbal++;
	}

	void individualTransactionSummary() {
		System.out.println("Credit : " + creditcount + " times");
		System.out.println("Debit : " + debitcount + " times");
		System.out.println("Print Balance : " + printbalance + " times");
	}

	public static void main(String[] args) {
		Assignment8 user1 = new Assignment8();
		user1.debitAmt(500);
		user1.debitAmt(250);
		user1.creditAmt(1500);
		user1.creditAmt(1500);
		user1.printBalance();
		user1.individualTransactionSummary();
		System.out.println();

		Assignment8 user2 = new Assignment8();
		user2.debitAmt(100);
		user2.debitAmt(500);
		user2.creditAmt(450);
		user2.creditAmt(1000);
		user2.printBalance();
		user2.debitAmt(100);
		user2.debitAmt(500);
		user2.creditAmt(450);
		user2.individualTransactionSummary();
		System.out.println("Below is the total summary count");
		System.out.println("Debit :" +Assignment8.debitno);
		System.out.println("Credit :" +Assignment8.creditno);
		System.out.println("Print :"+Assignment8.printbal);
	}
}
