package krishna;

public class A8_Bank_System {
	String username;
	int initialBalance = 10000;
	static int allCredit, allDebit, printStmnt;
	int initial_Debit, initial_Credit, initial_Print;
	
	void setUserDetails(String name) {
		username = name;
	}
	
	void debitAmnt(int initial_Amount) {
		if(initial_Amount <= initialBalance) {
			System.out.println("Debited amount is: "+ initial_Amount);
			initialBalance = initialBalance - initial_Amount;
			System.out.println("New balance is :" + initialBalance);
		}else
			System.out.println("Insufficient Amount Entered");
		allDebit++;
		initial_Debit++;
	}
	
	void creditAmnt(int initial_Amount) {
		if(initial_Amount > 0) {
			System.out.println("Credited amount is: "+ initial_Amount);
			initialBalance = initialBalance + initial_Amount;
			System.out.println("Updated balance is :" + initialBalance);
		}else
			System.out.println("Please Enter Valid Amount");
		allCredit++;
		initial_Credit++;
	}
	
	void printBalance() {
		System.out.println("Available Balance :-  " +initialBalance);
		printStmnt++;
		initial_Print++;
	}
	
	void displayIndividual() {
		System.out.println(username);
		System.out.println("-Till Debit count is :" + initial_Debit + "-Till Credit count is :" + initial_Credit + "-Till Print balance count is :" + initial_Print);
	}

	static void displayAll() {
		System.out.println("All Credit count :" + allCredit + "-All Debit count :" + allDebit + "All print count:" + printStmnt);
	}
	
	public static void main(String[] args) {
		A8_Bank_System user1 = new A8_Bank_System();
		A8_Bank_System user2 = new A8_Bank_System();
		user1.creditAmnt(5000);
		user1.debitAmnt(15000);
		user1.printBalance();
		user1.setUserDetails("Keshav Raj");
		user1.displayIndividual();
		A8_Bank_System.displayAll();
		System.out.println("*******************************************************************************************************");
		

		user2.setUserDetails("Rajeshwar");
		user2.creditAmnt(5000);
		user2.creditAmnt(1000);
		user2.debitAmnt(2000);
		user2.debitAmnt(4000);
		user2.displayIndividual();

		A8_Bank_System.displayAll();
	}
}	
	
