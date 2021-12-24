package samir;

public class A5_Assignment5{
	
	void printEvenNumbers(int startIndex, int endIndex){ 
		System.out.println("All even numbers are : ");
		for(int num = startIndex; num<=endIndex; num++){
			if(num % 2 == 0)
				System.out.println(num);
          
        }
		
	}
	
	void printDivisibleByFive(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 5 are : ");
		for(int num = startIndex; num<=endIndex; num++){
			if(num % 5 == 0)
				System.out.println(num);
		}
	}

	void printDivisibleByFiveAndThree(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 5 and 3 are : ");
		for(int num = startIndex; num<=endIndex; num++){
			if(num % 5 == 0 && num % 3 == 0)
				System.out.println(num);
		}
	}
	
	void printDivisibleBySevenOrThirteen(int startIndex, int endIndex){
		System.out.println("Numbers divisible by 7 or 13 are : ");
		for(int num = startIndex; num<=endIndex; num++){
			if(num % 7 == 0 )
				System.out.println("Numbers divisible by 7 are : " +num);
			else if(num % 13 == 0)
				System.out.println("Number divisible by 13 are : " +num);
		}
	}
	
	void printSumOfAllNumbers(int startNumber, int endNumber){
		int sum=0;
		for(int num = startNumber; num <=endNumber; num++){
			sum = sum + sum;
				System.out.println("Sum of all numbers is " +sum);
		}
	}
	
	void printSumOfAllOddNumbersAndEvenNumbers(int startNumber, int endNumber){
		int evenNumSum = 0;
		int oddNumSum = 0;
		int difference = 0;
		for(int num = startNumber; num <=endNumber; num++){
			if(num % 2 == 0)
				evenNumSum = evenNumSum + num;
			else 
				oddNumSum = oddNumSum + num;
		}
				difference = oddNumSum - evenNumSum;
				System.out.println("Difference between sum of all even and odd numbers is " +difference);

	}
	
	void printOddNumberReverseOrder(int startNumber, int endNumber){
		System.out.println("Odd Numbers in reverse order are : ");
		for(int num = startNumber; num <=endNumber; num++){
			if(num % 2 != 0)
				System.out.println(num);
		}
	}
	
	public static void main(String[] args){
		
		A5_Assignment5 assignment5 = new A5_Assignment5();
		assignment5.printEvenNumbers(10, 15);
		System.out.println();
		assignment5.printDivisibleByFive(10, 30);
		System.out.println();
		assignment5.printDivisibleByFiveAndThree(5, 18);
		System.out.println();
		assignment5.printDivisibleBySevenOrThirteen(5, 40);
		System.out.println();
		assignment5.printSumOfAllOddNumbersAndEvenNumbers(1, 5);
		System.out.println();
		assignment5.printOddNumberReverseOrder(3, 9);
		System.out.println();
		assignment5.printEvenNumbers(21, 10);
		System.out.println();
		
	}
}
		
