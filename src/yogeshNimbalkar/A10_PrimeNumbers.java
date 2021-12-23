package yogeshNimbalkar;
//Assignment - 10 : 23 Dec 2021

public class A10_PrimeNumbers {
	
	int countOfPrimeNumber, sum;
	void isPrimeNumber(int num) {
		boolean flag = true;
		if(num>=0) {
			if(num == 0 || num == 1)
				System.out.println(num + " is not a prime number");
			else {
				for(int index=2; index<=(num/2); index++)
					if(num%index == 0) {
						flag = false;
						break;
					}
				if(flag == true) {
					countOfPrimeNumber++;
					sum = sum + num;
					System.out.println(num + " is prime number");
				}
			}			
		}
		else 
			System.out.println("Please enter a positive number");
	}
	
	void findPrimeNumInRange(int startNum, int endNum) {
		for(int index=startNum; index<=endNum; index++)
			isPrimeNumber(index);
	}
	
	void displayCountOfPrimeNumber(int startNum, int endNum) {
		countOfPrimeNumber=0;
		findPrimeNumInRange(startNum, endNum);
		System.out.println(countOfPrimeNumber + " prime numbers are present in " + startNum + " to " + endNum + " range");
	}
	
	void sumOfPrimeNumInRange(int startNum, int endNum) {
		sum = 0;
		findPrimeNumInRange(startNum, endNum);
		System.out.println("Sum of prime numbers in range " + startNum + " to " + endNum + " is : " + sum);
	}
	
	void avgOfPrimeNumInRange(int startNum, int endNum) {
		sum = 0;
		countOfPrimeNumber = 0;
		double avg;
		findPrimeNumInRange(startNum, endNum);
		avg = (double) sum / countOfPrimeNumber;
		System.out.println("Average of prime numbers in range " + startNum + " to " + endNum + " is : " + avg );
	}
	
	public static void main(String[] args) {
		A10_PrimeNumbers chkPrimeNumbers = new A10_PrimeNumbers();
		chkPrimeNumbers.isPrimeNumber(3);
		System.out.println();
		chkPrimeNumbers.findPrimeNumInRange(100, 120);
		System.out.println();
		chkPrimeNumbers.displayCountOfPrimeNumber(100, 120);
		System.out.println();
		chkPrimeNumbers.sumOfPrimeNumInRange(100,120);
		System.out.println();
		chkPrimeNumbers.avgOfPrimeNumInRange(100,120);
	}
}
