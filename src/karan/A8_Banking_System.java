package karan;
/*Create a Banking System which has the following functionality.

Create two object to perform below scenario.
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

NOTE : You should have setUserDetails method to set username and initial Balance .*/

public class A8_Banking_System {
	String name;
	static int system_Debit;
    static int system_Credit;
	static int print_Balance;
	int balance,userDebit, userCredit, userCurrent_Balance;

	void debit_Amount(int amount){
		if (amount<=balance){
			balance=balance-amount;
			System.out.println("Debited amount= " + amount);
		}
		else
           	System.out.println("Insufficient amount"+amount);	
		userDebit++;
		system_Debit++;
	}

	void credit_Amount(int amount){
		if (amount>0){
			balance=balance+amount;
			System.out.println("Credited amount= " + amount);
		}
		else
            System.out.println("Invalid amount");		
		userCredit++;
		system_Credit++;
	}

	void print_Balance(){

		System.out.println("Total Balance= " + balance);
		userCurrent_Balance++;
		print_Balance++;
	}

	void userTransactionSummary(){

		System.out.println(name+"'s transaction summary : Credit - "+ userCredit +" times, Debit - "+ userDebit +" times, printBalance - "+ userCurrent_Balance +" time");
	}

	void allTransactionSummary(){

		System.out.println("All transaction summary : Credit - "+ system_Credit +" times, Debit - "+ system_Debit +" times, printBalance - "+ print_Balance +" time");
	}

	void userDetails(String username, int amount){
	      name=username;
		  balance=amount;
		  System.out.println(name+", your balance is="+balance);
	}

	public static void main(String[] arr){

		A8_Banking_System bank_System_1=new A8_Banking_System();
		bank_System_1.userDetails("Karan",10000);
		bank_System_1.debit_Amount(2500);
		bank_System_1.debit_Amount(1000);
		bank_System_1.print_Balance();
		bank_System_1.credit_Amount(45000);
		bank_System_1.print_Balance();
		bank_System_1.userTransactionSummary();
		System.out.println(); 
		A8_Banking_System bank_System_2=new A8_Banking_System();
		bank_System_2.userDetails("Arjun",50000);
		bank_System_2.credit_Amount(5000);
		bank_System_2.debit_Amount(10000);
		bank_System_2.credit_Amount(1000);
		bank_System_2.print_Balance();
		bank_System_2.userTransactionSummary();
		System.out.println(); 
		bank_System_1.allTransactionSummary();

	}
}
