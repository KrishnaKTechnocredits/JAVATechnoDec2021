package shamli;

public class Test1Program2
{
	boolean isPrime(int num)
	{
		boolean flag = true;
		for(int index=2;index<=num/2;index++)
		{
			if(num%index == 0)
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	void sumOfFirst10PrimeNumbersInRange(int fnum,int lnum)
	{
		int sum=0;
		int primeCount=0;
		int startnum=fnum;
		while(primeCount<=10 && startnum<=lnum)
		{
			if(isPrime(startnum)==true)
			{
				sum=sum+startnum;
				primeCount++;
			}
			startnum++;
		}
		System.out.println("Sum of First 10 prime numbers is: " + sum);
	}
	
	public static void main(String[] args)
	{
		Test1Program2 test1program2=new Test1Program2();
		test1program2.sumOfFirst10PrimeNumbersInRange(10, 100);	
	}
	
}