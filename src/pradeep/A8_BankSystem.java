package pradeep;

public class A8_BankSystem {
	int balance, credit, debit, printBalance;
	static int allCredit, allDebit, allPrintBalance;
	String userName;
	
	void debitAmt(int amt){
		if(amt<=balance) {
			System.out.println("Amount debited from " + userName + "'s account is " + amt + " Rs");
			balance = balance -amt;
			debit++;
			allDebit++;
		}else
			System.out.println("Insufficeint Balance");
	}
	
	void creditAmt(int amt) {
		if(amt>0) {
			System.out.println("Amount credited in " + userName + "'s account is " + amt + " Rs");
			balance = balance + amt;
			credit++;
			allCredit++;
		}else
			System.out.println("Invalid Input");		
	}
	
	void printBalance() {
		System.out.println("Total balance in " + userName + "'s account is "  + balance);
		printBalance++;
		allPrintBalance++;
	}
	
	void individualTransactionSummary() {
		System.out.println(userName + "'s transaction summary:"  );
		System.out.println("Credit - " + credit + " times, Debit - " + debit + " times, printBalance - " + printBalance + " times");	
	}
	
	void allTransactionSummary() {
		System.out.println("Overall transaction summary:");
		System.out.println("Credit - " + allCredit + " times, Debit - " + allDebit + " times, printBalance - " + allPrintBalance + " times");
	}
	
	void setUserDetails(String user, int iniBal) {
		userName = user;
		balance = iniBal;		
	}

	public static void main(String[] args) {
		//User1 Activity
		A8_BankSystem user1 = new A8_BankSystem();
		user1.setUserDetails("pradeep",5000);
		user1.debitAmt(115);
		user1.debitAmt(145);
		user1.creditAmt(35);
		user1.creditAmt(80);
		user1.creditAmt(90);
		user1.printBalance();
		//User2 Activity
		A8_BankSystem user2 = new A8_BankSystem();
		user2.setUserDetails("hemant",1500);
		user2.debitAmt(300);
		user2.creditAmt(100);
		user2.creditAmt(25);
		//Shows Individual transactions summary
		user1.individualTransactionSummary();
		user2.individualTransactionSummary();
		//Shows all transactions summary
		user1.allTransactionSummary();
	}
}
