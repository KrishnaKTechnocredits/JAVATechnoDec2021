package megha;

class Assignment5{
	
	void printEvenNumbers(int startNumber, int endNumber){
		System.out.println("Even Numbers are : ");
		for(int num = startNumber; num <= endNumber; num++){
			if(num % 2 == 0)
				System.out.println(num);
		}
	}
	
	void printNumDivisibleByFive(int startNumber, int endNumber){
		System.out.println("Divisible by 5, numbers are : ");
		for(int num = startNumber; num <= endNumber; num++){
			if(num % 5 == 0)
				System.out.println(num);
		}
	}
	
	void printNumDivisibleByFiveAndThree(int startNumber, int endNumber){
		System.out.println("Divisible by 3 and 5, numbers are : ");
		for(int num = startNumber; num <= endNumber; num++){
			if(num % 3 == 0 && num % 5 == 0)
				System.out.println(num);
		}
	}
	
	void printNumDivisibleBySevenOrThirteen(int startNumber, int endNumber){
		System.out.println("Divisible by 7 or 13, numbers are : ");
		for(int num = startNumber; num <= endNumber; num++){
			if(num % 7 == 0)
				System.out.println(num + " is divisible by 7");
			else if(num % 13 == 0)
				System.out.println(num + " is divisible by 13");
		}
	}
	
	void printSumOfAllNumbers(int startNumber, int endNumber){
		int sum = 0;
		for(int num = startNumber; num <= endNumber; num++)
			sum = sum + num;
		System.out.println("Sum is : " + sum);
	}
	
	void printDiffOfOddNumAndEvenNum(int startNumber, int endNumber){
		int esum = 0;
		int osum = 0;
		int diff = 0;
		for(int num = startNumber; num <= endNumber; num++){
			if(num % 2 == 0)
				esum = esum + num;
			else
				osum = osum + num;
		}
		diff = osum - esum;
		System.out.println("Difference between Sum of Odd and Even Numbers is : " + diff);
	}
	
	void printOddNumbersInReverse(int startNumber, int endNumber){
		System.out.println("Odd Numbers in reverse are : ");
		for(int num = startNumber; num >= endNumber; num--){
			if(num % 2 != 0)
				System.out.println(num);
		}
	}
	
	public static void main(String[] args){
		Assignment5 assignment5 = new Assignment5();
		assignment5.printEvenNumbers(10, 15);
		System.out.println();
		assignment5.printNumDivisibleByFive(10, 30);
		System.out.println();
		assignment5.printNumDivisibleByFiveAndThree(5, 18);
		System.out.println();
		assignment5.printNumDivisibleBySevenOrThirteen(5, 40);
		System.out.println();
		assignment5.printSumOfAllNumbers(1, 5);
		System.out.println();
		assignment5.printDiffOfOddNumAndEvenNum(3, 9);
		System.out.println();
		assignment5.printOddNumbersInReverse(20, 10);
		System.out.println();
	}
}