package jayashri;

public class Assg8_BankingSystem {
	int bal;
	String name;
	int inDebitCnt , inCreditCnt , inPrintBalanceCnt;
	static int allDebitCnt;
	static int allCreditCnt;
	static int allPrintBalanceCnt;
	
	void userdetails(String uname , int ubal){
		name = uname;
		bal = ubal;
		System.out.println(uname+" Your Total Balance is: "+bal);
	}
	
	void debitAmt(int amt){
		if(amt<=bal){
			bal = bal - amt;
			System.out.println("Debited amount is : "+amt);
		}
		else{
			System.out.println("Sorry! You have insufficient Balance");
		}
			inDebitCnt++;
			allDebitCnt++;
	}
	
	void creditAmt(int amt){
		bal = bal + amt;
		inCreditCnt++;
		allCreditCnt++;
		System.out.println("Credit amount is : "+amt);
	}
	
	void printBalance(){
		System.out.println("-----------------------------------------------------------------------");
		System.out.println("Your Balance is :"+ bal);
			inPrintBalanceCnt++;
			allPrintBalanceCnt++;		
	}
	
	void individualTransactionSummary(){
		System.out.println("Individual Debit Transaction Summary Count is: "+inDebitCnt);
		System.out.println("Individual Credit Transaction Summary Count is: "+inCreditCnt);
		System.out.println("Individual Print Transaction Summary Count is: "+inPrintBalanceCnt);
	}
	
	void totalTransactionSummary(){
		System.out.println("Total Debit Transaction Summary Count is: "+allDebitCnt);
		System.out.println("Total Credit Transaction Summary Count is: "+allCreditCnt);
		System.out.println("Total Print Transaction Summary Count is: "+allPrintBalanceCnt);
	}
	
	public static void main(String[] args){
		Assg8_BankingSystem a8_bankingSsystem = new Assg8_BankingSystem();
		a8_bankingSsystem.userdetails("Jayasri",10000);
		a8_bankingSsystem.debitAmt(1300);
		a8_bankingSsystem.printBalance();
		a8_bankingSsystem.creditAmt(500);
		a8_bankingSsystem.printBalance();
		a8_bankingSsystem.debitAmt(2000);
		a8_bankingSsystem.printBalance();
		a8_bankingSsystem.creditAmt(4500);
		a8_bankingSsystem.printBalance();
		a8_bankingSsystem.creditAmt(800);
		a8_bankingSsystem.printBalance();
		a8_bankingSsystem.debitAmt(1000);
		a8_bankingSsystem.printBalance();
		a8_bankingSsystem.creditAmt(800);
		a8_bankingSsystem.printBalance();
		a8_bankingSsystem.individualTransactionSummary();
		a8_bankingSsystem.totalTransactionSummary();
	}
}
