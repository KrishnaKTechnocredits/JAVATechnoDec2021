/*Assignment - 5 : 16th Dec2021

Write only one program having the following methods. [7 methods in same program] 

1. print all even numbers in a given range. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	
Hint : Void printEvenNumbers(int startNumber, int endNumber){
	for(int num = startNumber; num<=endNumber; num++){
}
}

2. On user defined range print all numbers which are divisible by 5. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user defined range print all numbers which are divisible by 5 and divisible by 3. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15

4. On user defined range print all numbers which are divisible by 7 or 13. 
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13
		 28 is divisible by 7
		 35 is divisible by 7
		 39 is divisible by 13
		 
5. Find sum of all the numbers in user define range.
Input : Range -> 1 to 5
output : sum is 15

6. Find difference between sum of odd numbers and even numbers in a given range
Input : Range -> 3 to 9
output : 6
hint : (3+5+7+9) - (4+6+8) = 6
       
7. Print only odd numbers in reverse order.
Input : Range -> 10 to 20
output : 19
         17
         15
         13
         11

 */
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