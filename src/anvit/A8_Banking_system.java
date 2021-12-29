package anvit;

public class A8_Banking_system {
	
	int balance;
	String username;
	int countdebit;
	int countcredit;
	int countprintbal;
	static int debittransaction;
	static int credittransaction;
	static int totalprintbal;
	
	void setDetails(int initialbal, String name) {
		balance = initialbal;
		username = name;
		System.out.println("Your name is " + username);
	}
	void debitAmt(int amount){
		if(amount<=balance) {
			System.out.println("Amount to be debited " + amount);
			balance = balance - amount;
		}else
			System.out.println("Insuficient balance");
		countdebit++;
		debittransaction++;
	}
	
	void creditAmt(int amount){
		if(amount > 0) {
			System.out.println("Credit amount is " + amount);
			balance = balance + amount;
		}else
			System.out.println("Invalid number");
		countcredit++;
		credittransaction++;
	}
	
	void printBal(){
		System.out.println("Your balance is " + balance);
		countprintbal++;
		totalprintbal++;
	}
	
	void individualTransactionSummary() {
		System.out.print("Debit- "+countdebit+" times ");
		System.out.print("Credit- "+countcredit+" times ");
		System.out.print("Printbal- "+countprintbal+" times ");
	}
	
	static void allTransactionSummary(){
		System.out.print("Debit- "+debittransaction+" times ");
		System.out.print("Credit- "+credittransaction+" times ");
		System.out.print("Printbal- "+totalprintbal+" times ");
	}
	
	public static void main(String[] args) {
		A8_Banking_system user1 = new A8_Banking_system();
		user1.setDetails(1000, "Anvit");
		user1.debitAmt(500);
		user1.creditAmt(600);
		user1.creditAmt(600);
		user1.printBal();
		System.out.println();
		
		A8_Banking_system user2 = new A8_Banking_system();
		user2.setDetails(2000, "Maulik");
		user2.debitAmt(500);
		user2.debitAmt(200);
		user2.creditAmt(700);
		user2.creditAmt(800);
		user2.creditAmt(900);
		user2.creditAmt(300);
		user2.creditAmt(500);
		System.out.println();

		user1.individualTransactionSummary();
		System.out.println();
		user2.individualTransactionSummary();
		System.out.println();
		System.out.println();
		
		A8_Banking_system.allTransactionSummary();
	}
}
