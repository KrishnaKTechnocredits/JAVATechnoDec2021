package ashwini;
class A8_BankSys
{
  int creditCnt=0;
  int debitCnt=0;
  double printBalanceCnt=0;
  
  static int creditC=0;
  static int debitC=0;
  static double printbalC=0;
  
  double balance;
  String UN;
  
   static void allTransactionSummary()
  {
        System.out.println("Debits from both users : " + debitC + "times");
		System.out.println("Credits from both users : " + creditC + "times");
		System.out.println("Printed Balance by both users: " + printbalC + "times");
  }
   
   void individualTransactionSummary(String username)
   {
        System.out.println(username + " Debited : " + debitCnt + "times");
		System.out.println(username + " Credited : " + creditCnt + "times");
		System.out.println(username + " Printed Balance : " + printbalC + "times");
	}
   
   void setUserDetails(String username,double bal)
   {
      UN=username;
	  balance=bal;
   }
   
   void debitAmt(double amt) {
		if (amt <= balance)
			balance = balance - amt;
		else
			System.out.println("Insufficient balance : " + balance);
		debitCnt++;
		debitC++;
	}

	void creditAmt(double amt) {
		if (amt > 0) {
			balance = balance + amt;
		}
		creditCnt++;
		creditC++;
	}
  
  
  void printBalance()
  {
	System.out.println("the balace is: "+ balance); 
    printbalC++;
    printBalanceCnt++;
  }
 
 public static void main(String [] args)
  {
  A8_BankSys obj1=new A8_BankSys();
  obj1.setUserDetails("Ashwini",200000);
  obj1.creditAmt(10000);
  obj1.creditAmt(100);
  obj1.debitAmt(100);
  obj1.printBalance();
  obj1.individualTransactionSummary("ashwini");
  
  A8_BankSys obj2=new A8_BankSys();
  obj2.setUserDetails("suraj",500000);
  obj2.creditAmt(2000);
  obj2.debitAmt(200);
  obj2.debitAmt(200);
  obj2.individualTransactionSummary("suaj");
  obj2.printBalance();
  allTransactionSummary();
  }
  
 }