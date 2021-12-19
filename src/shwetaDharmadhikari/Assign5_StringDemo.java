package shwetaDharmadhikari;

class Assign5_StringDemo{
	
	void displayEvenNumbers(int startIndex,int endIndex)
	{
		System.out.println("Even numbers are: ");
		for(int num=startIndex; num<=endIndex; num++){
			if (num%2 == 0)
			System.out.println(num);
		}
		System.out.println( );
	}
	
	void divisibleNumberByFive(int startIndex,int endIndex){
		System.out.println("Divisible by 5, numbers are: ");
		for(int num=startIndex; num<=endIndex; num++)
		{
			if (num%5 == 0)
				System.out.println(num);
		}
		System.out.println( );
	}
	
	void divisibleNumber(int startIndex,int endIndex){
		System.out.println("Divisible by 5 and 3, number is: ");
		for(int num=startIndex; num<=endIndex; num++)
		{
			if (num%5 == 0 && num%3 == 0)
				System.out.println(num);
		} 
		System.out.println( );
	} 
	
	void divisibleNumberBySevenAndThirteen(int startIndex,int endIndex){
		System.out.println("Divisible by 7 and 13, number are: ");
		for(int num=startIndex; num<=endIndex; num++){
			if (num%7 == 0 || num%13 == 0)
			{
				if (num%7 == 0)
					System.out.println(num+" is divisible by 7");
				else 
					System.out.println(num+" is divisible by 13");
			}
		} 
		System.out.println( );
	} 
	
	void sumOfAllNumber(int startIndex,int endIndex){
		int sum=0;
		for (int num=startIndex; num<=endIndex; num++){
			sum=sum+num;
		}
		System.out.println("Sum is "+sum);
		System.out.println( );
	}
	
	void diffBetweensumOfOddAndEvenNumber(int startIndex,int endIndex){
		int evenSum=0,oddSum=0;
		for (int num=startIndex; num<=endIndex; num++){
			if (num%2 == 0)
				evenSum = evenSum+num;
			else 
				oddSum = oddSum+num;
		}
		int difference= 0;
		if (evenSum > oddSum){
			difference= evenSum-oddSum;
		}
		else 
			difference= oddSum-evenSum;
		System.out.println("Output: "+difference);
		System.out.println( );
	}
	
	void oddNumberInReverse(int startIndex,int endIndex){
		System.out.println("Odd numbers in reverse order : ");
		for(int num=endIndex; num>=startIndex; num--){
			if (num%2 != 0)
			System.out.println(num);
		}
		System.out.println( );
		
	}
	
	public static void main(String[] args)
	{
		Assign5_StringDemo assignment5 = new Assign5_StringDemo();
		assignment5.displayEvenNumbers(10,15);
		assignment5.divisibleNumberByFive(10,30);
		assignment5.divisibleNumber(5,18);
		assignment5.divisibleNumberBySevenAndThirteen(5,40);
		assignment5.sumOfAllNumber(1,5);
		assignment5.diffBetweensumOfOddAndEvenNumber(3,9);
		assignment5.oddNumberInReverse(10,20);
	}
}