package prajakta;

public class A7_Banking_system {
	
	  static int overallDebitCount;
	  static int overallCreditCount;
	  static int balancePrintCount;
	  int balance =0;
	  String username;
	  int userDbtCount;
	  int userCrtCount;
	  int userBalancePrintCount;
	  
	  void debitAmount(int amount) {
             if(amount <= balance) {
            	   balance = balance - amount;
            	   overallDebitCount++;
            	   userDbtCount++;
             }
             else
            	   System.out.println("Insufficient Balance in"+ username+"'s account- Amount "+amount+" cannot be debitted at this moment");
	  }
	  
	  void creditAmount(int amount) {
		    if(amount > 0) {
		    balance = balance+amount;
		    overallCreditCount++;
		    userCrtCount++;
		    }
	  }
	  
	  void printBalance() {
		    System.out.println("Balance for user "+username+" is: "+balance);
		    balancePrintCount++;
		    userBalancePrintCount++;
	  }    
	      
	   void individualTransactionSummary() {
		   System.out.println("user "+username+" transaction summary : Credit - "+userCrtCount+" times, Debit - "+userDbtCount+" times, printBalance - "+userBalancePrintCount+" times" );
	  }    
	  
	  void setUserDetailsSummary(String name, int intBalance) {
		    balance = balance+ intBalance;
		    username = name;
	  }
	  
	  static void allTransactionSummary() {
		    System.out.println("No of times creditAmount method called by all users : "+overallCreditCount);
		    System.out.println("No of times debitAmount method called by all users : "+overallDebitCount);
		    System.out.println("No of times printBalance method called by all users : "+balancePrintCount);
	  }
	  
	  public static void main(String[] args) {
		     A7_Banking_system user1 = new A7_Banking_system();
		     A7_Banking_system user2 = new A7_Banking_system();
		     A7_Banking_system user3 = new A7_Banking_system();
		     user1.setUserDetailsSummary("Prajakta", 5000);
		     user2.setUserDetailsSummary("Shravani", 1000);
		     user3.setUserDetailsSummary("Prajyot", 7000);
		     user1.debitAmount(3000);
		     user1.creditAmount(1500);
		     user1.creditAmount(250);
		     user1.debitAmount(9000);
		     user1.printBalance();
		     
		     user2.creditAmount(150);
		     user2.creditAmount(1150);
		     user2.creditAmount(1300);
		     user2.creditAmount(145);
		     user2.debitAmount(1700);
		     user2.debitAmount(250);
		     user2.debitAmount(70);
		     user2.debitAmount(4000);
		     user2.printBalance();
		     
		     user3.debitAmount(450);
		     user3.creditAmount(360);
		     
		     user1.individualTransactionSummary();
		     user2.individualTransactionSummary();
		     user3.individualTransactionSummary();
		     
		     A7_Banking_system.allTransactionSummary();
	  }
}
