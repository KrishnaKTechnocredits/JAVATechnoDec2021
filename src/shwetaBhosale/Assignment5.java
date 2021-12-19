package shwetaBhosale;

class Assignment5{
	
	void printEvenNumbers(int startNumber, int endNumber){
	    System.out.println("Even numbers are: ");
		for(int num = startNumber; num <= endNumber; num ++){
			if(num % 2 == 0)
				System.out.println(" " + num);
        }
	}
	
	void divNumbers(int startNumber, int endNumber){
		System.out.println("Divisible by 5, numbers are: ");
		for(int num = startNumber; num <= endNumber; num++){
			if (num % 5 == 0)
				System.out.println(" " + num);
		}
	}
	
	void divByFiveAndThree(int startNumber, int endNumber){
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for (int num = startNumber; num <= endNumber; num++){
			if (num % 5 == 0 && num %3 == 0)
				System.out.println(" " + num);
		}
	}
		
	void divBySevenAndThireteen(int startNumber, int endNumber){
		System.out.println("Divisible by 7 or 13 are: ");
		for (int num = startNumber; num <= endNumber; num++){
			if (num % 7 == 0 || num %13 == 0)
				System.out.println("7 is divisible by: " + num);
		}
	}
	
	void sumNumber (int startNumber, int endNumber){
		System.out.println("Sum of all numbers in given range is: ");
		int sum = 0;
			for (int num = startNumber; num <= endNumber; num++){
				sum = sum + num;	
		}
				System.out.println(" " + sum);
	}
	
	void differenceSumAndOdd (int startNumber, int endNumber){
		int even= 0;
		int odd = 0;
		int sum = 0;
			System.out.println("Difference between sum of odd numbers and even numbers: ");
			for (int num = startNumber; num <= endNumber; num++){
				if (num%2 == 0)
					even = even + num;
				else
					odd = odd + num;
			}
			sum = odd - even;
			System.out.println("  " + sum);
	}
		
	void OddRevers (int startNumber, int endNumber){
		System.out.println("odd numbers in reverse order: ");
		for (int num = endNumber; num >= startNumber; num--){
			if (num%2 != 0)
			System.out.println(" " + num);
			}
	}
	
	public static void main(String[] a){
		Assignment5 assignment5 = new Assignment5();
		assignment5.printEvenNumbers(10,15);
		System.out.println("----------------------------------------------");
		assignment5.divNumbers(10,30);
		System.out.println("----------------------------------------------");
		assignment5.divByFiveAndThree(5,18);
		System.out.println("----------------------------------------------");
		assignment5.divBySevenAndThireteen(5,40);
		System.out.println("----------------------------------------------");
		assignment5.sumNumber(1,5);
		System.out.println("----------------------------------------------");
		assignment5.differenceSumAndOdd(3,9);
		System.out.println("----------------------------------------------");
		assignment5.OddRevers(10,20);
	}
}	