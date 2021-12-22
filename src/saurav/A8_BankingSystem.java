package saurav;

public class A8_BankingSystem {
	
	int avlBalance;
	String username;
	int creditCount=0;
	int debitCount=0;
	int printBalanceCount=0;
	static int totalDebitCount=0;
	static int totalCreditCount=0;
	static int totalprintBalance=0;
	
	void setUserDetails(String name,int initialBal){
		username= name;
		avlBalance= initialBal;
		System.out.println("User = "+name);
	}
	
	void debitAmount(int debtAmt) {
		if(debtAmt<avlBalance) {
			System.out.println("Debited amt= "+debtAmt);
			avlBalance	=avlBalance-debtAmt;
			System.out.println("avlBalance = "+avlBalance);
		}else
			System.out.println("Insufficient bal");
			debitCount++;
			totalDebitCount++;
	}
	
	void  creditAmount(int creditAmt ) {
		if(avlBalance>creditAmt) {
			System.out.println("Credited amt = "+creditAmt);
			avlBalance=creditAmt+avlBalance;
			System.out.println("avlBalance =  "+avlBalance);
			creditCount++;
			totalCreditCount++;
		}
	}
	

	
	void printBalance() {
		System.out.println("Current Balance =  "+avlBalance);
		printBalanceCount++;
		totalprintBalance++;
	}
	
	void individualTransactionSummary() {
		System.out.println("Total Debit count  =  "+debitCount);
		System.out.println("Total Credit Count  =  "+creditCount);
		System.out.println("Total PrintBalance Count =  "+printBalanceCount);
	}
	
	void allTransactionSummary() {
		System.out.println("Total Debit count =  "+debitCount);
		System.out.println("Total Credit Count =  "+creditCount);
		System.out.println("Total PrintBalance Count =  "+printBalanceCount);
	}
	
	public static void main(String[] a) {
		A8_BankingSystem bankingsystem =new A8_BankingSystem();
		bankingsystem.setUserDetails("Saurav",10000);
		bankingsystem.debitAmount(2000);
		bankingsystem.creditAmount(3000);
		bankingsystem.creditAmount(3000);
		bankingsystem.printBalance();
		bankingsystem.individualTransactionSummary();
		System.out.println();
		
		A8_BankingSystem bankingsystem1 = new A8_BankingSystem();
		bankingsystem1.setUserDetails("Vivek",20000);
		bankingsystem1.debitAmount(3000);
		bankingsystem1.debitAmount(3000);
		bankingsystem1.creditAmount(4000);
		bankingsystem1.creditAmount(4000);
		bankingsystem1.creditAmount(4000);
		bankingsystem1.creditAmount(4000);
		bankingsystem1.creditAmount(4000);
		bankingsystem1.individualTransactionSummary();
		System.out.println();

		System.out.println("TotalDebitCount : "+totalDebitCount);
		System.out.println("TotalCreditCount : "+totalCreditCount);
		System.out.println("TotalPrintBalCount : "+totalprintBalance);
	}
	 
}
