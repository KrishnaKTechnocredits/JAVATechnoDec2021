package vishwas;

class A5_Assignment5{
	
	void printEvenNumbers(int startNumber, int endNumber){
		System.out.println("Even numbers are: ");
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 2 == 0)
				System.out.println(num);
		}
	}
    
	void printDivisibleNumbers(int startNumber, int endNumber){
		System.out.println("-------------------------------- ");
		System.out.println("Divisible by 5, numbers are: ");
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 5 == 0)
				System.out.println(num);
		}
		
	}
	
	void printDivisibleBy(int startNumber, int endNumber){
		System.out.println("-------------------------------- ");
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 3 == 0 && num % 5 == 0)
				System.out.println(num);
		}
	}
	
	void printDivisibleByNumbers(int startNumber, int endNumber){
		System.out.println("-------------------------------- ");
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 7 == 0 || num % 13== 0){
				if(num % 7 == 0)
				System.out.println(num + " is divisible by 7");
				else
				System.out.println(num + " is divisible by 13");
			}
		}
	}
	
	void sumNumber(int startNumber, int endNumber){
		System.out.println("-------------------------------- ");
		System.out.println("Sum of all the numbers in defined range:");
		int sum = 0;
		for(int num = startNumber; num<=endNumber; num++){
			sum = sum+num;
		}
		System.out.println(sum);
	}
	
	void sumDifferenceNumber(int startNumber, int endNumber){
		System.out.println("-------------------------------- ");
		System.out.println("difference between sum of odd numbers and even numbers in a given range :");
		int sum1 = 0;
		int sum2 = 0;
		for(int num = startNumber; num<=endNumber; num++){
			if(num % 2 == 0)
				sum1 = sum1 + num;
			else
				sum2 = sum2 + num;
		}
		System.out.println(sum2 - sum1);
	}
	
	void oddReverseNumbers(int startNumber, int endNumber){
		System.out.println("-------------------------------- ");
		System.out.println("Odd numbers in reverse order :");
		for(int num = endNumber; num>=startNumber; num--){
			if(num % 2 != 0)
				System.out.println(num);
		}
	}
					  
	public static void main (String[]args){
		A5_Assignment5 assignment5 = new A5_Assignment5();
		assignment5.printEvenNumbers(10,15);
		assignment5.printDivisibleNumbers(10,30);
		assignment5.printDivisibleBy(5,18);
		assignment5.printDivisibleByNumbers(5,40);
		assignment5.sumNumber(1,5);
		assignment5.sumDifferenceNumber(3,9);
		assignment5.oddReverseNumbers(10,20);	
	}					  
}