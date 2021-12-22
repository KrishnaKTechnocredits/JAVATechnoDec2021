package priyankaKamble_assignment_8;

/********
 * Assignment - 8 : 21st Dec'2021 Create a Banking System which has the
 * following functionality.
 * 
 * Create two object to perform below scenario. 1) Method to debit amount 2)
 * Method to credit amount 3) Method to printBalance [it will print current
 * balance] 4) individualTransactionSummary() method should show how many times
 * the individual debit, credit & printBalance method is called . Hint : Create
 * 3 non static instance variables. Output: user1 transaction summary : Credit -
 * 2 times, Debit - 1 times, printBalance - 1 time user2 transaction summary :
 * Credit - 5 times, Debit - 2 times, printBalance - 0 time
 * 
 * 5) allTransactionSummary() method should show by both users total how many
 * times debit, credit & printBalance method get called. Hint : Create 3 static
 * variables will be required. Output: All transaction summary : Credit - 7
 * times, Debit - 3 times, printBalance - 1 time
 * 
 * NOTE : You should have setUserDetails method to set username and initial
 * Balance .
 ******/

public class BankingSystem {
	static int debitCount, creditCount, printCount;
	int balance;
	int dCount, cCount, pCount;

	int creditAmt(int creditAmt) {
		System.out.println("::::credit Operation ::::\t");
		// System.out.println("\tavailable Balance "+balance);
		System.out.println("\tAmount to be Credited " + creditAmt);
		balance = balance + creditAmt;
		cCount++;
		creditCount++;
		// System.out.println("\tAvailable Balance " +balance);
		return balance;
	}

	int debitAmt(int debitAmt) {
		System.out.println(":::: Debit Operation ::::\t");
		// System.out.println("Available Balance "+balance);
		System.out.println("\tAmount to be Debited " + debitAmt);
		if (balance > debitAmt && balance > 0) {
			balance = balance - debitAmt;
			dCount++;
			debitCount++;
			// System.out.println("\tAvailable Balance " +balance);
		} else if (balance < debitAmt || balance <= 0) {
			System.out.println("\tAvailable Balance " + balance);
			System.out.println("\tInsufficient Balance, Try again");
		}
		// System.out.println("\tRemaining Balance " +balance);
		return balance;
	}

	void totalCount() {
		System.out.println("\n------------------Symmary of Transaction-------------");
		System.out.println("Total Debit Count is = " + debitCount);
		System.out.println("Total Credit Count is = " + creditCount);
		System.out.println("Total Count of Printing Balance is = " + printCount);
	}

	void individualCount(String custName) {
		System.out.println("\nDebit Count of " + custName + " is - " + dCount);
		System.out.println("Credit Count of " + custName + " is - " + cCount);
		System.out.println("Printing Balance Count of " + custName + " is - " + pCount);
	}

	void printBalance() {
		printCount++;
		pCount++;
		System.out.println("\nAvailable Balance of Customer- " + balance);
	}

	void setUserDetails(String custName) {
		System.out.println("Customer Name - " + custName);
		System.out.println("Customer Initial Balance - " + balance + "\n");
	}

	public static void main(String[] args) {
		BankingSystem bankingSystem = new BankingSystem();
		BankingSystem customer1 = new BankingSystem();
		System.out.println("-------------------Transaction for Customer 1 -------------------");
		customer1.setUserDetails("Maulik Kanani");
		customer1.creditAmt(500);
		customer1.debitAmt(700);
		customer1.creditAmt(15000);
		customer1.debitAmt(1000);
		customer1.printBalance();
		customer1.individualCount("Mauik");

		BankingSystem customer2 = new BankingSystem();
		System.out.println("\n ----------- Transaction for Customer 2 -------------------");
		customer2.setUserDetails("Krishna Kanani");
		customer2.creditAmt(25000);
		customer2.debitAmt(1500);
		customer2.creditAmt(4000);
		customer2.creditAmt(2000);
		customer2.creditAmt(2500);
		customer2.debitAmt(10000);
		customer2.printBalance();
		customer2.individualCount("Krishna");

		bankingSystem.totalCount();
	}
}
