package priya;

public class A8_CreditDebit {
	
	String name;
	int cAmount;
	int dAmount;
	int balance;
	int cbalance,dbalance;
	int cCount,dCount,printB;
	static int tCCount,tDCount,tprintB;
	
	void cred(int cAmount) {
		cbalance=balance+cAmount;
		cCount++;
		tCCount++;
		
	}
	
	void deb(String username,int dAmount) {
		if (dAmount>=balance) {
			dbalance=cbalance-dAmount;
			dCount++;
			tDCount++;
		}
		else 
			System.out.println(username+ "not abe to debit the amount due to insufficient fund." );
	}
	
	void bal() {
		balance=cbalance-dbalance;
		printB++;
		tprintB++;
	}

	void indSummary(String username) {
		System.out.println("user "+username+" transaction summary : Credit - "+cCount+" times, Debit - "+dCount+" times, printBalance - "+printB+" times");
	}
	
	void totalsummary() {
		System.out.println("No of times creditAmount method called by all users : "+tCCount);
		System.out.println("No of times debitAmount method called by all users : "+tDCount);
		System.out.println("No of times printBalance method called by all users : "+tprintB);
	}
		
	public static void main(String[] args) {
		A8_CreditDebit p1=new A8_CreditDebit();
		p1.cred(1000);
		p1.cred(1000);
		p1.deb("Tom", 1000);
		p1.bal();
		p1.indSummary("Tom");
		
		A8_CreditDebit p2=new A8_CreditDebit();
		p2.cred(500);
		p2.cred(500);
		p2.deb("John", 1000);
		p2.bal();
		p2.indSummary("John");	
		
		A8_CreditDebit p3=new A8_CreditDebit();
		p3.totalsummary();
					
	}

}
