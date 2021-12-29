package pratiksha;

public class A8_Bank_Statement {
	
	String username;
	int debitAmt;
	int creditAmt;
	int balance;
	int print;
	
	static int totalCredit;
	static int totalDebit;
	static int totalPrint;
	
	void debitFunction(int amount) {
		
		if(amount<balance) {
			System.out.println("Amount to be debited:" +amount);
			balance = balance-amount;
		}
		else {
			
			System.out.println("Insufficient Balance");
		}
		
		debitAmt++;
		totalDebit++;
	}
	
	void creditFunction(int amount) {
		
		if (amount>0) {
			
			System.out.println("Amount to be credited:" +amount);
			balance= balance+amount;
			creditAmt++;
			totalCredit++;	
		}
		
	}
	
	void printBalance() {
		
		System.out.println(" Current balance for " +username +"is" +balance);
		print++;
		totalPrint++;
	}

	void setUserDetails(String name, int initialBal) {
		username= name;
		balance= balance+initialBal;
		System.out.println("Initial Balance for "+username + " is " +balance);
	}
	
	
	void individualTransactionSummary() {
		System.out.println(" Transaction details of " +username+ " are "+debitAmt+" times debit, \"+credit+\" times credit, \" +print+ \" times print");
		
	}
	
	void allTransactionSummary() {
		System.out.println("Total number of credits : "+totalCredit);
		System.out.println("Total number of debits : "+totalDebit);
		System.out.println("Total number of prints : "+totalPrint);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A8_Bank_Statement statement = new A8_Bank_Statement();
		statement.setUserDetails("Pratiksha",5500);
		statement.debitFunction(4000);
		statement.creditFunction(3500);
		statement.debitFunction(2500);
		statement.creditFunction(1500);
		statement.debitFunction(1890);
		statement.printBalance();
		statement.individualTransactionSummary();
		statement.allTransactionSummary();
		
		A8_Bank_Statement statement1 = new A8_Bank_Statement();
		statement1.setUserDetails("Akanksha",6000);
		statement1.debitFunction(4320);
		statement1.creditFunction(3500);
		statement1.debitFunction(2200);
		statement1.creditFunction(1500);
		statement1.debitFunction(1650);
		statement1.printBalance();
		statement1.individualTransactionSummary();
		statement1.allTransactionSummary();
		

	}

}
