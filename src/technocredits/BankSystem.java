package technocredits;

public class BankSystem {
	int balance;
	String username;
	int debitCnt = 0;
	
	void setUserDetails(int initialBal, String name) {
		balance = initialBal;
		username = name;
	}
	
	void debitAmt(int amt) {
		if(amt <= balance) {
			System.out.println("Amt to be debited " + amt);
			balance = balance - amt;
			System.out.println("Now balance is " + balance);
		}else
			System.out.println("Insufficient balance");
		debitCnt++;
	}
	
	void printSUmmary() {
		System.out.println(username + " - debitOp -" + debitCnt);
	}
	void creditAmt(int amt) {
		if(amt > 0) {
			System.out.println("Credits amt is " + amt);
			balance = balance + amt;
		}else
			System.out.println("Invalid input");
	}
	
	void printBalance() {
		System.out.println("Your balance is " + balance);
	}
}
