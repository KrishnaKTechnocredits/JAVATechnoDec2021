package ashish;

public class A8_BankSystem {

	int balance, individualCreditCount, individualDebitCount, individualPrintCount;
	static int totalCreditCount, totalDebitCount, totalPrintCount;
	String userName;
	
	void setUserDetails(int initialBalance, String name) {
		balance = initialBalance;
		userName = name;
		System.out.println(" Initial balance for " + userName + " : Rs. " + balance);
	}
	
	void printBalance() {
		System.out.println(" Current balance for " + userName + " is : Rs. " + balance);
		individualPrintCount++;
		totalPrintCount++;
	}
	
	void debit(int amt) {
		if(amt <= balance) {	
			System.out.println(" " + userName + " debited amount : Rs. " + amt);
			balance = balance - amt;
			individualDebitCount++;
			totalDebitCount++;
		}
		else {
			System.out.println(" " + userName + " wants to debit Rs. " + amt);
			System.out.println(" Transaction Failed due to low balance Rs. " + balance);
		}
	}
	
	void credit(int amt) {
		if(amt >= 0) {
			balance = balance + amt;
			System.out.println(" " + userName + " credited amount : Rs. " + amt);
			individualCreditCount++;
			totalCreditCount++;
		}
		else {
			System.out.println(" " + userName + " wants to credit Rs. " + amt);
			System.out.println(" Transaction Failed due to invalid amount Rs. " + amt);
		}
	}
	
	void individualTransactionSummary() {
		System.out.println(" Transaction Summary for " + userName + " : ");
		System.out.println(" Credit Transactions : " + individualCreditCount);
		System.out.println(" Debit Transactions : " + individualDebitCount);
		System.out.println(" Print Transactions : " + individualPrintCount);
	}
	
	void allTransactionSummary() {
		System.out.println(" All Transaction Summary  : ");
		System.out.println(" Credit Transactions : " + totalCreditCount);
		System.out.println(" Debit Transactions : " + totalDebitCount);
		System.out.println(" Print Transactions : " + totalPrintCount);
	}
	
	public static void main(String[] args) {
		A8_BankSystem bankSystemOne = new A8_BankSystem();
		System.out.println();
		bankSystemOne.setUserDetails(1000, "Ashish");
		bankSystemOne.debit(500);
		bankSystemOne.credit(300);
		bankSystemOne.credit(200);
		bankSystemOne.credit(-200);
		bankSystemOne.printBalance();
		bankSystemOne.individualTransactionSummary();
		System.out.println();
		A8_BankSystem bankSystemTwo = new A8_BankSystem();
		bankSystemTwo.setUserDetails(500, "Alisha");
		bankSystemTwo.debit(900);
		bankSystemTwo.debit(100);
		bankSystemTwo.debit(200);
		bankSystemTwo.debit(100);
		bankSystemTwo.printBalance();
		bankSystemTwo.individualTransactionSummary();
		System.out.println();
		bankSystemTwo.allTransactionSummary();	
	}
}