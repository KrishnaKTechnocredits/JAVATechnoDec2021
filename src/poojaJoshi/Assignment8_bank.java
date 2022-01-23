package poojaJoshi;

public class Assignment8_bank {

		int debit, credit, print, balance;
		String name;
		static int totalDebit, totalCredit, totalPrint;

		void userDetails(int bal, String userName) {
			balance = bal;
			name = userName;
			System.out.println("Available Balance details for " + name + " is: " + bal);
			System.out.println();
		}

		void debitAmount(int amount) {
			if (amount <= balance) {
				balance = balance - amount;
				System.out.println("Debited amount is: " + amount);
				System.out.println();
				debit++;
				totalDebit++;
			} else
				System.out.println("Insufficient Balance");
		}

		void crditAmount(int amount) {
			if (amount > 0) {
				balance = balance + amount;
				credit++;
				totalCredit++;
				System.out.println("Credited amount is: " + amount);
				System.out.println();
			}

		}

		void printBalance() {
			System.out.println("Available Balance for " + name + " is " + balance);
			print++;
			totalPrint++;
		}

		void individualTransaction() {
			System.out.println("Individual Transaction details for " + name + " is as below : ");
			System.out.println("Debit transaction details are: " + debit);
			System.out.println("Credit transaction details are: " + credit);
			System.out.println("Printing transaction" + print);

		}

		void allTransaction() {
			System.out.println("All Transaction Summary ");
			System.out.println("All Debit Transaction : " + totalDebit);
			System.out.println("All Credit Transaction : " + totalCredit);
			System.out.println("All Print Transaction : " + totalPrint);
		}

		public static void main(String[] args) {
			Assignment8_bank bank = new Assignment8_bank();
			bank.userDetails(20000, "Pooja Joshi");
			bank.debitAmount(1000);
			bank.crditAmount(500);
			bank.crditAmount(700);
			bank.printBalance();
			bank.individualTransaction();
			System.out.println();

			Assignment8_bank bank1 = new Assignment8_bank();
			bank1.userDetails(25000, "Prasad Joshi");
			bank1.debitAmount(2000);
			bank1.debitAmount(2000);
			bank1.crditAmount(600);
			bank1.crditAmount(700);
			bank1.printBalance();
			bank1.individualTransaction();
			System.out.println();
			bank1.allTransaction();
		}

	}

