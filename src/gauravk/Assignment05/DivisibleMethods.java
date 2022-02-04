package gauravk.Assignment05;
/*
 * Assignment - 5 : 16th Dec2021

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
public class DivisibleMethods {
	
	void printingEvenNumbers(int startNum, int endNum) {
		for(int i=startNum; i<=endNum; i++) {
			if(i%2==0)
				System.out.print(i+" ");
		}
	}
	
	void printingDivisibleByFive(int startNum, int endNum) {
		for(int i=startNum; i<=endNum; i++) {
			if(i%5==0)
				System.out.print(i+" ");
		}
	}
	
	void printingDivisibleByFiveAndThree(int startNum, int endNum) {
		for(int i=startNum; i<=endNum; i++) {
			if(i%5==0 && i%3==0)
				System.out.print(i+" ");
		}
	}
	
	void printingDivisibleBySevenORThirteen(int startNum, int endNum) {
		for(int i=startNum; i<=endNum; i++) {
			if(i%7==0 || i%13==0)
				System.out.print(i+" ");
		}
	}
	
	void printingSumOfAllNumbers(int startNum, int endNum) {
		int sum=0;
		for(int i=startNum; i<=endNum; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	void differenceSumOfOddAndEven(int startNum, int endNum) {
		int sumOdd=0, sumEven=0, diff=0;
		for(int i=startNum; i<=endNum; i++) {
			if(i%2==0)
				sumEven+=i;
			else
				sumOdd+=i;
		}
		if(sumOdd>=sumEven)
			diff=sumOdd-sumEven;
		else
			diff=sumEven-sumOdd;
		System.out.println(diff);
	}
	
	void reverseOrderOfOdd(int startNum, int endNum) {
		for(int i=endNum; i>=startNum; i--) {
			if(i%2!=0)
				System.out.println(i);
		}
	}
	
	
	public static void main(String[] args) {
		DivisibleMethods dm = new DivisibleMethods();
		System.out.println("All even numbers from "+5+" to "+40+" are: ");
		dm.printingEvenNumbers(5, 40);
		System.out.println("\nNumbers divisible by 5 from "+5+" to "+40+" are: ");
		dm.printingDivisibleByFive(5, 40);
		System.out.println("\nNumbers divisible by 5 and 3 from "+5+" to "+40+" are: ");
		dm.printingDivisibleByFiveAndThree(5, 40);
		System.out.println("\nNumbers divisible by 7 or 13 from "+5+" to "+40+" are: ");
		dm.printingDivisibleBySevenORThirteen(5, 40);
		System.out.println("\nSum of all numbers from "+5+" to "+40+" are: ");
		dm.printingSumOfAllNumbers(5, 40);
		System.out.println("\nDifference between sum of odd and even numbers from "+5+" to "+40+" are: ");
		dm.differenceSumOfOddAndEven(5, 40);
		System.out.println("\nReverse order of odd numbers from "+5+" to "+40+" are: ");
		dm.reverseOrderOfOdd(5, 40);
	}
}
