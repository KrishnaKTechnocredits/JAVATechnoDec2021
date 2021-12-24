package shital;

class A8{
	
	String username;
	int carryForwardBalance;
		
	static int overallDebitCount;
	static int ovrallCreditCount;
	static int overallPrintCount;
	
	int balance=0;
	int debitCount;
	int creditCount;
	int printCount;
	
	void setUserDetails(String name, int initialBalance){
		username=name;
		balance=initialBalance;
		System.out.println("Opening Balance of "+username+" : " +balance);
	}
	
	void debitAmount(int amount){	
		if(amount<balance){
			System.out.println("Amount debited from "+username+"'s account: " +amount);
			balance=balance-amount;
		}
		else
			System.out.println("Insufficient Balance in "+username+" 's accounts");
			debitCount++;
			overallDebitCount++;
	}
	
	void creditAmount(int amount){
		if(amount>0){
			System.out.println("Amount credited into "+username+"'s account: " +amount);	
			balance=balance+amount;
		}
		else
			System.out.println("Insufficient amount");
			creditCount++;
			ovrallCreditCount++;
	}
	
	void printBalance(){
		System.out.println(""+username+"'s current Balance is : " +balance);
		printCount++;
		overallPrintCount++;
	}
	
	void individualTransactionSummary(){
		System.out.println("\n"+username+" total Debit transaction count is:" +debitCount);
		System.out.println(""+username+" total Credit transaction count is:" +creditCount);
		System.out.println(""+username+" total Print transaction count is:" +printCount);
	}
	
	static void allTransactionSummary(){
		System.out.println(" \nTotal Debit Transaction :" + overallDebitCount);
		System.out.println("Total Credit Transaction :" + ovrallCreditCount);
		System.out.println("Total Print Transaction :" + overallPrintCount);
	}
	
	public static void main(String [] args){
		A8 customer1=new A8();
		A8 customer2=new A8();
		
		customer1.setUserDetails("Shital", 100000);
		customer1.debitAmount(1000);
		customer1.debitAmount(14000);
		customer1.debitAmount(12000);
		customer1.debitAmount(18000);
		customer1.creditAmount(5000);
		customer1.creditAmount(1000);
		customer1.printBalance();
		customer1.individualTransactionSummary();
		
		System.out.println("\n ");
		customer2.setUserDetails("Pratik", 100000);
		customer2.debitAmount(1000);
		customer2.debitAmount(14000);
		customer2.debitAmount(12000);
		customer2.creditAmount(15000);
		customer2.printBalance();
		customer2.creditAmount(10000);
		customer2.debitAmount(30000);
		customer2.printBalance();
		customer2.individualTransactionSummary();
		
		A8.allTransactionSummary();
	}
}