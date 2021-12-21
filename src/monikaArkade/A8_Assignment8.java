package monikaArkade;

public class A8_Assignment8 {
	String username;
	int balance,dCount,pCount,cCount;
	static int creditCount=0;
	static int debitCount=0;
	static int printBalanceCount=0;
	
	void setUserDetails(String name,int initialBalance) {
		username = name;
		balance =initialBalance;
	}
	
	void debitAmount(int amount) {
		if(balance>0) {
			balance = balance - amount;
		}else {
			System.out.println("Invalid Input");
		}
		dCount++;
		debitCount++;
	}
	
	void creditAmount(int amount) {
		balance = balance + amount;
		cCount++;
		creditCount++;
	}
	
	void printBalance() {
		System.out.println("Current Balance is: "+balance);
		pCount++;
		printBalanceCount++;
	}
	
	void  individualTransactionSummary() {
		System.out.println(username + " individual summary :");
		System.out.println("Credit : "+cCount+" time");
		System.out.println("Debit : "+dCount+" time");
		System.out.println("Print Balance : "+pCount+" time");
	}
	
	void allTransactionSummary() {
		System.out.println("---All transaction Summary---");
		System.out.println("Credit : "+creditCount+" time");
		System.out.println("Debit : "+debitCount+" time");
		System.out.println("Print Balance : "+printBalanceCount+" time");
	}
	
	public static void main(String[] args) {
		A8_Assignment8 user1 = new A8_Assignment8();
		user1.setUserDetails("Monika", 1000);
		user1.creditAmount(500);
		user1.creditAmount(500);
		user1.debitAmount(500);
		user1.printBalance();
		user1.individualTransactionSummary();
		
		A8_Assignment8 user2 = new A8_Assignment8();
		user2.setUserDetails("Kajal", 2000);
		user2.creditAmount(500);
		user2.creditAmount(500);
		user2.creditAmount(500);
		user2.creditAmount(500);
		user2.creditAmount(500);
		user2.debitAmount(1000);
		user2.debitAmount(500);
		user2.individualTransactionSummary();
		user2.allTransactionSummary();
				
	}
}
