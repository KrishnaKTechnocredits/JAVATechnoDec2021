/*Assignment - 5: 16th Dec2021
Write only one program having the following methods. [7 methods in same program] 

1. print all even numbers in a given range. 
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
		 10
		 12
		 14	
Hint : void printEvenNumbers(int startNumber, int endNumber){
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
package deepak;

class Numbers{
	
	void evenNumbers(int startNumber, int endNumber){
		System.out.print("Even Numbers in the given range: ");
		for(int index = startNumber ; index <= endNumber ; index++){
			if(index % 2 == 0){
				System.out.print(index+" ");
			}
		}
		System.out.println();
	}
	
	void divisibleBy5(int startNumber, int endNumber){
		System.out.print("Numbers divisible by 5 in the given range: ");
		for(int index = startNumber ; index <= endNumber ; index++){
			if(index % 5 ==0)
				System.out.print(index+" ");
		}
		System.out.println();
	}
	
	void divisibleBy5AND3(int startNumber, int endNumber){
		System.out.print("Numbers divisible by 3 and 5 in the given range: ");
		for(int index = startNumber ; index <= endNumber ; index++){
			if(index % 5 == 0 && index % 3 == 0)
				System.out.print(index+" ");
		}
		System.out.println();
	}
	
	void divisibleBy7OR13(int startNumber, int endNumber){
		System.out.println("Numbers divisible by 7 or 13 in the given range: ");
		for(int index = startNumber ; index <= endNumber ; index++){
			if(index % 7 == 0)
				System.out.println(index+" is divisible by 7");
			else if(index % 13 == 0)
				System.out.println(index+" is divisible by 13");
		}
	}
	
	void sumOfNumbers(int startNumber, int endNumber){
		int sum = 0;
		for(int index = startNumber ;  index <=endNumber ; index++ ){
			sum = sum+index;
		}
		System.out.print("Sum of the numbers in the given range is: "+sum);
		System.out.println();
	}
	
	void differenceOddEvenSum(int startNumber, int endNumber){
		int evenSum = 0;
		int oddSum = 0;
		int difference = 0;
		for(int index  = startNumber ; index <= endNumber ; index++ ){
			if(index % 2 == 0)
				evenSum = evenSum + index;
			else	
				oddSum = oddSum + index;
		}
		System.out.println("Difference between the sum of odd and even numbers in the given range is: "+(oddSum - evenSum));
	}
	
	void oddNumbersReverse(int startNumber, int endNumber){
		System.out.print("Odd Numbers in the given range and in reverse order: ");
		for(int index = endNumber ; index >=startNumber ; index-- ){
			if(index % 2 != 0)
				System.out.print(index+" ");
		}
		System.out.println();
	}
	
	void divisibilityCheck(int startNum, int endNum, int num){
		System.out.print("Numbers divisible by "+num+" in the given range is: ");
		for(int index = startNum ; index <= endNum ; index++){
			if(index % 3 == 0)
				System.out.print(index+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] a){
		Numbers numbers = new Numbers();
		numbers.evenNumbers(10, 15);
		numbers.divisibleBy5(10, 30);
		numbers.divisibleBy5AND3(5, 18);
		numbers.divisibleBy7OR13(5, 40);
		numbers.sumOfNumbers(1, 5);
		numbers.differenceOddEvenSum(3, 9);
		numbers.oddNumbersReverse(10 , 20);
		numbers.divisibilityCheck(1, 10, 3);
	}
}