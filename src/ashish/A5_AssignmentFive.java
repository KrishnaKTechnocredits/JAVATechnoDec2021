package ashish;

class A5_AssignmentFive{
	
	void printEvenNumbersForRange(int startNumber, int endNumber){
		System.out.println(" Even numbers in range (" + startNumber + "," + endNumber + ") are below : ");
		for(int i = startNumber; i <= endNumber; i++){
			if(i % 2 == 0)	
				System.out.println(" " + i);
		}
	}
	
	void printDivisibleByFive(int startNumber, int endNumber){
		System.out.println(" Numbers divisible by 5 in range (" + startNumber + "," + endNumber + ") are below : ");
		for(int i = startNumber; i <= endNumber; i++){
			if(i % 5 == 0)	
				System.out.println(" " + i);
		}
	}
	
	void printDivisibleByThreeAndFive(int startNumber, int endNumber){
		System.out.println(" Numbers divisible by 3 and 5 in range (" + startNumber + "," + endNumber + ") are below : ");
		for(int i = startNumber; i <= endNumber; i++){
			if(i % 3 == 0 && i % 5 == 0)	
				System.out.println(" " + i);
		}
	}
	
	void printDivisibleBySevenOrThirteen(int startNumber, int endNumber){
		System.out.println(" Numbers divisible by 7 or 13 in range (" + startNumber + "," + endNumber + ") are below : ");
		for(int i = startNumber; i <= endNumber; i++){
			if(i % 7 == 0)
				System.out.println(" " + i  + " is divisible by 7");
			else if(i % 13 == 0)
				System.out.println(" " + i  + " is divisible by 13");
		}
	}
	
	void sumOfNumbersForRange(int startNumber, int endNumber){
		int sum = 0;
		for(int i = startNumber; i <= endNumber; i++)
			sum = sum + i;
		System.out.println(" Sum of numbers in range (" + startNumber + "," + endNumber + ") is : " + sum);	
	}
	
	void differenceBetweenSumOfOddEvenForRange(int startNumber, int endNumber){
		int sumOfOdd = 0, sumOfEven = 0;
		for(int i = startNumber; i <= endNumber; i++){
			if(i % 2 == 0)
				sumOfEven = sumOfEven + i;
			else	
				sumOfOdd = sumOfOdd + i;
		}
		System.out.println(" Difference between sum of even and odd numbers in range (" + startNumber + "," + endNumber + ") is : " + (sumOfOdd - sumOfEven));	
	}
	
	void printOddNumbersInReverseForRange(int startNumber, int endNumber){
		System.out.println(" Odd Numbers in reverse order in range (" + startNumber + "," + endNumber + ") is : ");	
		for(int i = endNumber; i >= startNumber; i--){
			if(i % 2 == 1)
				System.out.println(" " + i);				
		}		
	}
	
	public static void main(String[] args){
		A5_AssignmentFive assignmentFive = new A5_AssignmentFive();
		assignmentFive.printEvenNumbersForRange(10,15);
		System.out.println();				
		assignmentFive.printDivisibleByFive(10,30);
		System.out.println();
		assignmentFive.printDivisibleByThreeAndFive(5,18);
		System.out.println();
		assignmentFive.printDivisibleBySevenOrThirteen(5,40);
		System.out.println();
		assignmentFive.sumOfNumbersForRange(1,5);
		System.out.println();
		assignmentFive.differenceBetweenSumOfOddEvenForRange(3,9);
		System.out.println();
		assignmentFive.printOddNumbersInReverseForRange(10,20);
	}
}