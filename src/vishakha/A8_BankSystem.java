package vishakha;

/*Assignment 8- Create a Banking System*/			

public class A8_BankSystem {
	
		int creditCount, debitCount, printCount, balance;
		static int totalDebitCount, totalCreditCount, totalPrintCount;
		String userName;
		
		void setUserDetails(int initialBalance, String name) {
				balance = initialBalance;
				userName = name;
				System.out.println("Start Balance in account for " + userName + " is : Rs." + balance);
				
		}
		
		void printBalance() {
				System.out.println("Latest Balance in account for " + userName + " is : Rs." + balance);
				printCount++;
				totalPrintCount++;
				}
	
		void debit(int amount) {
				if(amount <= balance) {
					System.out.println("" + userName + " debited amount : Rs " +amount);
					balance = balance - amount;
					debitCount++;
					totalDebitCount++;
					
				}
		
				else {
						System.out.println("" + userName + " amount to be debited is Rs. " + amount);
						System.out.println("Transaction faliure because of low balance Rs. " + balance);
					
				}
		}
		
		void credit(int amount) {
				if (amount >= 0) {
						balance = balance + amount;
						System.out.println("" + userName + " Amount credited is Rs: " + amount);
						creditCount++;
						totalCreditCount++;
						
				}
				else {
					System.out.println("" + userName + " I want to credit rs. " + amount);
					System.out.println("Transaction falied due to invalid amount Rs. " +amount);
					
				}
		
		}
		
		void transactionSummary() {
				System.out.println("Transaction Summary for " + userName + " : ");
				System.out.println("Credit Transaction are : " + creditCount);
				System.out.println("Debit Transaction are : " + debitCount);
				System.out.println("Transactions printed : "+ printCount);
				
		}
		
		void allTransactionSummary() {
			System.out.println("All Transaction Summary is :");
			System.out.println("Credit transactions are : + totalCreditCount");
			System.out.println("Debit Transactions are : + totalDebitCount");
			System.out.println("Print Trasactions :  + totalPrintCount");
			
		}
		
		
		public static void main(String[] args) {
			A8_BankSystem bankSystem1 = new A8_BankSystem();
			System.out.println();
			bankSystem1.setUserDetails(500, "Vishakha");
			bankSystem1.debit(100);
			bankSystem1.credit(2000);
			bankSystem1.credit(5000);
			bankSystem1.debit(1000);
			bankSystem1.printBalance();
			bankSystem1.transactionSummary();
			System.out.println();
			bankSystem1.transactionSummary();
			
		
			A8_BankSystem bankSystem2 = new A8_BankSystem();
			bankSystem2.setUserDetails(1000, "Rahul");
			bankSystem2.debit(900);
			bankSystem2.debit(500);
			bankSystem2.debit(100);
			bankSystem2.debit(400);
			bankSystem2.printBalance();
			bankSystem2.transactionSummary();
			System.out.println();
			bankSystem2.transactionSummary();
			// TODO Auto-generated method stub

	}

}
