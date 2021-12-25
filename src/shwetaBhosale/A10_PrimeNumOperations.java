package shwetaBhosale;

public class A10_PrimeNumOperations {

	int countOfPrime = 0, sumOfPrime = 0;
	float avgOfPrime = 0;

	void isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= (num / 2); i++) {
			if (num % i == 0)
				flag = false;
		}
		if (flag == true) {
			countOfPrime++;
			sumOfPrime = sumOfPrime + num;
			System.out.println(" " + num);
		}
	}

	void printPrimeNumbersForRange(int start, int end) {
		System.out.println(" Prime Numbers in range (" + start + "," + end + ") are : ");
		for (int i = start; i <= end; i++) {
			isPrime(i);
		}
	}

	void countPrimeNumbersForRange(int start, int end) {
		countOfPrime = 0;
		System.out.println(" Prime Numbers in range (" + start + "," + end + ") are : ");
		for (int i = start; i <= end; i++) {
			isPrime(i);
		}
		System.out.println();
		System.out.println(" Count of prime numbers in range (" + start + "," + end + ") is : " + countOfPrime);
	}

	void sumOfPrimeNumbersForRange(int start, int end) {
		sumOfPrime = 0;
		System.out.println(" Prime Numbers in range (" + start + "," + end + ") are : ");
		for (int i = start; i <= end; i++) {
			isPrime(i);
		}
		System.out.println();
		System.out.println(" Sum of Prime Numbers in range (" + start + "," + end + ") is : " + sumOfPrime);
	}

	void averageOfPrimeNumbersForRange(int start, int end) {
		countOfPrime = 0;
		sumOfPrime = 0;
		System.out.println(" Prime Numbers in range (" + start + "," + end + ") are : ");
		for (int i = start; i <= end; i++) {
			isPrime(i);
		}
		avgOfPrime = (sumOfPrime / countOfPrime);
		System.out.println();
		System.out.println(" Average of Prime Numbers in range (" + start + "," + end + ") is : " + avgOfPrime);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A10_PrimeNumOperations primeNumberOperations = new A10_PrimeNumOperations();
		System.out.println(" Print Number if it is prime : ");
		primeNumberOperations.isPrime(31);
		System.out.println();
		primeNumberOperations.printPrimeNumbersForRange(1, 10);
		System.out.println();
		primeNumberOperations.countPrimeNumbersForRange(11, 20);
		System.out.println();
		primeNumberOperations.sumOfPrimeNumbersForRange(21, 30);
		System.out.println();
		primeNumberOperations.averageOfPrimeNumbersForRange(31, 40);
	}
}
