package yogeshNagar;

public class A8_BankSystem {
	static int debit;
	static int credit;
	static int printStatement;	
	static String name;
	static int initialBalance;
	
	int localDebit;
	int localCredit;
	int localprintStatement;
	
	void setUserDetail(String nam,int initBalance) {
		name = nam;
		initialBalance = initBalance;
		System.out.println("User name is " + name);
		System.out.println("InitialBalance is " + initialBalance);
	}
	
	void debitAmount(int amount) {
		if(amount <= initialBalance){
			System.out.println("Amount debited by " + name +" is " + amount);
			initialBalance = initialBalance - amount;
			System.out.println("Remaining amount in account for " + name +" is " + initialBalance);
			localDebit++;
			debit++;
		}
		else
			System.out.println("Insufficient balance for " + name);
	}
	
	void creditAmount(int amount) {
		if(amount >0){
			System.out.println("Amount credited by " + name +" is " + amount);
			initialBalance = initialBalance + amount;
			System.out.println("Updated amount in account for " + name +" is " + initialBalance);
			localCredit++;
			credit++;
		}
		else
			System.out.println("Provide valid amount in ineger");
	}
	
	void printBalance() {
		System.out.println("Current balance in "+ name + " account is " + initialBalance );
		localprintStatement++;
		printStatement++;
	}
	
	void indivisualTransactionSummary() {
		System.out.println("Credit- "+localCredit+" times"+","+" "+"Debit- "+localDebit+ " times"+","+" PrintBalance- "+localprintStatement+" "+"times");
	}
	
	static void allTransactionSummary() {
		System.out.println("Credit- "+credit+" times"+","+" "+"Debit- "+debit+ " times"+","+" PrintBalance- "+printStatement+" "+"times");	
	}
	
	public static void main(String[] args) {
		A8_BankSystem bankSystem = new A8_BankSystem();
		bankSystem.setUserDetail("Aryan", 1000);
		bankSystem.debitAmount(300);
		bankSystem.creditAmount(50);
		bankSystem.printBalance();
		bankSystem.indivisualTransactionSummary();
		
		System.out.println("\n");
		System.out.println("-----Second User Deatil---------\n");
		
		A8_BankSystem bankSystemuser2 = new A8_BankSystem();
		bankSystemuser2.setUserDetail("Amol", 5000);
		bankSystemuser2.debitAmount(1000);
		bankSystemuser2.creditAmount(50);
		bankSystemuser2.printBalance();
		bankSystemuser2.indivisualTransactionSummary();
		
		System.out.println("\n");
		System.out.println("All Trancation summary detail is--------------\n");
		
		A8_BankSystem.allTransactionSummary();
		
		
	}
}
