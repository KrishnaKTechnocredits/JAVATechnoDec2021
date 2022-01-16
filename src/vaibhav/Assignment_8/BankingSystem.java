/*Assignment - 8 : 21st Dec'2021
Create a Banking System which has the following functionality.

Create two object to perform the below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times the individual debit, credit & printBalance method is called .
Hint : Create 3 non static instance variables.
Output:
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time

NOTE : You should have setzzUserDetails method to set username and initial Balance .

*/

package vaibhav.Assignment_8;

public class BankingSystem {

	static int tDebitCnt;
	static int tCreditCnt;
	static int tPrintBalCnt;
	int debitCnt;
	int creditCnt;
	int printBalCnt;
	String userName;
	int balance;

	void setUserDetails(String name, int initialBalance) {
		userName = name;
		balance = initialBalance;
	}

	void debitOp(int debitAmt) {
		tDebitCnt++;
		debitCnt++;
		if (balance >= debitAmt) {
			System.out.println(userName + " has debited " + debitAmt + " rupees from his account");
		} else
			System.out.println(userName
					+ " not able to debit as requested ammount is greater than the available balance in the account");
	}

	void creditOp(int creditAmt) {
		tCreditCnt++;
		creditCnt++;
		if (creditAmt > 0) {
			balance = balance + creditAmt;
			System.out.println(userName + " has credited " + creditAmt + "rupees in this account ");
		} else
			System.out.println("Invalid credit amount");
	}

	void printBalance() {
		printBalCnt++;
		System.out.println("Available balance in the account : " + balance + " rupees");
	}

	void individualTransactionSummary() {
		System.out.println(userName + " transaction summary : Credit - " + creditCnt + " times, Debit - " + debitCnt
				+ " times, printBalance - " + printBalCnt + " time");
	}

	void allTransactionSummary() {
		System.out.println("All transaction summary : Credit - " + tCreditCnt + " times, Debit - " + tDebitCnt
				+ " times, printBalance - " + tPrintBalCnt + " time");
	}

	public static void main(String[] args) {

		BankingSystem bankingSystem1 = new BankingSystem();
		bankingSystem1.setUserDetails("Techno", 10000);
		bankingSystem1.debitOp(2000);
		bankingSystem1.debitOp(8500);
		bankingSystem1.printBalance();
		bankingSystem1.creditOp(1000);
		bankingSystem1.printBalance();
		bankingSystem1.debitOp(5000);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();
				
		System.out.println("");
		System.out.println("");

		BankingSystem bankingSystem2 = new BankingSystem();
		bankingSystem2.setUserDetails("Credits", 20000);
		bankingSystem2.debitOp(2000);
		bankingSystem2.debitOp(18500);
		bankingSystem2.creditOp(1000);
		bankingSystem2.creditOp(3000);
		bankingSystem2.printBalance();

		
		bankingSystem2.individualTransactionSummary();

		System.out.println("");
		
		bankingSystem1.allTransactionSummary();
		bankingSystem2.allTransactionSummary();

	}

}
