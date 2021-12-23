package naquibalam;

class A5_Assignment{
	
	void printEvenNumbers(int startNumber, int endNumber){
		System.out.println("Even numbers are:");
		for(int num = startNumber; num <= endNumber; num++){
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
    }
	
	void printDivisionCheck(int startNumber, int endNumber){
		System.out.println("Divisible by 5, numbers are:");
		for(int num = startNumber; num <= endNumber; num++){
			if (num % 5 == 0) {
				System.out.println(num);
			}
		}
    }

	void printDivisionTwo(int startNumber, int endNumber){
		System.out.println("Divisible by 5 & 3, numbers are:");
		for(int num = startNumber; num <= endNumber; num++){
			if ((num % 5 == 0) && (num % 3 == 0)) {
				System.out.println(num);
			}
		}
    }
	
	void printDivisionTwoOr(int startNumber, int endNumber){
		System.out.println("Divisible by 7 or  13, numbers are : ");
		for(int num = startNumber; num <= endNumber; num++){
			if (num % 7 == 0)  {
				System.out.println(num + " is divisible by 7");
			}
			if (num % 13 == 0)  {
				System.out.println(num + " is divisible by 13");
			}
		}
    }
	
	void printAddition(int startNumber, int endNumber){
		int ans = 0;
		for(int num = startNumber; num <= endNumber; num++){
			ans = ans + num;
		}
		System.out.println("Sum of number between range " + startNumber + " and " + endNumber + " is : " + ans);
    }
	
	void printOddEvenSum(int startNumber, int endNumber){
		int evenSum = 0;
		int oddSum = 0;
		for(int num = startNumber; num <= endNumber; num++){
			if (num % 2 != 0) {
				oddSum = oddSum + num;
			} else {
				evenSum = evenSum + num;
			}
		}
		System.out.println("Difference between sum of Odd and Even numbers between range " + startNumber + " and " + endNumber + " is : " + (oddSum - evenSum));
    }
	
	void oddReverse(int startNumber, int endNumber){
		System.out.println("Odd numbers in Reverse order between range " + startNumber + " and " + endNumber + " are : ");
		for(int num = endNumber; num >= startNumber; num--){
			if (num % 2 != 0) {
				System.out.println(num);
			}
		}
    }
	
	public static void main (String[] args) {
		A5_Assignment assignment = new A5_Assignment();
		System.out.println("-------------------------------------------------------------------------");
		assignment.printEvenNumbers(10,15);
		System.out.println("-------------------------------------------------------------------------");
		assignment.printDivisionCheck(10,30);
		System.out.println("-------------------------------------------------------------------------");
		assignment.printDivisionTwo(5,18);
		System.out.println("-------------------------------------------------------------------------");
		assignment.printDivisionTwoOr(5,40);
		System.out.println("-------------------------------------------------------------------------");
		assignment.printAddition(1,5);
		System.out.println("-------------------------------------------------------------------------");
		assignment.printOddEvenSum(3,9);
		System.out.println("-------------------------------------------------------------------------");
		assignment.oddReverse(10,20);
	}
}