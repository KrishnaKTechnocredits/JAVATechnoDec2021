package nasir;
class A8_BankingSystem {
	String name;
	int balance;
	int debitcnt;
	int creditcnt;
	static int totalDebitCnt;
	static int totalCreditCnt;
	void setUserDetails( String input, int bal){
		name = input;
		balance=bal;
	}
	
	void debit(int amt){
		if(amt<=balance){
			balance=balance-amt;
			System.out.println(name+" has withdrawed "+amt);
			debitcnt++;
			totalDebitCnt++;
		}else
			System.out.println("Insufficient Balance to withdraw ");					
	}
	
	void credit(int amt){
			balance=balance+amt;
			System.out.println(name+" has deposited "+amt);
			creditcnt++;
			totalCreditCnt++;
	}
	
	void printBalance(){
		System.out.println(name+" has available balance "+balance);
	}
	
	void individualTransactionSummary(){
		System.out.println(name+" 's total debit count is "+debitcnt+ " and total credit count is "+creditcnt);
		System.out.println("..............................................");
	}
	
	void allTransactionSummary(){
		System.out.println("OverAll credit "+totalCreditCnt+" and debit "+totalDebitCnt+" for both the users ");
	}
	
	public static void main(String[]args){
		A8_BankingSystem user1 =new A8_BankingSystem();
		user1.setUserDetails("Mohini",10000);
		user1.debit(5000);
		user1.credit(3000);
		user1.credit(1000);
		user1.printBalance();
		user1.individualTransactionSummary();
		
		A8_BankingSystem user2 =new A8_BankingSystem();
		user2.setUserDetails("Mehak",15000);
		user2.credit(3500);
		user2.credit(4500);
		user2.credit(5500);
		user2.debit(2500);
		user2.debit(3500);
		user2.printBalance();
		user2.individualTransactionSummary();
		user2.allTransactionSummary();
		
		
	}
	
}