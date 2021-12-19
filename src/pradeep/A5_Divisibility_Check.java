package pradeep;

class A5_Divisibility_Check{
	void printEvenNumbers(int startNumber, int endNumber){
		for(int num = startNumber; num<=endNumber; num++){
			if(num%2 == 0)
				System.out.println(num);
		}		
	}
	
	void printDivisibleBy5(int startNumber, int endNumber){
		for(int num = startNumber; num<=endNumber; num++){
			if(num%5 == 0)
				System.out.println(num);
		}		
	}
	
	void printDivisibleBy5and3(int startNumber, int endNumber){
		for(int num = startNumber; num<=endNumber; num++){
			if(num%5 == 0 && num%3 == 0)
				System.out.println(num);
		}		
	}
	
	void printDivisibleBy7Or13(int startNumber, int endNumber){
		for(int num = startNumber; num<=endNumber; num++){
			if(num%7 == 0)
				System.out.println(num + "is divisible by 7");
			if(num%13 == 0)
				System.out.println(num + "is divisible by 13");
		}		
	}
	
	void sumOfNumbers(int startNumber, int endNumber){
		int sum = 0;
		for(int num = startNumber; num<=endNumber; num++){
			sum = num + sum;
		}
		System.out.println("sum is " + sum);
	}
	
	void diffBetweenSumOfOddEvenNumber(int startNumber, int endNumber){
		int evenSum = 0;
		int oddSum = 0;
		for(int num = startNumber; num<=endNumber; num++){
			if(num%2 == 0)
				evenSum = num + evenSum;
			else
				oddSum = num + oddSum;
		}
		int diff = oddSum - evenSum;
		System.out.println("Difference Between Sum of ODD and EVEN number is " + diff);
	}
	
	void printOddNumbers(int startNumber, int endNumber){
		for(int num = endNumber; num>=startNumber; num--){
			if(num%2 == 1)
				System.out.println(num);			
		}
	}	
	
	public static void main(String[] args){
		A5_Divisibility_Check assignment5 = new A5_Divisibility_Check();
		System.out.println("Even Numbers are:");
		assignment5.printEvenNumbers(10,15);
		System.out.println("Divisible by 5 numbers are:");
		assignment5.printDivisibleBy5(10,30);
		System.out.println("Divisible by 5 & 3, numbers are:");
		assignment5.printDivisibleBy5and3(5,18);
		System.out.println("Divisible by 7 or 13, numbers are:");
		assignment5.printDivisibleBy7Or13(5,40);
		assignment5.sumOfNumbers(1,5);
		assignment5.diffBetweenSumOfOddEvenNumber(3,9);
		System.out.println("Odd numbers in reverse order are:");
		assignment5.printOddNumbers(10,20);
	}
}