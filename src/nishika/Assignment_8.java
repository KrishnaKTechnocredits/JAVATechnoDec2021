package nishika;

public class Assignment_8 {
	int balance ;
	String username;
	
	int debitcount;
	int creditcount;
	int printcount;
	
	static int overalldebitcount;
	static int overallcreditcount;
	static int overallprintcount;
	
	void setUserDetais(String user , int initialbal) {
		username=user;
		balance=initialbal;
	}
	
	void debitAmount(int amount) {
		debitcount++;
		overalldebitcount++;
	}
	
	void creditAmount(int amount) {
		creditcount++;
		overallcreditcount++;
	}
	
	void printBalance() {
		printcount++;
		overallprintcount++;
	}
	
	void indi_transction_summary(String user) {
		System.out.println(user + " Credit--> "+ creditcount + " Debit--> " + debitcount + " Print---> " + printcount );
	}
	
	static void alltrasctionsummary()
	{
		System.out.println("OverallCredit--> "+  overallcreditcount + " OverallDebit--> " +overalldebitcount  + " OverallPrint--> " + overallprintcount );
	}
	
	
	public static void main(String[] args) {
		Assignment_8 user1 = new Assignment_8();
		Assignment_8 user2 = new Assignment_8();
	    user1.setUserDetais("Nishika", 2500);
	    user1.debitAmount(100);
		user1.debitAmount(100);
		user1.creditAmount(200);
		user1.creditAmount(200);
		user1.printBalance();
		user1.indi_transction_summary("Nishika");
		
		user2.setUserDetais("zeel", 1000);
		user2.debitAmount(100);
		user2.creditAmount(200);
		user2.printBalance();
		user2.indi_transction_summary("Zeel");
		
		alltrasctionsummary();
		
	}
}
