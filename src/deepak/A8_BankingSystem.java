/*Assignment - 8: 21st Dec'2021
Create a Banking System which has the following functionality.

Create two objects to perform below scenario.
1) Method to debit amount
2) Method to credit amount
3) Method to printBalance [it will print current balance]
4) individualTransactionSummary() method should show how many times the individual debit, credit & printBalance method is called .
Hint: Create 3 non static instance variables.
Output:
user1 transaction summary : Credit - 2 times, Debit - 1 times, printBalance - 1 time
user2 transaction summary : Credit - 5 times, Debit - 2 times, printBalance - 0 time

5) allTransactionSummary() method should show by both users total how many times debit, credit & printBalance method get called.
Hint : Create 3 static variables will be required.
Output:
All transaction summary : Credit - 7 times, Debit - 3 times, printBalance - 1 time

NOTE : You should have setUserDetails method to set username and initial Balance.
*/
package deepak;
class A8_BankingSystem{
	int balance;
	String customerName;
	int debitCnt;
	int creditCnt;
	int printBalanceCnt;
	static int totalDebitCnt;
	static int totalCreditCnt;
	static int totalPrintBalanceCnt;
		
	void setUserDetails(int bal, String name){
		balance = bal;
		customerName = name;
	}
	
	void debitAmount(int amount){
		if(amount <= balance)
			balance = balance - amount;
		else
			System.out.println("Insufficient Balance");
		debitCnt++;
		totalDebitCnt++;
	}
	
	void creditAmount(int amount){
		balance = balance + amount;
		creditCnt++;
		totalCreditCnt++;
	}
	
	void printBalance(){
		System.out.println(customerName+", Account balance in your account is: "+balance);
		printBalanceCnt++;
		totalPrintBalanceCnt++;
		System.out.println();
	}
	
	void individualTransactionSummary(){
		System.out.println(customerName+" Transaction Summary");
		System.out.println("Debit Count: "+debitCnt+" times");
		System.out.println("Credit Count: "+creditCnt+" times");
		System.out.println("Print Balance Count: "+printBalanceCnt+" times");
		System.out.println();
	}
	
	void allTransactionSummary(){
		System.out.println("Total Transactions Summary");
		System.out.println("Total Debit Count: "+totalDebitCnt+" times");
		System.out.println("Total Credit Count: "+totalCreditCnt+" times");
		System.out.println("Total Print Balance Count: "+totalPrintBalanceCnt+" times");
		System.out.println();
	}
	
	public static void main(String[] args){
		A8_BankingSystem bankingSystem1 = new A8_BankingSystem();
		bankingSystem1.setUserDetails(10000,"Deepak Kankhar");
		bankingSystem1.creditAmount(6000);
		bankingSystem1.creditAmount(8000);
		bankingSystem1.debitAmount(2000);
		bankingSystem1.printBalance();
		bankingSystem1.individualTransactionSummary();
		
		A8_BankingSystem bankingSystem2 = new A8_BankingSystem();
		bankingSystem2.setUserDetails(5000,"Divit Kankhar");
		bankingSystem2.creditAmount(5000);
		bankingSystem2.creditAmount(5000);
		bankingSystem2.creditAmount(5000);
		bankingSystem2.creditAmount(5000);
		bankingSystem2.creditAmount(5000);
		bankingSystem2.debitAmount(2000);
		bankingSystem2.debitAmount(2000);
		bankingSystem2.individualTransactionSummary();
		bankingSystem2.allTransactionSummary();	
	}
}
