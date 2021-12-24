/*Assignment 5- 16Dec21
 * 1. print all even numbers in a given range. 
  2. On user defined range print all numbers which are divisible by 5. 
  3. On user defined range print all numbers which are divisible by 5 and divisible by 3. 
  4. On user defined range print all numbers which are divisible by 7 or 13. 
  5. Find sum of all the numbers in user define range.class
  6. Find difference between sum of odd numbers and even numbers in a given range
  7. Print only odd numbers in reverse order.
  
*/

package priyankaZende;
class A5_ForLoopDemo{	
	// Print all even numbers in a given range.
	void printEvenNumbers (int startNumber, int endNumber){
		System.out.println("Even numbers in the range of " + startNumber+ " and " + endNumber+ " are:");
			for(int num = startNumber; num <= endNumber; num++){
				if((num%2) == 0)
					System.out.println(num);
			}
	}
	
	//On user defined range print all numbers which are divisible by 5. 
	void numbersDivisibleByFive(int startNumber, int endNumber){
		System.out.println("Divisible by 5, numbers in the range of " + startNumber+ " and " + endNumber+ " are:");
			for(int index = startNumber; index<=endNumber;index++){
				if((index%5)==0)
					System.out.println(index);
		}
	}		
	
	//On user defined range print all numbers which are divisible by 5 and divisible by 3. 
	void numbersDivisibleByFiveOrThree(int startNumber, int endNumber){
		System.out.println("Divisible by 5 and 3, numbers in the range of " + startNumber+ " and " + endNumber+ " are:");
		for(int index = startNumber; index<=endNumber;index++){
			if((index%5)==0 && (index%3)==0)
				System.out.println(index);
		}
	}		
	
	//On user defined range print all numbers which are divisible by 7 or 13.
	void numbersDivisibleBySevenOrThirteen(int startNumber, int endNumber){
		System.out.println("Divisible by 7 and 13, numbers in the range of " + startNumber+ " and " + endNumber+ " are:");
		for(int index = startNumber; index<=endNumber;index++){
			if((index%7)==0)
				System.out.println(index + " is divisible by 7");
			else if((index%13)==0)
				System.out.println(index + " is divisible by 13");
		}
	}		
	
	//Find sum of all the numbers in user define range.
	void sumAllNumbers(int startNumber, int endNumber){
		int sum = 0;
		System.out.println("Sum of all numbers in the user define range of " + startNumber+ " and " + endNumber+ " are:");
		for(int index = startNumber; index<=endNumber; index++)
			sum += index;
		System.out.println("Sum is : "+sum);
	}
	
	//Find difference between sum of odd numbers and even numbers in a given range
	void diffOfSumOfOddEvenNumbers(int startNumber, int endNumber){
		int sumOfEvenNum = 0, sumOfOddNum = 0, diffOfSum=0;
		System.out.println("Difference between sum of odd and even numbers in the user define range of " + startNumber+ " and " + endNumber+ " are:");
		for(int index = startNumber; index<=endNumber; index++){
			if(index%2 ==0)
				sumOfEvenNum += index;
			else
				sumOfOddNum += index;
		}	
		diffOfSum = sumOfOddNum - sumOfEvenNum;
		System.out.println("Difference between sum of odd and even numbers is : " + diffOfSum);
	}
	
	//Print only odd numbers in reverse order.
	void printOddNumbersInReverseOrder(int startNumber, int endNumber){
		System.out.println("Odd numbers in reverse order in the range of " + startNumber+ " and " + endNumber+ " are:");
			for(int num = endNumber; num >= startNumber; num--){
				if((num%2) != 0)
					System.out.println(num);
			}
	}
	
	public static void main(String[] args){
		A5_ForLoopDemo operation = new A5_ForLoopDemo();
		operation.printEvenNumbers(10, 15);
		operation.numbersDivisibleByFive(10, 30);
		operation.numbersDivisibleByFiveOrThree(5, 18);
		operation.numbersDivisibleBySevenOrThirteen(5, 40);
		operation.sumAllNumbers(1, 5);
		operation.diffOfSumOfOddEvenNumbers(3, 9);
		operation.printOddNumbersInReverseOrder(10,20);
	}	
}		