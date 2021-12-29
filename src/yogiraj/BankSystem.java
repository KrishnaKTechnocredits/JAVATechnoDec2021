package yogiraj;

public class BankSystem 
{
 int amt , balance=10000;
	 
	 int debitCount , creditCount;
	 
	 String userName;
	 
	 static int TotalDebitaCall ,TotalCreditaCall;
	 
	 public void setName(String name)
	 {
		 userName = name;
	 }

	 public void debitAmount(int amt )
	 {
		 if(amt<balance)
		 {
			 System.out.println(userName + " " +"withdrawn "+ " "+ amt);
			 
			 balance = balance-amt;
		 }
		 else 
		 {
			 System.out.println("Insufficient balance");
		 }
		 
		 debitCount++;
		 
		 TotalDebitaCall++;
		 
	 }
	 
	 public void creditAmount(int amt)
	 {
		 if(amt>0)
		 {
			 balance = balance + amt;
			 			 
			 System.out.println(userName   +  " "+ "Credited " + " "+ +amt);
			 
		 }
		 
		 else
		 {
			 System.out.println("fail");
		 }
		 
		 creditCount++;
		 
		 TotalCreditaCall++;
	}
	 
	 public void print()
	 {
		 System.out.println("\n Total balance for "+userName+  " "+"is " + " "+ balance);
		 
		 System.out.println("\nTotal debit count for "+userName+" is " + " "+ debitCount);
		 
		 System.out.println("\nTotal credit count for "+userName+" is " + " "+ creditCount);
		 
		 System.out.println("");
		 
		 System.out.println("\n___________________________________________________");
	 }
	 
	 public static void totalCount()
	 {
		 System.out.println("Total Debit Count For All Users : "+TotalDebitaCall);
		 
		 System.out.println("Total Credit Count For All Users : "+TotalCreditaCall);
	 }
	 
	public static void main(String[] args)
	{
		
		BankSystem bs = new BankSystem();
		
		bs.setName("Yogiraj");
		
		bs.debitAmount(5000);
		
		bs.debitAmount(2000);
		
		bs.debitAmount(1000);
		
		bs.creditAmount(2000);
		
		bs.print();
		
		//System.out.println ("\n"+bs.debitCount);
		
		
		
		BankSystem bs1 = new BankSystem();
		
		bs1.setName("RaajYogi");
		
		bs1.debitAmount(1000);
		
		bs1.debitAmount(1000);
		
		bs1.debitAmount(1000);
		
		bs1.creditAmount(2000);
		
		bs1.print();
		
		//System.out.println ("\n"+bs.debitCount);
		
		BankSystem.totalCount();
		
	}

}
	 




