package shamli;

public class Assignment5 
{
	void printEvenNumbers(int startnumber, int endnumber)
	{
		for(int num=startnumber;num<=endnumber;num++)
		{
			if(num%2==0)
			System.out.println(num + " is a even number");
		}
	}
	
	void printDivisibleBy5(int startnumber, int endnumber)
	{
		for(int num=startnumber;num<=endnumber;num++)
		{
			if(num%5==0)
			System.out.println(num + " is Divisible by 5");
		}
	}
	
	void printDivisibleBy3And5(int startnumber, int endnumber)
	{
		for(int num=startnumber;num<=endnumber;num++)
		{
			if(num%3==0 && num%5==0)
			System.out.println(num + " is Divisible by 3 and 5");
		}
	}

	
	void printDivisibleBy7And13(int startnumber, int endnumber)
	{
		for(int num=startnumber;num<=endnumber;num++)
		{
			if(num%7==0 && num%13==0)
			System.out.println(num + " is Divisible by 7 and 13");
		}
	}
	
	void printSumOfAll(int startnumber, int endnumber)
	{
		int sum=0;
		for(int num=startnumber;num<=endnumber;num++)
		{
			sum= sum+num;	
		}
		System.out.println("Sum of all numbers is :" + sum);
	}
	
	void printDiffOfOddAndEven(int startnumber, int endnumber)
	{
		int sumOfOdd=0;
		int sumOfEven=0;
		int difference=0;
		for(int num=startnumber;num<=endnumber;num++)
		{
			if(num%2==0)
			{
				sumOfEven= sumOfEven + num;
			}
			else
			{
				sumOfOdd= sumOfOdd + num;
			}
			difference=sumOfOdd-sumOfEven;		 
		}
		System.out.println("Difference is :" + difference);
	}
	
	void printOddInReverse(int startnumber, int endnumber)
	{
		for(int num=endnumber;num>=startnumber;num--)
		{
			if(num%2 != 0)
			System.out.println(num);
		}
	}
	
	public static void main(String[] args)
	{
		Assignment5 assignment5 = new Assignment5();
		assignment5.printEvenNumbers(10, 50);
		System.out.println("-------------------------------------");
		assignment5.printDivisibleBy5(10, 100);
		System.out.println("-------------------------------------");
		assignment5.printDivisibleBy3And5(1, 30);
		System.out.println("-------------------------------------");
		assignment5.printDivisibleBy7And13(1, 50);
		System.out.println("-------------------------------------");
		assignment5.printSumOfAll(10, 20);
		System.out.println("-------------------------------------");
		assignment5.printDiffOfOddAndEven(10, 20);
		System.out.println("-------------------------------------");
		assignment5.printOddInReverse(10, 20);
	}
}
