/*Assignment - 10 : 23rd Dec'2021

Write a program with following methods.

1. create a method to find a given number is prime.
2. create a method to find out all prime numbers from given range.
3. create a method to find out how many prime numbers are there in given range.
4. create a method to find sum of all prime number in given range.
5. create a method to find average of all prime numbers in given range.*/

package deepak;

class A10_PrimeNumbers {
	int count;
	int sum;

	void verifyPrimeNumber(int num) {
		boolean prime = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				System.out.println(num+" is not a prime number");
				prime = false;
				break;
			}
		}
		if (prime == true) {
			System.out.println(num+" is a prime number");
		}
	}
	
	void printPrimeNumber(int num) {
		boolean prime = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				//System.out.println(num+" is not a prime number");
				prime = false;
				break;
			}
		}
		if (prime == true) {
			System.out.println(num+" is a prime number");
			count++;
			sum = sum + num;
		}
	}

	void primeNumbersInRange(int startNum, int endNum) {
		System.out.println("***************************************************************************");
		System.out.println("Number of prime numbers in the range: "+startNum+" to  "+endNum);
		for (int index = startNum; index <= endNum; index++) {
			printPrimeNumber(index);
		}
		System.out.println("***************************************************************************");
	}

	void primeNumbersCountInRange() {
		System.out.println("Number of prime numbers in the range: " +count);
		System.out.println("***************************************************************************");
	}

	void primeNumbersSumInRange() {
		System.out.println("Sum of prime numbers in the range: " +sum);
		System.out.println("***************************************************************************");
	}

	void primeNumbersAvgInRange() {
		double avg = (double) sum / count;
		System.out.println("Average of prime numbers in the range: " + avg);
		System.out.println("***************************************************************************");
	}

	public static void main(String[] args) {
		A10_PrimeNumbers primenumber = new A10_PrimeNumbers();
		primenumber.verifyPrimeNumber(132);
		primenumber.verifyPrimeNumber(97);
		primenumber.primeNumbersInRange(2, 20);
		primenumber.primeNumbersCountInRange();
		primenumber.primeNumbersSumInRange();
		primenumber.primeNumbersAvgInRange();
	}
}