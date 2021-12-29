package ashwini;

public class A10_PrimeNum {
	int count;
	double average,sum;
	
	void isPrime(int num)
	{
		boolean f=true;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				
				f=false;
				break;
			}
			
		}
		if(f==true)
		{
			count++;
			sum=sum + num;
			average=sum / count;
			System.out.println(num +" is Prime number");
		}
	}
	
	void findPrimeNumberInRange(int startNum, int endNum)
	{
		for(int num=startNum;num<=endNum;num++)
		{
			isPrime(num);
		}
	}
	
	void totalPrimeNumberInRange(int startNum, int endNum)
	{
		count=0;
		findPrimeNumberInRange(startNum,endNum);
		System.out.println("the count of total prime numbers is: " +count);
	}
	
	void sumOfPrimeNumbers(int startNum, int endNum)
	{
		sum=0;
		findPrimeNumberInRange(startNum,endNum);
		System.out.println("the sum of all prime numbers is: "+sum);
	}
	
	void avgOfPrimeNum(int startNum, int endNum)
	{
		average=0;
		count=0;
		sum=0;
		findPrimeNumberInRange(startNum,endNum);
		System.out.println("the average of prime numbers is: "+average);
	}
	
	public static void main(String[] args)
	{
	A10_PrimeNum a=new A10_PrimeNum();
	a.isPrime(17);
	System.out.println();
	a.findPrimeNumberInRange(200,220);
	System.out.println();
	a.totalPrimeNumberInRange(10,100);
	System.out.println();
	a.sumOfPrimeNumbers(100, 180);
	System.out.println();
	a.avgOfPrimeNum(20, 60);
	}
}
