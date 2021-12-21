/*Assignment 5- 16Dec21
 * 1. print all even numbers in a given range. 
  2. On user defined range print all numbers which are divisible by 5. 
  3. On user defined range print all numbers which are divisible by 5 and divisible by 3. 
  4. On user defined range print all numbers which are divisible by 7 or 13. 
  5. Find sum of all the numbers in user define range.class
  6. Find difference between sum of odd numbers and even numbers in a given range
  7. Print only odd numbers in reverse order.
  
*/

package pallavi;

class A5_ForLoop{
	
	void printEvenNumbers(int startNumber, int endNumber){
		System.out.println("1--> Even numbers between " +startNumber+ "and " +endNumber+ " are:");
		for(int num = startNumber; num<=endNumber; num++){
		    if(num%2==0)
				System.out.println(num);
		}
    }
	
	void printNumbersDivisibleByFive(int startNumber, int endNumber){
		System.out.println("2--> Divisible by 5, numbers between " +startNumber+ "and " +endNumber+ " are:");
		for(int num =startNumber; num<=endNumber; num++){
			if(num%5==0)
				System.out.println(num);
		}
    }
	
	void printNumbersDivisibleBy5And3(int startNumber, int endNumber){
		System.out.println("3--> Divisible by 5 and 3, numbers between " +startNumber+ "and " +endNumber+ " are:");
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 5==0 && num % 3==0)
				System.out.println(num);
		}
    }
		
	void printNumbersDivisibleBy7Or13(int startNumber, int endNumber){
		System.out.println("4--> Divisible by 7 or 13, numbers between " +startNumber+ "and " +endNumber+ " are:");
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 7==0 )
				System.out.println(num+ " is divisible by 7");
			else if(num % 13==0 )
				System.out.println(num+ " is divisible by 13");
		}
    }
	
	void printSumOfNumbers(int startNumber, int endNumber){
		int sum=0;
		for(int num = startNumber; num<=endNumber; num++){
			sum=sum+num;
		}
		System.out.println("5--> Sum of numbers between " +startNumber+ " and " +endNumber+ " is: " +sum);
	}
	
	void printDiffBtwOddEven(int startNumber, int endNumber){
		int sumEven=0,sumOdd=0;
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 2==0)
				sumEven=sumEven+num;
			else
				sumOdd=sumOdd+num;
		}
		System.out.println("6--> Difference between sum of odd numbers and even numbers in a given range " +startNumber+ " to " +endNumber+ " is: "+ (sumOdd-sumEven));
	}
	
	void printReverseOdd(int startNumber, int endNumber){
		System.out.println("7--> Odd numbers in reverse order between " +startNumber+ "and " +endNumber+ " are:");
		for(int num = endNumber; num<=startNumber; num--){
			if(num % 2!=0)
				System.out.println(num);
		}
	}
	
	public static void main(String[] arr){
		A5_ForLoop forLoop=new A5_ForLoop();
		forLoop.printEvenNumbers(10,15);
		forLoop.printNumbersDivisibleByFive(10,30);
		forLoop.printNumbersDivisibleBy5And3(5,18);
		forLoop.printNumbersDivisibleBy7Or13(5,40);
		forLoop.printSumOfNumbers(1,5);
		forLoop.printDiffBtwOddEven(3,9);
		forLoop.printReverseOdd(10,20);
	}

}