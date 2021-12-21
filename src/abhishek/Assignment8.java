class Assignment8 {
	String username;
	static int totalCredit , totalDebit , print;
	int indiDebit , indiCredit , indiprint;
	int balance = 6000;

	void setUsername(String name) {
		username = name;
	}

	void debitAmount(int amt) {
		if(amt <= balance) {
			System.out.println("Debit amount is: "+ amt);
			balance = balance - amt;
			System.out.println("New balance is :" + balance);
		}else
			System.out.println("Insufficient Balance.");
		totalDebit++;
		indiDebit++;
	}

	void creditAmount(int amt) {
		if(amt > 0) {
			System.out.println("Credit amount is :" + amt);
			balance = balance + amt;
			System.out.println("New Balance is : " + balance);
		}
		else
			System.out.println("Invalid Entry");
		totalCredit++;
		indiCredit++;
	}

	void printBalance() {
		System.out.println("Current Balance is :" + balance);
		print++;
		indiprint++;
	}

	void printDisplayIndividual() {
		System.out.println(username + "-Debit count is :" + indiDebit + "-Credit count is :" + indiCredit + "-Print balance count :" + indiprint);
	}

	static void printDisplayAll() {
		System.out.println("Total Credit count :" + totalCredit + "-Total Debit count :" + totalDebit + "Total print count:" + print);
	}

	public static void main(String[] args) {
		Assignment8 user1 = new Assignment8();
		Assignment8 user2 = new Assignment8();
		user1.setUsername("Anand");
		user1.creditAmount(4000);
		user1.creditAmount(1000);
		user1.debitAmount(2500);
		user1.printBalance();
		user1.printDisplayIndividual();

		user2.setUsername("Abhishek");
		user2.creditAmount(1000);
		user2.creditAmount(2000);
		user2.creditAmount(5000);
		user2.creditAmount(1000);
		user2.creditAmount(1500);
		user2.debitAmount(200);
		user2.debitAmount(2000);
		user2.printDisplayIndividual();

		Assignment8.printDisplayAll();
	}
}