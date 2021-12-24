package hevin;

class A8_TransactionSummary {
	
	String name;
	int balance;
	int debitcount;
	int creditcount;
	static int totaldebitcount;
	static int totalcreditcount;
	
	void setUserDetails( String input, int bal){
		name = input;
		balance=bal;
	}

	void debit(int amt){
		if(amt<=balance){
			balance=balance-amt;
			System.out.println(name+" Withdrawed "+amt);
			debitcount++;
			totaldebitcount++;
		}else
			System.out.println("*****Insufficient Balance***** ");					
	}

	void credit(int amt){
			balance=balance+amt;
			System.out.println(name+" Deposited "+amt);
			creditcount++;
			totalcreditcount++;
	}

	void printBalance(){
		System.out.println(name+" - Available balance = "+balance);
	}

	void individualTransactionSummary(){
		System.out.println(name+"'s total debit count is "+debitcount+ " and total credit count is "+creditcount);
		System.out.println("--------------------------------------------------------");
	}

	void allTransactionSummary(){
		System.out.println("Total Credit Transaction = "+totalcreditcount+" & Total Debit Transaction = "+totaldebitcount+" ");
	}

	public static void main(String[]args){
		A8_TransactionSummary user1 = new A8_TransactionSummary();
		user1.setUserDetails("Suresh",10000);
		user1.debit(5000);
		user1.credit(3000);
		user1.credit(1000);
		user1.printBalance();
		user1.individualTransactionSummary();

		A8_TransactionSummary user2 = new A8_TransactionSummary();
		user2.setUserDetails("Mahesh",15000);
		user2.credit(3500);
		user2.credit(4500);
		user2.credit(5500);
		user2.debit(2500);
		user2.debit(3500);
		user2.printBalance();
		user2.individualTransactionSummary();
		user2.allTransactionSummary();

		A8_TransactionSummary user3 = new A8_TransactionSummary();
		user3.setUserDetails("Jayesh",500);
		user3.credit(5500);
		user3.debit(2500);
		user3.debit(4000);
		user3.printBalance();
		user3.individualTransactionSummary();
		user3.allTransactionSummary();
	}
} 