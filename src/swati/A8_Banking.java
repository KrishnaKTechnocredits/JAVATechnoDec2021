package swati;

public class A8_Banking {
	static int allCredit;
	static int allDebit;
	static int allPrint;
	String name;
	int balance;
	int indDebit;
	int indCredit;
	int printbalanceCount;
	
void setUserDetails(String uName,int bal) {
	name=uName;
	balance=bal;
}
void printBalance() {
	System.out.println("Current Balance for " +name + " is "+balance);
	printbalanceCount++;
	allPrint++;
}
void debitAmt(int amt)
{
	
	if(amt<balance) {
		balance=balance-amt;
		System.out.println(amt + " is debited");
		indDebit++;
		allDebit++;
	}
	else {
		System.out.println("Insufficient Funds ");
	}
}
void creditAmt(int amt) {
	if(amt<0) {
		System.out.println("please enter valid amount");
	}
	else {
		balance=balance+amt;
		System.out.println(amt + " is credited");
		indCredit++;
		allCredit++;
	}
}
void individualTransactionSummary() {
	System.out.println("Total number of debits for " +name+ " are " +indDebit);
	System.out.println("Total number of credits for " +name+ " are " +indCredit);
	System.out.println("Total number of Print Balance Request for " +name+ " are " +printbalanceCount);
}

static void allTransactionSummary() {
	System.out.println("All user Total number of debits  " +allDebit);
	System.out.println("All user Total number of credits " +allCredit);
	System.out.println("All user Total number of Print Balance Request " +allPrint);
}
	public static void main(String[] args) {
		
		A8_Banking user1=new A8_Banking();
		user1.setUserDetails("Swati", 50000);
		user1.debitAmt(10000);
		user1.printBalance();
		user1.creditAmt(2000);
		user1.creditAmt(3000);
		user1.individualTransactionSummary();
		
		A8_Banking user2=new A8_Banking();
		user2.setUserDetails("Jui", 65000);
		user2.creditAmt(2000);
		user2.creditAmt(3000);
		user2.creditAmt(4000);
		user2.creditAmt(5000);
		user2.creditAmt(6000);
		user2.debitAmt(2000);
		user2.debitAmt(4000);
		user2.printBalance();
		user2.individualTransactionSummary();
		
		allTransactionSummary();
		
		
		
	}

}
