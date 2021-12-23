package rohini;

/*Assignment 8 - Create a Banking System which has the following functionality.*/

public class A8_BankSystem {

	int creditcnt,debtcnt,balancecnt,balance=50000;
	static int totaldebtcnt,totalcreditcnt,totalbalance;
	String username;

	void debitAmt(int debitamt) {
		debtcnt++;
		totaldebtcnt++;
		if(debitamt<=balance) {
			balance=balance-debitamt;
			//		System.out.println("Debited AMount is :"+debitamt);
			//		System.out.println("Balance is : "+balance);
		}
		else
			System.out.println("insufficient balance");
	}

	void creditAmt(int cerditamt) {
		creditcnt++;
		totalcreditcnt++;
		if(cerditamt<0) {
			balance =balance+cerditamt;
			//			System.out.println("Credited amount is:"+cerditamt);
			//			System.out.println("Now balance is :"+balance);
		}

	}

	void printbal() {
		balancecnt++;
		totalbalance++;
		//System.out.println("Cuurent balance is :"+balance);
	}

	void individualTransactionSummary(String name) {
		username = name;
		System.out.println(username +": Debit - "+debtcnt+" Credit - "+creditcnt+" balancecnt - "+balancecnt);

	}

	void allTransactionSummary() {
		System.out.println("All trasaction Summary : Debit - "+totaldebtcnt+" Credit - "+totalcreditcnt+" balance - "+totalbalance);
	}

	public static void main(String[] args) {
		A8_BankSystem user1 = new A8_BankSystem();
		user1.debitAmt(3000);
		user1.creditAmt(1267);
		user1.creditAmt(2000);
		user1.printbal();
		A8_BankSystem user2 = new A8_BankSystem();
		user2.creditAmt(3000);
		user2.debitAmt(5000);
		user2.debitAmt(4590);
		user2.debitAmt(666);
		user2.printbal();
		A8_BankSystem bank = new A8_BankSystem();
		bank.printbal();
		user1.individualTransactionSummary("Rohini");
		user2.individualTransactionSummary("Mohini");
		bank.allTransactionSummary();

	}
}
