/*
 * Assignment - 8 : 21st Dec'2021
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
 */
package shwetaDharmadhikari;

public class Assign8_Bank_Static_Example {

	String username;
	int totalbalance;
	int creditCount;
	int debitCount;
	int balanceCount;
	static int countCredit;
	static int countDebit;
	static int totalBalanceCount;

	void setUserDetails(String name, int initialBalance) {
		username = name;
		totalbalance = initialBalance;
		System.out.println("Customer name: " + name + "; Avaiable Balance: " + initialBalance);
	}

	void debitAmt(int debit) {
		totalbalance = totalbalance - debit;
		System.out.println("Debited amount: " + debit);
		countDebit++;
		debitCount++;
	}

	void creditAmt(int credit) {
		totalbalance = totalbalance + credit;
		System.out.println("Credited amount: " + credit);
		creditCount++;
		countCredit++;
	}

	void printBalance() {
		System.out.println("Available balance: " + totalbalance);
		balanceCount++;
		totalBalanceCount++;

	}

	void individualTransactionSummary() {
		System.out.println(username + " transaction Summary: Debit " + debitCount + " times, Credit: " + creditCount
				+ " times, Balance Checked:" + balanceCount + " times");

	}

	static void allTransactionSummary() {
		System.out.println("Ttransaction Summary: Debit " + countDebit + "times, Credit: " + countCredit
				+ "times, Balance Checked:" + totalBalanceCount + " times");

	}

	public static void main(String[] args) {
		Assign8_Bank_Static_Example assignment8_1 = new Assign8_Bank_Static_Example();
		assignment8_1.setUserDetails("Shweta", 20000);
		assignment8_1.debitAmt(3000);
		assignment8_1.creditAmt(1000);
		assignment8_1.debitAmt(500);
		assignment8_1.individualTransactionSummary();
		System.out.println("\n");
		
		Assign8_Bank_Static_Example assignment8_2 = new Assign8_Bank_Static_Example();
		assignment8_2.setUserDetails("Shashank", 10000);
		assignment8_2.debitAmt(7500);
		assignment8_2.creditAmt(3000);
		assignment8_2.creditAmt(2000);
		assignment8_2.debitAmt(5000);
		assignment8_2.individualTransactionSummary();
		assignment8_2.printBalance();
		System.out.println("\n");
		allTransactionSummary();

	}

}
