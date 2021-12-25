package omkar;

public class A8_BankingSystem {
	static int TcountC=0, TcountD=0, TcountB=0;
	 int total, bal=5000, countC=0, countD=0, countB=0;
	String name1="";
	
	void setUser(String name) {
		 name1 = name;
		
	}
	void debit(int a) {
		
		bal=bal-a;
		countD++;
		TcountD++;
	}
	
	void credit(int b) {
		
		bal=bal+b;
		countC++;
		TcountC++;
	}
	void printBalance() {
		System.out.println(bal);
		countB++;
		TcountB++;
		
	}
	void indivisualTrancsactionSummary() {
		
		System.out.println(name1 + "  Transaction Summory: Credit " +countC +" time " + "Debit :" + countD + " time " +"print Balance "+countB + " times" );
	}

	 void allTrasactionSummary() {
		
		
		System.out.println("  Transaction Summory: Credit " +TcountC +" time " + "Debit :" + TcountD + " time " +"print Balance "+TcountB + " times" );
	}
	public static void main(String[] args) {
		A8_BankingSystem a8_BankingSystem = new A8_BankingSystem();
		A8_BankingSystem a8_BankingSystem1 = new A8_BankingSystem();
		a8_BankingSystem.debit(2000);
		a8_BankingSystem.credit(4000);
		a8_BankingSystem.printBalance();
		a8_BankingSystem.setUser("Omkar");
		a8_BankingSystem.indivisualTrancsactionSummary();
		a8_BankingSystem1.debit(5000);
		a8_BankingSystem1.credit(10000);
		a8_BankingSystem1.debit(5000);
		a8_BankingSystem1.credit(10000);
		a8_BankingSystem1.debit(5000);
		a8_BankingSystem1.credit(10000);
		a8_BankingSystem1.printBalance();
		a8_BankingSystem1.setUser("Pooja");
		a8_BankingSystem1.indivisualTrancsactionSummary();
		a8_BankingSystem.allTrasactionSummary();
		
	}

}
