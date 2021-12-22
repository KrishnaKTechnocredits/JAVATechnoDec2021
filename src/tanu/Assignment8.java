package tanu;

class Assignment8{
  int usercreditamount;
  int userdebitamount;
  static int userbalance;
  int debitCount;
  int creditCount;
  int printCount;
  static int allDebitCount;
  static int allCreditCount;
  static int allPrintCount;
  String currentuserName;
  
  void debitAmount(int debitamount){
  if(debitamount<=userbalance){
	debitCount++;
	allDebitCount++;
    userbalance=userbalance-debitamount;
    System.out.println("your debited amount--"+debitamount);
  }
  else{
    System.out.println("Insufficient balance");
  } 
  }
  void creditAmount(int creditamount){
  if(creditamount>0){
	creditCount++;
	allCreditCount++;
    userbalance=userbalance+creditamount;
    System.out.println("your credit amount--"+creditamount);
	
  }
  }
  void printBalance(){
	printCount++;
	allPrintCount++;
    System.out.println("your current balance--"+userbalance);
  }
  void individualTransactionSummary(){
	  
   System.out.println(currentuserName+ "transaction summary : Credit - "+creditCount+" times, Debit - "+debitCount+" times, printBalance - "+printCount+" time");
  }
  
  void setzzUserDetails(String userName,int balance){
	  currentuserName = userName;
	  userbalance = balance;
	System.out.println("Welcome"+userName);
    System.out.println("Your current balance is "+balance);	
  }
  
  static void allTransactionSummary() {
	  System.out.println("All transaction summary : Credit - "+allCreditCount+" times, Debit - "+allDebitCount+" times, printBalance - "+allPrintCount+" time");
  }
  
  public static void main(String[] arg){{
   Assignment8 user1 = new Assignment8();
   user1.setzzUserDetails("Ravi",5000);
   user1.debitAmount(500);
   user1.creditAmount(200);
   user1.creditAmount(500);
   user1.printBalance();
   user1.individualTransactionSummary();
   Assignment8 user2= new Assignment8();
   user2.setzzUserDetails("Tanu",10000);
   user2.debitAmount(500);
   user2.creditAmount(500);
   user2.printBalance();
   user2.individualTransactionSummary();
   allTransactionSummary();
  }

}
  }