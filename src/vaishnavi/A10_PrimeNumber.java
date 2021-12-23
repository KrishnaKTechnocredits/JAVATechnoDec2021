package vaishnavi;

public class A10_PrimeNumber {
	int sum =0;
	int count=0;

	void isPrimeNumber(int num) {
		boolean flag = true;
		for(int index = 2;index<=num/2;index++) {
			if(num%index==0) {
				//System.out.println(num+" is not a prime number.");
			flag = false;
			break;
			}
		}
			if(flag == true) {
				
				count++;
				sum=sum+num;
				
			System.out.println(num +" is a prime number");
			}
	}
	void findPrimeNumbersInRange(int firstNumber, int lastNumber) {
		System.out.println("All prime numbers in range 20 - 100 is: ");
		for(int startNumber =firstNumber;startNumber <= lastNumber;startNumber++) {
			isPrimeNumber(startNumber);
		}
	}
	void totalPrimeNumbersCountInRange(int firstNumber, int lastNumber) {
		for(int startNumber =firstNumber;startNumber <= lastNumber;startNumber++) {
			isPrimeNumber(startNumber);
			break;
		}
		System.out.println("Count of all prime numbers is " +count);
	}
	void displaySumOfAllPrimeNumbersInRange(int startNum, int endNum) {
		for(int index =startNum;index <= endNum;index++) {
			isPrimeNumber(startNum);
			
		}
		System.out.println("Sum of all prime number is "+sum);
	}
	
	void averageOfAllPrimeNumbersInRange() {
		int average = sum/count;
		System.out.println("Average of all prime numbers is "+average);
	}
	public static void main(String[] args) {
		A10_PrimeNumber a10_PrimeNumber=new A10_PrimeNumber();
		a10_PrimeNumber.isPrimeNumber(43);
		System.out.println();
		a10_PrimeNumber.findPrimeNumbersInRange(20, 100);
		System.out.println();
		a10_PrimeNumber.totalPrimeNumbersCountInRange(20,100);
		System.out.println();
		a10_PrimeNumber.displaySumOfAllPrimeNumbersInRange(20,100);
		System.out.println();
		a10_PrimeNumber.averageOfAllPrimeNumbersInRange();
	}

}
