package shamli;

public class Assignment8 
{
	int creditAmt,debitAmt,balance,totalbalance;
	String username;
	static int creditCall,debitCall,balanceCall;
	void setUserDetails(String uname,int bal)
	{
		username=uname;
		totalbalance=bal;
	}
	
	void debitAmount(int amt)
	{
		if(amt>totalbalance)
		{
			System.out.println("No sufficient balance");
		}
		else
		{
			totalbalance=totalbalance-amt;
		}
		//System.out.println("Total Balance Available is : "+ totalbalance);
		debitAmt++;
		debitCall++;
	}
	
	void creditAmount(int amt)
	{
		if(amt<=0)
		{
			System.out.println("Credited amount should be greater than 0");
		}
		else
		{
			totalbalance=totalbalance+amt;
		}
		//System.out.println("Total Balance Available is : "+ balance);
		creditAmt++;
		creditCall++;
	}
	
	void printBalance()
	{
		System.out.println("The User "+username +" is having total balance = " + totalbalance);
		balance++;
		balanceCall++;
	}
	
	void individualTransactionSummary()
	{
		System.out.println("Credit :" + creditAmt+ "  Debit "+debitAmt+"  printBalance :"+balance);
	}
	
	void allTransactionSummary() 
	{
		System.out.println("Credit :" + creditCall+ " Debit "+debitCall+" printBalance :"+balanceCall);
	}
	
	public static void main(String[] args) 
	{
		Assignment8 assignment8 = new Assignment8();
		Assignment8 assignment81 = new Assignment8();
		assignment8.setUserDetails("Shamli",5000);
		assignment8.creditAmount(500);
		assignment8.debitAmount(1000);
		assignment8.printBalance();
		assignment8.individualTransactionSummary();
		assignment8.allTransactionSummary();
		assignment81.setUserDetails("Vishal",10000);
		assignment81.creditAmount(500);
		assignment81.debitAmount(1000);
		assignment81.printBalance();
		assignment81.individualTransactionSummary();
		assignment81.allTransactionSummary();
	}

}
