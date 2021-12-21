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

package pallavi;

class A8_BankSystem{
    String name;
	int initialBalance,userDebit, userCredit, userPrintBalance;
	static int systemDebit;
    static int systemCredit;
	static int systemPrintBalance;
		
	void debitAmount(int amt){
		
		if (amt<=initialBalance){
			initialBalance=initialBalance-amt;
			System.out.println("Debited amount= " + amt);
		}else
           	System.out.println("Insufficient balance for debitting amount"+amt);	
		userDebit++;
		systemDebit++;
	}
	
	void creditAmount(int amt){
		
		if (amt>0){
			initialBalance=initialBalance+amt;
			System.out.println("Credited amount= " + amt);
		}else
            System.out.println("Invalid amount");		
		userCredit++;
		systemCredit++;
	}
	
	void printBalance(){
		
		System.out.println("Total Balance= " + initialBalance);
		userPrintBalance++;
		systemPrintBalance++;
	}
	
	void userTransactionSummary(){
	    
		System.out.println(name+"'s transaction summary : Credit - "+ userCredit +" times, Debit - "+ userDebit +" times, printBalance - "+ userPrintBalance +" time");
	}
	
	void systemTransactionSummary(){
	    
		System.out.println("All transaction summary : Credit - "+ systemCredit +" times, Debit - "+ systemDebit +" times, printBalance - "+ systemPrintBalance +" time");
	}

	void userDetails(String username, int balance){
	      name=username;
		  initialBalance=balance;
		  System.out.println(name+", your Initial balance is="+initialBalance);
	}
	
	public static void main(String[] arr){
		
		A8_BankSystem bankSystem1=new A8_BankSystem();
		bankSystem1.userDetails("Amit",1000);
		bankSystem1.debitAmount(5000);
		bankSystem1.debitAmount(1000);
		bankSystem1.printBalance();
		bankSystem1.creditAmount(15000);
		bankSystem1.printBalance();
		bankSystem1.userTransactionSummary();
		System.out.println(); 
		A8_BankSystem bankSystem2=new A8_BankSystem();
		bankSystem2.userDetails("Pallavi",5000);
		bankSystem2.creditAmount(5000);
		bankSystem2.debitAmount(1000);
		bankSystem2.creditAmount(10000);
		bankSystem2.printBalance();
		bankSystem2.userTransactionSummary();
		System.out.println(); 
		bankSystem1.systemTransactionSummary();

	}
}