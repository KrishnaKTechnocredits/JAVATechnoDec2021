package raksha;

public class A10_BankSystem{
	
	int Bal;
	String username;
	int debitcount, creditcount,printcount;
	static int debitcnt,creditcnt,printcnt;
	
	
	void setData(String name, int initialBal){
		username=name;
		Bal=initialBal;
		System.out.println("User name is : "+ username + " & Your initial balance is : "+ Bal);
		
	}
	
	void debitamt(int amt){
		if (amt<=Bal){
			System.out.println("Amount to be Debited: " + amt);
			Bal = Bal - amt;
			System.out.println("Balance is : " + Bal);
		}
		else 
			System.out.println("Insufficient Balance");
			debitcount++;
			debitcnt++;
		
	}
	
	void creditamt(int amt){
		if(amt>0){
			System.out.println("Amount to be Credited: " + amt);
			Bal = Bal + amt;
			System.out.println("Balance is : " + Bal);
		}
		else
			System.out.println("Invalid Amount");
			creditcount++;
			creditcnt++;
	}
	
	void printBal(){
		System.out.println("Current balance is:" + Bal);
		printcount++;
		printcnt++;
	}
	
	void individualTransactionSummary(){
		System.out.println(username+ " Transaction Summary: " + "Credit - " + creditcount + " times "+ " Debit - " + debitcount  + " times "+  " PrintBal - " + printcount + " times ");
	}
	
	static void allTransactionSummary(){
		System.out.println("All Transaction Summary: " + "Credit - " + creditcnt + " times "+ " Debit - " + debitcnt + " times "+ " PrintBal - " + printcnt + " times ");
	}
	
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		A10_BankSystem a10_BankSystem_1 = new A10_BankSystem();
		a10_BankSystem_1.setData("Raksha",20000);
		a10_BankSystem_1.creditamt(400);
		a10_BankSystem_1.creditamt(400);
		a10_BankSystem_1.debitamt(500);
		a10_BankSystem_1.printBal();
		a10_BankSystem_1.individualTransactionSummary();
		

		A10_BankSystem a10_BankSystem_2 = new A10_BankSystem();
		a10_BankSystem_2.setData("Samaksh",10000);
		a10_BankSystem_2.creditamt(500);
		a10_BankSystem_2.creditamt(500);
		a10_BankSystem_2.creditamt(500);
		a10_BankSystem_2.creditamt(500);
		a10_BankSystem_2.creditamt(500);
		a10_BankSystem_2.debitamt(400);
		a10_BankSystem_2.printBal();
		a10_BankSystem_2.individualTransactionSummary();
		
		A10_BankSystem.allTransactionSummary();
		
	}

}
