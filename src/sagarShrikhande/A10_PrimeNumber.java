package sagarShrikhande;

public class A10_PrimeNumber {
	int sum=0;
	int count=0;

	void isPrimeNumberLogic(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + " is prime number");
			sum = sum + num;
			count++;
			
		}
		
		
	}

	void isPrimeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				System.out.println(num + " is not prime number");
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + " is prime Number");
		}
		System.out.println("####################################################################");
	}

	void primeNumbersInRange(int startNum, int endNum) {
		System.out.println("Prime Numbers in Given range are:");
		for (int index = startNum; index <= endNum; index++) {
			isPrimeNumberLogic(index);

		}
		System.out.println("####################################################################");
	}

	void sumOfPrimNumInRange(int startNum, int endNum) {
		sum=0;
		for (int index = startNum; index <= endNum; index++)
			isPrimeNumberLogic(index);
		System.out.println("Sum of prime numbers in given range " + startNum + " To " + endNum + " is: " + sum);
		System.out.println("####################################################################");
	}

	void countOfPrimeNumInRange(int startNum, int endNum) {
		count=0;
		for (int index = startNum; index <= endNum; index++)
			isPrimeNumberLogic(index);
		System.out.println("Count of prime numbers in given range " + startNum + " To " + endNum + " is: " + count);
		System.out.println("####################################################################");
	}
	
	void averageOfPrimeNumInRange(int startNum, int endNum) {
		sum=0;
		count=0;
		for (int index = startNum; index <= endNum; index++)
			isPrimeNumberLogic(index);
		System.out.println("Average of prime numbers in given range " + startNum + " To " + endNum + " is: " + sum/count);
		System.out.println("####################################################################");
	}

	public static void main(String[] a) {
		A10_PrimeNumber primeNumber = new A10_PrimeNumber();
		primeNumber.isPrimeNumber(57);
		primeNumber.isPrimeNumber(37);
		primeNumber.primeNumbersInRange(1, 10);
		primeNumber.sumOfPrimNumInRange(11, 20);
		primeNumber.countOfPrimeNumInRange(21, 30);
		primeNumber.averageOfPrimeNumInRange(31, 40);
	}

}
