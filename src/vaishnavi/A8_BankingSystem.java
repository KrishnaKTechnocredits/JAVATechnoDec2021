package vaishnavi;

public class A8_BankingSystem {

		String username;
		int availableBalance;
		int debitCount = 0;
		int creditCount = 0;
		static int totalDebitCount = 0;
		static int totalCreditCount=  0;
		int printBalanceCount = 0;
		static int totalPrintBalance = 0;

		void setUserData(String name,int initialBalance){
			username= name;
			availableBalance= initialBalance;
			System.out.println("Account Holder Name = "+name);
		}

		void debitAmount(int debtAmount) {
			if(debtAmount<availableBalance) {
				System.out.println("Debited amount is = "+debtAmount);
				availableBalance	=availableBalance-debtAmount;
				System.out.println("Available balance is = "+availableBalance);
			}else
				System.out.println("Insufficient balance");
				debitCount++;
				totalDebitCount++;
		}

		void creditAmount(int creditAmt ) {
			if(availableBalance>creditAmt) {
				System.out.println(creditAmt+ " Amount has been credited.");
				availableBalance=creditAmt+availableBalance;
				System.out.println("Available balance is "+availableBalance);
				creditCount++;
				totalCreditCount++;
			}
		}

		void displayBalance() {
			System.out.println("Current Balance is  "+availableBalance);
			printBalanceCount++;
			totalPrintBalance++;
		}

		void individualTransactionSummary() {
			System.out.println("Total debited count is  =  "+debitCount);
			System.out.println("Total Credited count is  =  "+creditCount);
			System.out.println("Total Balance count is =  "+printBalanceCount);
		}

		void allTransactionSummary() {
			System.out.println("Total Debited amount transaction count =  "+debitCount);
			System.out.println("Total Credited amount transaction Count =  "+creditCount);
			System.out.println("Total Balance Count =  "+printBalanceCount);
		}

		public static void main(String[] a) {
			A8_BankingSystem a8_bankingSystem =new A8_BankingSystem();
			a8_bankingSystem.setUserData("Vaishnavi",20000);
			a8_bankingSystem.debitAmount(3000);
			a8_bankingSystem.creditAmount(4000);
			a8_bankingSystem.creditAmount(5000);
			a8_bankingSystem.displayBalance();
			a8_bankingSystem.individualTransactionSummary();
			System.out.println();

			A8_BankingSystem a8_bankingsystem1 = new A8_BankingSystem();
			a8_bankingsystem1.setUserData("Kapil",10000);
			a8_bankingsystem1.debitAmount(4000);
			a8_bankingsystem1.debitAmount(5000);
			a8_bankingsystem1.creditAmount(6000);
			a8_bankingsystem1.creditAmount(6000);
			a8_bankingsystem1.creditAmount(6000);
			a8_bankingsystem1.creditAmount(6000);
			a8_bankingsystem1.creditAmount(6000);
			a8_bankingsystem1.individualTransactionSummary();
			System.out.println();

			System.out.println("Total Debit Transaction Count is : "+totalDebitCount);
			System.out.println("Total Credit Transaction Count is : "+totalCreditCount);
			System.out.println("Total Balance Count is : "+totalPrintBalance);
		}

	}

