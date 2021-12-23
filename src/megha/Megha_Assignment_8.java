package megha;

public class Megha_Assignment_8 {

	int debitCnt, creditCnt, printBalCnt;
	static int debitCount;
	static int creditCount;
	static int printBalCount;
	double balance;
	String username;

	void setUserDetails(String name, double bal) {
		username = name;
		balance = bal;
	}

	void debitAmt(double amt) {
		if (amt <= balance)
			balance = balance - amt;
		else
			System.out.println("Insufficient balance : " + balance);
		debitCnt++;
		debitCount++;
	}

	void creditAmt(double amt) {
		if (amt > 0) {
			balance = balance + amt;
		}
		creditCnt++;
		creditCount++;
	}

	void printBalance() {
		System.out.println("The Current Balance is : " + balance);
		printBalCnt++;
		printBalCount++;
	}

	void individualTransactionSummary() {
		System.out.println(username + " Debited : " + debitCnt + "times");
		System.out.println(username + " Credited : " + creditCnt + "times");
		System.out.println(username + " Printed Balance : " + printBalCnt + "times");
	}

	static void allTransactionSummary() {
		System.out.println("Debits from both users : " + debitCount + "times");
		System.out.println("Credits from both users : " + creditCount + "times");
		System.out.println("Printed Balance by both users: " + printBalCount + "times");
	}

	public static void main(String[] args) {
		Megha_Assignment_8 user1 = new Megha_Assignment_8();
		user1.setUserDetails("Ramya Jerald", 50000);
		user1.debitAmt(10000);
		user1.creditAmt(1500);
		user1.creditAmt(1500);
		user1.printBalance();
		user1.individualTransactionSummary();
		System.out.println();

		Megha_Assignment_8 user2 = new Megha_Assignment_8();
		user2.setUserDetails("Olivia P.", 80000);
		user2.debitAmt(50000);
		user2.creditAmt(3000);
		user2.creditAmt(3000);
		user2.creditAmt(3000);
		user2.creditAmt(3000);
		user2.creditAmt(3000);
		user2.individualTransactionSummary();
		System.out.println();
		
		allTransactionSummary();
	}

}
