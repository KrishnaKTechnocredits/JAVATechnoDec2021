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

package vaibhav.Assignment_5;

public class NumberGame{
	
	void numberInRange(int startNum, int endNum){
		System.out.println("Even numbers in the given range "+ startNum +" to " + endNum + " are as below : ");
		for (int num= startNum; num<=endNum; num++){
			if (num%2 ==0){
				System.out.print(num + " , " );
			}
		}
		System.out.println("");
		System.out.println("------------------------------------------------------------");	
	}
	
	void numberDivisibleByFive(int startNum, int endNum){
		System.out.println("Numbers divisible by 5 in the given range "+ startNum +" to " + endNum + " are as below : ");
		for (int num = startNum; num<=endNum; num++){
			if (num%5 ==0){
				System.out.print(num + " , " );
			}
		}
		System.out.println("");
		System.out.println("------------------------------------------------------------");			
	}
	
	void numberDivisibleByFiveAndThree(int startNum, int endNum){
		System.out.println("Numbers divisible by 5 & 3 in the given range "+ startNum +" to " + endNum + " are as below : ");
		for (int num = startNum; num<=endNum; num++){
			if ((num%5 ==0)&& (num%3 ==0)){
				System.out.print(num + " , " );
			}
		}
		System.out.println("");
		System.out.println("------------------------------------------------------------");			
	}
	
	void numberDivisibleBySevenORThirteen(int startNum, int endNum){
		System.out.println("Numbers divisible by 7 or 13 in the given range "+ startNum +" to " + endNum + " are as below : ");
		for (int num = startNum; num<=endNum; num++){
			if ((num%7 ==0) || (num%13 ==0)){
				if (num%7==0)
					System.out.println(num + " divisible by 7 ");
				if (num%13==0)
					System.out.println(num + " divisible by 13 ");
			}		
		}
		System.out.println("------------------------------------------------------------");	
	}
	
	void sumOfNumbers(int startNum, int endNum){
		if (startNum>endNum){
			int temp = startNum;
			startNum = endNum;
			endNum = temp;
		}
		
		int sum = 0;
		for (int index = startNum;index <=endNum;index++){
			sum = sum + index;
		}
		System.out.println("sum of all numbers in user defined range " + startNum + " to " + endNum + " is : " + sum);
		System.out.println("------------------------------------------------------------");	
	}
	
	void diffOfEvenAndOdd(int startNum, int endNum){
		
		int evenNumSum = 0;
		int oddNumSum = 0;
		
		if (startNum>endNum){
			int temp = startNum;
			startNum = endNum;
			endNum = temp;
		}
		
		for (int index = startNum; index <=endNum; index++){
			if (index%2 == 0)
				evenNumSum = evenNumSum + index;
			else
				oddNumSum = oddNumSum + index;			
		}
		
		int diffOfEvenOddSum=0;
		if (evenNumSum>=oddNumSum)
			diffOfEvenOddSum = evenNumSum - oddNumSum;
		else 
			diffOfEvenOddSum = oddNumSum - evenNumSum;
				
		System.out.println("Difference between sum of odd numbers and even numbers in a given range " + startNum + " to " + endNum + " is : " + diffOfEvenOddSum);
		System.out.println("------------------------------------------------------------");				
	}
	
	void oddNumInReverseOrder(int startNum, int endNum){
		if (startNum>endNum){
			int temp = startNum;
			startNum = endNum;
			endNum = temp;
		}
		System.out.println("Odd numbers in reverse order for the given range " + startNum + " to "+endNum + " are as below ");
		for (int index = endNum; index >=startNum; index--){
			if (index%2 !=0)
				System.out.print(index + " , ");
		}
		System.out.println("");
		System.out.println("------------------------------------------------------------");			
	}
	
	public static void main (String [] args){
		NumberGame numberGame = new NumberGame();
		numberGame.numberInRange(10,15);
		numberGame.numberDivisibleByFive(10,30);
		numberGame.numberDivisibleByFiveAndThree(5,18);
		numberGame.numberDivisibleBySevenORThirteen(5,40);
		numberGame.sumOfNumbers(5,1);
		numberGame.diffOfEvenAndOdd(9,3);	
		numberGame.oddNumInReverseOrder(20,10);
	}
}

