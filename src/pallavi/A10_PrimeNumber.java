/*Assignment - 10 : 23rd Dec'2021

Write a program with following methods.

1. create a method to find a given number is prime.
2. create a method to find out all prime numbers from given range.
3. create a method to find out how many prime numbers are there in given range.
4. create a method to find sum of all prime number in given range.
5. create a method to find average of all prime numbers in given range.
*/

package pallavi;

class A10_PrimeNumber {
	int count = 0;
	int sum = 0;

	void findPrimeNumber(int num) {

		boolean isPrime = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println(num + " is a prime number");
			count++;
			sum = sum + num;
		}
	}

	void findNumberPrimeOrNot(int num) {
		boolean isPrime = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				isPrime = false;
				System.out.println(num + " is not a prime number");
				break;

			}
		}
		if (isPrime == true) {
			System.out.println(num + " is a prime number");
		}
	}

	void findPrimeNumberInRange(int startNum, int endNum) {
		System.out.println("Prime numbers in range " + startNum + " to " + endNum + " are : ");
		for (int index = startNum; index <= endNum; index++) {
			findPrimeNumber(index);
		}
	}

	void findCountOfPrimeNumberInRange(int startNum, int endNum) {
		count=0;
		for (int index = startNum; index <= endNum; index++) {
			findPrimeNumber(index);
		}
		System.out.println("Count of all prime numbers in the range " + startNum + " to " + endNum + " = " + count);
	}

	void findSumOfPrimeNumberInRange(int startNum, int endNum) {
		sum=0;
		for (int index = startNum; index <= endNum; index++) {
			findPrimeNumber(index);
		}
		System.out.println("Sum of all prime numbers in the range " + startNum + " to " + endNum + " = " + sum);
	}

	void findAvgOfPrimeNumberInRange(int startNum, int endNum) {
		sum=0;
		count=0;
		for (int index = startNum; index <= endNum; index++) {
			findPrimeNumber(index);
		}
		System.out.println(
				"Average of all prime numbers in the range " + startNum + " to " + endNum + " = " + (sum / count));
	}

	public static void main(String[] arr) {
		A10_PrimeNumber primeNumber1 = new A10_PrimeNumber();
		primeNumber1.findNumberPrimeOrNot(47);
		primeNumber1.findNumberPrimeOrNot(33);
		System.out.println();
		primeNumber1.findPrimeNumberInRange(10, 50);
		System.out.println();
		primeNumber1.findCountOfPrimeNumberInRange(10, 30);
		System.out.println();
		primeNumber1.findSumOfPrimeNumberInRange(10, 30);
		System.out.println();
		primeNumber1.findAvgOfPrimeNumberInRange(10, 30);
		System.out.println();
		primeNumber1.findCountOfPrimeNumberInRange(1, 3);
		System.out.println();
		primeNumber1.findSumOfPrimeNumberInRange(1, 3);
		System.out.println();
		primeNumber1.findAvgOfPrimeNumberInRange(1, 3);
		

	}

}