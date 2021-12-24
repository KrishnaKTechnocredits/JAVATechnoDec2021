package archana;
class Ass8_BankTrans2{
	    int CurrBalance;
        String username;
        int creditCount = 0;
        int debitcount = 0;
        int printoldbalancecount = 0;
        static int totDebitCount = 0;
        static int totCreditCount = 0;
        static int totprintoldBalance = 0;
	void userAccDetails(String name, int Initialamt)
        {
            System.out.println("Name : " + name);
            System.out.println("Initial Balance : " + Initialamt);				
			CurrBalance = Initialamt;
			System.out.println();
        }
    void credit(int crAmt, String name)
        {
            CurrBalance = CurrBalance + crAmt;
            creditCount++;
            System.out.println(name+" credited :"+crAmt+" and Balance is: " + CurrBalance +" and cr no :" + creditCount );           
            totCreditCount++;
        }
	void debit(int drAmt, String name)
        {
			if((CurrBalance!=0)&&(CurrBalance>drAmt)){
            CurrBalance = CurrBalance - drAmt;
            debitcount++;
            System.out.println(name+" debited :"+drAmt+" and Balance is: " + CurrBalance +" and dr no :" + debitcount );           
            totDebitCount++;
		  }
			
        }
		
    void printBalance(){
            System.out.println("Individual credits : "+creditCount+" and Debit :"+debitcount+" current balance =  " + CurrBalance);            
            printoldbalancecount++;            
			System.out.println("------------------------------------------------------------------");
        }
		
	void allTransactionSummary(){
		    System.out.println("Total Credit Count =  " + totCreditCount);
            System.out.println("Total Debit count =  " + totDebitCount);            
            System.out.println("Total PrintBalance Count =  " + printoldbalancecount);
			System.out.println("------------------------------------------------------------------");
            
        }
}