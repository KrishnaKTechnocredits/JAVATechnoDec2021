package shivangi;

class A8_BankingSystem{
	
	int debitCnt, creditCnt, printCnt;
	static int totalDebitCnt, totalCreditCnt, totalPrintCnt;	
	
	static String name;
	int balance;
	
	void setUserDetails(String userName, int initial_Balance) {
		name = userName;
		balance = initial_Balance;
		System.out.println("User name is " + name);
		System.out.println("InitialBalance is " + balance);
	}
	
	void debitAmt(int amount) {
		if(amount <= balance) {
			balance = balance-amount;
			System.out.println("Current balance after debited : " + balance);
			debitCnt++;
			totalDebitCnt++;
		}else{
			System.out.println("insufficient balance to debit current amount");
		}
	}
	
	void creditAmt(int amount) {
		if(amount > 0){
			balance = balance+amount;
			System.out.println("Current balance after credited : " + balance);
			creditCnt++;
			totalCreditCnt++;
		}else {
			System.out.println("Invalid entered amount to credit");
		}
	}
	
	void printBalance() {
		System.out.println("Current balance in " + name + " account is : " + balance);
		printCnt++;
		totalPrintCnt++;
	}
	
	void individualTransactionSummary() {
		System.out.println(" "+name+" - transaction history: debit - "+debitCnt+" time, credit - "+creditCnt+" time, PrintBalance - "+printCnt+" time");
	}
	
	static void allTransactionSummary() {
		System.out.println("TotalDebit - "+totalDebitCnt+" time, TotalCredit - "+totalCreditCnt+" time, TotalPrintBalance - "+totalPrintCnt+" time");
	}

	public static void main(String[] args) {
		A8_BankingSystem user1 = new A8_BankingSystem();
		user1.setUserDetails("Puja", 2000);
		user1.debitAmt(500);
		user1.creditAmt(200);
		user1.printBalance();
		user1.individualTransactionSummary(); 
	
		System.out.println("\n");
		System.out.println("-----Second User Deatil---------\n");
		
		A8_BankingSystem user2 = new A8_BankingSystem();
		user2.setUserDetails("ankita", 4000);
		user2.debitAmt(600);
		user2.creditAmt(1000);
		user2.printBalance();
		user2.individualTransactionSummary();
		
		System.out.println("\n");
		System.out.println("All Trancation summary detail is--------------\n");
		
		A8_BankingSystem.allTransactionSummary();
	}
}