package sham;

public class A8_BankSystem {

	 int balance=1000;
	int dAmount,cAmount;
	 int dCount,cCount;
	String username;
	
	void debitAmount(String name, int amt)
	{
		
	dAmount= amt;
		if(balance>amt) {
			balance= balance - dAmount;	
			dCount++;
		}else
			System.out.println("you have insufficient funds:"+ balance);
		
	
	}
	void creditAmount(String name, int amt)
	{
		if(amt>0) {
		balance= balance+ amt;
		username=name;
		cAmount= amt;
	cCount++;
		}
		else if(amt<0) {
			System.out.println("Need to check your amount Entry");
		}
	}
	void individualTransactionSummary(){
		System.out.println("user1 transaction history "+username+" has debited "+dCount+" Times "+" credited "+ cCount+" Times");
		//System.out.println("user2 transaction history "+username+" has credited "+ cCount+" Times");
		 
	 }
	void printStatement() {
		System.out.println("user "+username+" has debited "+ dAmount);
		System.out.println("user "+username+" has credited "+ cAmount);
		
	}
	
	void allTransactionSummary() {
	int totalTransacation= dCount+cCount;
	System.out.println("Total TRansaction Summury: "+totalTransacation);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A8_BankSystem bank= new A8_BankSystem();
		bank.creditAmount("Sham",5000);
		bank.creditAmount("Sham",7000);
		bank.debitAmount("Sham", 2000);
		bank.debitAmount("Sham", 3000);
		bank.creditAmount("Sham",1000);
		//bank.printStatement();
		bank.individualTransactionSummary();
		
		A8_BankSystem bank1= new A8_BankSystem();
		
		bank1.creditAmount("Rahul",10000);
		bank1.debitAmount("Rahul", 2000);
		bank1.debitAmount("Rahul", 3000);
		bank1.creditAmount("Rahul",1000);
		bank1.debitAmount("Rahul", 1500);
		//bank1.printStatement();
		bank1.individualTransactionSummary();
		bank1.allTransactionSummary();
		bank.allTransactionSummary();
		
	}

}
