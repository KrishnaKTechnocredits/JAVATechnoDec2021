package swapnali;

public class BankingSystem {
	int balance,printCount,debitCount,creditCount;
	String name;
	static int printAllCount,debitAllCount,creditAllCount;
	
	public static void main(String[] args) {
		individualTranSummary();
		AllTranSummary();
	}
	void setUserDetails(String UserName,int UserBalance) {
		name=UserName;
		balance=UserBalance;
	}
	void debitAmount(int debitAmt) {
		if(debitAmt<balance)
		{
			balance=balance-debitAmt;
			debitCount++;
			debitAllCount++;
		}
	}
	
	void CreditAmount(int creditAmt) {
		
		balance=balance-creditAmt;
		creditCount++;
		creditAllCount++;
	}
	
	void printBalance(){
		System.out.println(name +" current balance is : "+balance);
		printCount++;
		printAllCount++;
		
	}
	static void individualTranSummary() {
		BankingSystem user1=new BankingSystem();
		user1.setUserDetails("Swapnali", 5000);
		user1.CreditAmount(1000);
		user1.debitAmount(200);
		user1.CreditAmount(2000);
		user1.printBalance();
		
		BankingSystem user2=new BankingSystem();
		user2.setUserDetails("Shivansh", 8000);
		user2.CreditAmount(1000);
		user2.debitAmount(200);
		user2.CreditAmount(2000);
		user2.CreditAmount(3000);
		user2.debitAmount(2000);
		user2.CreditAmount(2000);
		user2.CreditAmount(1000);
		System.out.println("Total count for transaction of user1 is: "+user1.creditCount +" "+user1.debitCount+" "+user1.printCount);
		System.out.println("Total count for transaction of user2 is: "+user2.creditCount +" "+user2.debitCount+" "+user2.printCount);
	}
	
	static void AllTranSummary() {
		System.out.println("Total count for transaction of both users is: "+creditAllCount +" "+debitAllCount+" "+printAllCount);
		
	}

}