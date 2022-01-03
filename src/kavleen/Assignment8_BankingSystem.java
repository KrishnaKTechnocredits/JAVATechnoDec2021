package kavleen;

public class Assignment8_BankingSystem {
	 int debitCnt , creditCnt , printBalanceCnt;
	 static int debitAmount ;
	 static int creditAmount;
	 static int currentBalance;
	 double balance;
	 String username ; 
	 
	void setUSerDetails(String name , double bal ) {
		 balance = bal;
		 username = name;
	}
	
	void debitAmount(double amt) {
		if (amt<=balance)
			balance = balance-amt;
		else 
			System.out.println("Insufficient funds:" + balance);
		debitCnt++;
		debitAmount++;
	}
	
	void creditAmount(double amt) {
		if (amt>0) {
			balance = balance + amt ;
		}
		creditCnt++;
		creditAmount++;
	}
    void printCurrentBalance() {
    	System.out.println("The current balance is " + balance);
    	printBalanceCnt++;
    	currentBalance++; 	
    }
    
    void individualSummary() {
    	System.out.println(username + " Debited : " + debitCnt + " times");
    	System.out.println(username + " Credited : " + creditCnt + " times" );
    	System.out.println(username + " CurrentBalance : " + printBalanceCnt + " times"); 		
    }
    
    void allSummary() {
    	System.out.println("Debited amount from both : " + debitAmount + "times" );
    	System.out.println("Credited amount for both : " + creditAmount + "times");
    	System.out.println("Balance amount for both : " + currentBalance + "times");
    }
    public static void main (String [] args) {
    	
    	Assignment8_BankingSystem bank = new Assignment8_BankingSystem();
    	bank.setUSerDetails("Kavleen",40000);
    	bank.debitAmount(5000);
    	bank.creditAmount(6000);
    	bank.creditAmount(10000);
    	bank.printCurrentBalance();
    	bank.individualSummary();
    	System.out.println();
    	bank.allSummary();
    	
    	Assignment8_BankingSystem bank1 = new Assignment8_BankingSystem();
    	bank1.setUSerDetails("Irwin", 60000);
    	bank1.debitAmount(10000);
    	bank1.debitAmount(10000);
    	bank1.creditAmount(5000);
    	bank1.creditAmount(5000);
    	bank1.creditAmount(4000);
    	bank1.creditAmount(4000);
    	bank1.creditAmount(2000);
    	bank1.individualSummary();
    	System.out.println();
    	bank1.allSummary();
    	

    }
}
