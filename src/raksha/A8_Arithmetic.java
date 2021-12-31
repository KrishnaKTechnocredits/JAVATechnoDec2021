package raksha;

public class A8_Arithmetic {
	
	void printEvenNumbers(int startNumber, int endNumber)
	{
		System.out.println("Problem 1 - Even Numbers between 10-15 are : ");
		for(int num = startNumber; num<=endNumber; num++)
			{
				if(num % 2 == 0)
				System.out.println(num);
			}
	}
	
	void printDivisible(int startNumber, int endNumber)
	{
		System.out.println("Problem 2 - Numbers divisible by 5 between 10-30 are : ");
		for(int num = startNumber; num<=endNumber; num++)
			{
				if(num % 5 == 0)
				System.out.println(num);
			}
	}
	
	void printDivisibleNum(int startNumber, int endNumber)
	{
		System.out.println("Problem 3 - Numbers divisible by 5 and 3 between 5-18 are : ");
		for(int num = startNumber; num<=endNumber; num++)
			{
				if(num % 5 == 0 && num % 3==0)
				System.out.println(num);
			}
	}
	
	void printDiv(int startNumber , int endNumber)
	{
		System.out.println("Problem 4 - Numbers divisible by 7 or 13 between 5-40 are : ");
		for(int num = startNumber;num<=endNumber;num++)
		{
			if(num % 7 == 0)
				System.out.println(num+ " is divisible by 7");
			else if(num % 13==0)
			{
				System.out.println(num+ " is divisible by 13");
			}
		
		}
	}
	
	void sum(int startNumber, int endNumber)
	{
		System.out.println("Problem 5 - Sum of all numbers between 1-5 are : ");
		int sum = 0;
		for(int num = startNumber; num<=endNumber; num++)
			{
				sum = sum + num;
			}
		System.out.println(sum);
	}

	void diff(int startNumber, int endNumber)
	{
		System.out.println("Problem 6 - Difference between sum of odd numbers and even numbers in 3-9 are : ");
		int diff = 0;
		int sum1=0,sum2=0;
		for(int num = startNumber; num<=endNumber; num++)
			{
				if(num % 2 == 0)
					sum1 = sum1+num;
				else 
					sum2 = sum2+num;
			}	
		diff = sum2 - sum1;
		System.out.println(diff);
	}
	
	void rev(int startNumber, int endNumber) 
	{
		System.out.println("Problem 7 - Odd numbers in reverse order between 10-20 are : ");
		for(int num = endNumber; num>=startNumber; num--)
		{
			if(num % 2!= 0)
				System.out.println(num);
		}	

	}
	
	public static void main (String[] args)
	{	
		A8_Arithmetic arithmetic = new A8_Arithmetic();
		arithmetic.printEvenNumbers(10,15);
		arithmetic.printDivisible(10, 30);
		arithmetic.printDivisibleNum(5, 18);
		arithmetic.printDiv(5, 40);
		arithmetic.sum(1,5);
		arithmetic.diff(3,9);
		arithmetic.rev(10, 20);
	}

}
