package anjali;

public class Anjali_Assignment_8_BankingSystem {
	
      int Balance;
	  int credit;
      int debit;
      String name; 
      int countForCredit=0;
      int countForDebit=0;
      int countForPrint=0;
      static int totalcountForCredit=0;
      static int totalcountForDebit=0;
      static  int totalcountForPrint=0;

	 public static void main(String[] args) {
		allTransactionSummary();
		individualTransactionSummary();
		}
	 
	 void  setUserName(String name1){
		name=name1;	    
	 }
	
	void printBalance()
	{
		System.out.println("Your balance  is: "+ Balance);
		countForPrint++;
		totalcountForPrint++;
	}
	
	 
      void CreditAmount(int CreditAmount)
      {
        Balance= Balance+CreditAmount;
    	System.out.println("The credited amount  is: "+CreditAmount);
        countForCredit++;
        totalcountForCredit++;
	}

      void debitAmount(int debitAmount )
      {
    		
        System.out.println("The debited amount  is: "+debitAmount);
    	if(debitAmount< Balance )
  		{	
  	    Balance= Balance-debitAmount;  	
  		}
  		else
  		System.out.println("unable to withdraw due to insuffcient balance");
    	countForDebit++;
  		totalcountForDebit++;
  		
      }
  		
  		
  	     static  void  allTransactionSummary(){

  	    	 Anjali_Assignment_8_BankingSystem  user1= new  Anjali_Assignment_8_BankingSystem();  	      
  	    	 user1.setUserName("Anjali");
  	    	 System.out.println("Trasaction summary for user :"+user1.name);
  	    	 user1.CreditAmount(500);
  	    	 user1.printBalance();
  	    	 user1.CreditAmount(500);
  	    	 user1.printBalance();
  	    	 user1.debitAmount(500);
  	    	 user1.printBalance();	
 		
 	
  	    	 System.out.println("*************************************************************");
         
  	    	 Anjali_Assignment_8_BankingSystem  user2= new  Anjali_Assignment_8_BankingSystem(); 		
  	    	 user2.setUserName("Ravi");
 		 	System.out.println("Trasaction summary for user :"+user2.name);
 		 	user2.CreditAmount(500);
 		 	user2.printBalance();
 		 	user2.CreditAmount(500);
 		 	user2.printBalance();
 			user2.CreditAmount(500);
 			user2.printBalance();
 			user2.CreditAmount(500);
 			user2.printBalance();
 			user2.CreditAmount(500);
 			user2.printBalance();
 			user2.debitAmount(500);
 			user2.printBalance();
 			user2.debitAmount(500);
 			user2.printBalance(); 		
 			
 			System.out.println("*************************************************************");
 	
 		 
 			System.out.println("Credit count : "+totalcountForCredit);
 			System.out.println("debit count : "+totalcountForDebit);
 			System.out.println("print count : "+totalcountForPrint);
 			System.out.println("*************************************************************");
  	     }
         
  	     
        
      static void individualTransactionSummary(){

        	 Anjali_Assignment_8_BankingSystem  user1= new  Anjali_Assignment_8_BankingSystem();  	      
 	    	 user1.setUserName("Anjali");
 	    	 System.out.println("Trasaction summary for user :"+user1.name);
 	    	 user1.CreditAmount(500);
 	    	 user1.printBalance();
 	    	 user1.CreditAmount(500);
 	    	 user1.printBalance();
 	    	 user1.debitAmount(500);
 	    	 user1.printBalance();	
 	    	 System.out.println("*************************************************************");
		  
    		  System.out.println("Credit count : "+user1.countForCredit);
    		  System.out.println("debit count : "+user1.countForDebit);
    		  System.out.println("print count : "+user1.countForPrint);
		
	

		
		
		     System.out.println("*************************************************************");
		     
		    Anjali_Assignment_8_BankingSystem  user2= new  Anjali_Assignment_8_BankingSystem(); 		
  	    	user2.setUserName("Ravi");
 		 	System.out.println("Trasaction summary for user :"+user2.name);
 		 	user2.CreditAmount(500);
 		 	user2.printBalance();
 		 	user2.CreditAmount(500);
 		 	user2.printBalance();
 			user2.CreditAmount(500);
 			user2.printBalance();
 			user2.CreditAmount(500);
 			user2.printBalance();
 			user2.CreditAmount(500);
 			user2.printBalance();
 			user2.debitAmount(500);
 			user2.printBalance();
 			user2.debitAmount(500);
 			user2.printBalance(); 
 			 System.out.println("*************************************************************");
		 
	 		 System.out.println("Credit count : "+user2.countForCredit);
	 		 System.out.println("debit count : "+user2.countForDebit);
	 		 System.out.println("print count : "+user2.countForPrint);
    	
	
		
		
		
	}

}







