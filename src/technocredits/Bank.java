
package technocredits;

public class Bank {
	String username;
	int debitCnt, creditCnt;
	void setUsername(String name) {
		username = name;
	}
	
	void debitAmt() {
		debitCnt++;
	}
	
	void creditAmt() {
		creditCnt++;
	}
	
	void printStatement() {
		System.out.println(username + " - debitOp count " + debitCnt);
	}
	
	public static void main(String[] args) {
		Bank user1 = new Bank();
		user1.setUsername("Maulik");
		user1.debitAmt();
		user1.debitAmt();
		user1.creditAmt();
		user1.creditAmt();
		user1.creditAmt();
		
		Bank user2 = new Bank();
		user2.debitAmt();
		user2.creditAmt();
		user2.creditAmt();
		
		
	}
}
