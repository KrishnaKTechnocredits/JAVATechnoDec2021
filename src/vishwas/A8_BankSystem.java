package vishwas;

public class A8_BankSystem {
	String uname;
	int bal;
	int debitCnt,creditCnt,printCnt;
	static int totalDebitCnt,totalCredit,totalPrintCnt;
	
	void setUserData(String name ,int initialBal){
		uname=name;
		bal=initialBal;
		System.out.println("User name is :" +uname+ " & your initial blance is :" +bal);
	}
	
	void debitAmt(int amt){
		if (bal>=amt){
		System.out.println("Enter Amout to be debited : " +amt);
			bal=bal-amt;
		}else
			System.out.println("Insufficient amount");
			debitCnt++;
			totalDebitCnt++;
	}
	
	void creditAmt(int amt){
		System.out.println("Enter amount to be credited : " +amt);
		bal=bal+amt;
		creditCnt++;
		totalCredit++;
	}
	
	void printBalnce(){
		System.out.println("Now Avaible balance : "+bal);
		printCnt++;
		totalPrintCnt++;
	}
	
	void transSummery(){
		System.out.println("----------------------------------------");	
		System.out.println(uname +" transaction summary : Debit is - " + debitCnt + " times," + " Credit is - " + creditCnt + " times," + " Printbalnce is - " + printCnt+ " times.");	
		System.out.println("----------------------------------------");	
	}
		
	static void allTransactionSummary()
	{
		System.out.println("All transaction summary : Debit is - " + totalDebitCnt + " times," + " Credit is - " + totalCredit + " times,"+ " Printbalnce is - " + totalPrintCnt +" times.");
	}
	
	public static void main(String[] args) {
		A8_BankSystem user1 =new A8_BankSystem();
		user1.setUserData("Pranoti", 10000);
		user1.debitAmt(1000);
		user1.printBalnce();
		user1.creditAmt(2000);
		user1.printBalnce();
		user1.debitAmt(2000);
		user1.printBalnce();
		user1.creditAmt(2000);
		user1.printBalnce();
		user1.transSummery();
		
		A8_BankSystem user2 =new A8_BankSystem();
		user2.setUserData("Pooja", 20000);
		user2.creditAmt(2000);
		user2.printBalnce();
		user2.debitAmt(2000);
		user2.debitAmt(2000);
		user2.printBalnce();
		user2.transSummery();
		
		A8_BankSystem.allTransactionSummary();
	}

}
