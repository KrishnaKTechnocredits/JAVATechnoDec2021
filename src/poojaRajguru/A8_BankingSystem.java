package poojaRajguru;

public class A8_BankingSystem {
	
	int debit,credit,print,balance;
	String userName;
	static int totalDebit,totalCredit,totalPrint;
	
	void userData(int bal , String name) {
		balance = bal;
		userName = name;
		System.out.println("Initial Balance For " + userName + " " + bal);
	}
	
	void debit(int amt) {
		if(amt<=balance) {
			balance = balance - amt;
			System.out.println("Debited Amount "  + amt);
			debit++;
			totalDebit++;
		}
		else
			System.out.println("Insufficient Funds..");
	}
	
	void credit(int amt) {
		if(amt>0) {
			balance = balance + amt;
			credit++;
			totalCredit++;
			System.out.println("Credited Amount " + amt);
		}
		else
			System.out.println("Invalid amount...");
	}
	
	void printBal() {
		System.out.println("Balance for "  + userName  + " " + balance);
		print++;
		totalPrint++;
	}
	
	void individualCount() {
		System.out.println("Individual Transaction Summary for " +  userName);
		System.out.println("Debit Transaction: " + debit);
		System.out.println("Credit Transaction : " + credit);
		System.out.println("Print Transaction : " + print);
	}
	
	void allTransaction() {
		System.out.println("All Transaction Summary ");
		System.out.println("All Debit Transaction : " + totalDebit);
		System.out.println("All Credit Transaction : " + totalCredit);
		System.out.println("All Print Transaction : " + totalPrint);
	}
	
	public static void main(String[] args) {
		A8_BankingSystem bs = new A8_BankingSystem();
		bs.userData(1000, "Pooja");
		bs.debit(500);
		bs.credit(500);
		bs.credit(500);
		bs.printBal();
		bs.individualCount();		
		System.out.println();
		
		A8_BankingSystem bs1 = new A8_BankingSystem();
		bs1.userData(2000, "Aarti");
		bs1.debit(100);
		bs1.debit(100);
		bs1.credit(500);
		bs1.credit(500);
		bs1.printBal();
		bs1.individualCount();
		System.out.println();
		bs1.allTransaction();
	}
}
