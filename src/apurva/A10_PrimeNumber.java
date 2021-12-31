package apurva;

public class A10_PrimeNumber {

	double sum = 0;
	int count = 0;

	void displayPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				// System.out.println(num + " is not a prime num");
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(num + " is a prime number");
			count++;
			sum = sum + num;
		}

	}

	void displayRange(int startIndex, int endIndex) {
		System.out.println("Prime Numbers in given range is: ");
		for (int index = startIndex; index < endIndex; index++)
			displayPrime(index);

	}

	void displayTotalCountofPrimeNumbers(int startIndex, int endIndex) {
		count = 0;
		for (int index = startIndex; index < endIndex; index++) {
			displayPrime(index);
		}
		System.out.println("Total count of prime numbers in given range is : " + count);
	}

	void sumofPrimeNumbers(int startIndex, int endIndex) {
		sum = 0;
		for (int index = startIndex; index < endIndex; index++) {
			displayPrime(index);
		}
		System.out.println("Sum of prime numbers in given range is : " + sum);
	}

	void averageofPrimeNumbers(int startIndex, int endIndex) {
		sum = 0;
		count = 0;
		for (int index = startIndex; index < endIndex; index++) {
			displayPrime(index);
		}
		System.out.println("Average of prime numbers in given range is : " + (sum / count));
	}

	public static void main(String[] a) {
		A10_PrimeNumber prime = new A10_PrimeNumber();
		prime.displayPrime(19);
		System.out.println("----------------------------------------");
		prime.displayRange(40, 45);
		System.out.println("----------------------------------------");
		prime.displayTotalCountofPrimeNumbers(10, 20);
		System.out.println("----------------------------------------");
		prime.sumofPrimeNumbers(21, 30);
		System.out.println("----------------------------------------");
		prime.averageofPrimeNumbers(1,10);
	}

}
