package ashok;

public class A8_assignment {
	
	int credit=0; 	int debit =0; 	int printBalance=0;
	static int allCredit=0; 	static int allDebit=0; 	static int allPrintBalance=0;
	
	void setUserDetails(String name, int balance ) {
		System.out.print(name );
		
	}
	
	void debit() {
		debit=debit+1;
		allDebit=allDebit+1;
	}
	
	void credit() {
		credit=credit+1;
		allCredit=allCredit+1;
	
	}
	void allTransactionSummary() {
		System.out.print("CREDIT "+ allCredit + " times ");
		System.out.print("DEBIT "+ allDebit + " times ");
		System.out.print("PRINT "+ allPrintBalance + " times  \n");
	}
	// Print current balance
	void printBalance() {
		printBalance=printBalance+1;
		allPrintBalance=allPrintBalance+1;
	}
	
	void individualTransactionSummary() {
		
		System.out.print("CREDIT "+ credit + " times ");
		System.out.print("DEBIT "+ debit + " times ");
		System.out.print("PRINT "+ printBalance + " times  \n");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A8_assignment a8_assignment = new A8_assignment();
		a8_assignment.setUserDetails("Ashok", 10000);
		System.out.println("  user1 transaction summary :");
		a8_assignment.credit();
		a8_assignment.credit();
		a8_assignment.debit();
		a8_assignment.printBalance();
		a8_assignment.individualTransactionSummary();
		A8_assignment a8_assignment1 = new A8_assignment();
		a8_assignment.setUserDetails("Rakesh", 10000);
		System.out.println("  user2 transaction summary :");
		a8_assignment1.credit();
		a8_assignment1.credit();
		a8_assignment1.credit();
		a8_assignment1.credit();
		a8_assignment1.credit();
		a8_assignment1.debit();
		a8_assignment1.debit();
		a8_assignment1.individualTransactionSummary();
		System.out.println(" ALL TRANSACTION SUMMARY  :");
		a8_assignment.allTransactionSummary();

	}

}
