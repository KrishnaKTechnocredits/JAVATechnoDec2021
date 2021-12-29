package debasmita;

public class A8_BankSystem {
	int balance ;
	String name;
	int credit;
	int debit;
	int print;
	static int totalcredit;
	static int totaldebit;
	static int totalprint;
         
	void debitFunction(int amount) {
		if(amount<balance){
		   System.out.println("Amount to be debited :" + amount);
		   balance=balance-amount;
		}
		else {
		   System.out.println("Insufficient balance");
		}
	       debit++;
		   totaldebit++;
	}
	void creditFunction(int amount) {
	    if(amount>0) {
		   System.out.println("Amount to be credited :" + amount);
		   balance=balance+amount;
		   credit++;
		   totalcredit++;
		}
	}
	void printBalance() {
	    System.out.println("Current balance for" + name + "is" + balance);
		print++;
		totalprint++;
	}
	void setUserDetailsMethod(String username, int openingbalance) {
		name = username ;
		balance=balance+openingbalance;
		System.out.println("Opening balance for" +name+ "is" + balance);
	}
	void individualTransactionSummary() {
	System.out.println("Transaction details of "+name+" are "+debit+" times debit, "+credit+" times credit, "+print+" times print ");
    }
	void allTransactionSummary() {
	System.out.println("Total number of credits : "+totalcredit);
	System.out.println("Total number of debits : "+totaldebit);
	System.out.println("Total number of prints : "+totalprint);
	}
	public static void main(String[] args) {
	   A8_BankSystem banksystem1 = new A8_BankSystem();
	   banksystem1.setUserDetailsMethod("Debasmita",10000);
	   banksystem1.debitFunction(4000);
	   banksystem1.creditFunction(6000);
	   banksystem1.debitFunction(1000);
	   banksystem1.debitFunction(3000);
	   banksystem1.creditFunction(8000);
	   banksystem1.printBalance();
	   banksystem1.creditFunction(2000);
	   banksystem1.printBalance();
	   banksystem1.individualTransactionSummary();
	   banksystem1.allTransactionSummary();
	   
	   A8_BankSystem banksystem2 = new A8_BankSystem();
	   banksystem2.setUserDetailsMethod("Ipsita",20000);
	   banksystem2.creditFunction(5000);
	   banksystem2.creditFunction(2000);
	   banksystem2.debitFunction(8000);
	   banksystem2.printBalance();
	   banksystem2.creditFunction(4000);
	   banksystem2.creditFunction(2000);
	   banksystem2.debitFunction(7000);
	   banksystem2.individualTransactionSummary();
	   banksystem2.allTransactionSummary();
	}
}
