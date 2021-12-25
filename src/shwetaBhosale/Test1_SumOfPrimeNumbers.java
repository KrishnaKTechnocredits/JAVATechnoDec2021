package shwetaBhosale;

public class Test1_SumOfPrimeNumbers {

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

	void sumOfPrimeNumbersForRange(int start, int end) {
		sumOfPrime = 0;
		System.out.println(" Prime Numbers in range (" + start + "," + end + ") are : ");
		for (int i = start; i <= end; i++) {
			isPrime(i);
		}
		System.out.println();
		System.out.println(" Sum of Prime Numbers in range (" + start + "," + end + ") is : " + sumOfPrime);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1_SumOfPrimeNumbers test1_SumOfPrimeNumbers = new Test1_SumOfPrimeNumbers();
		test1_SumOfPrimeNumbers.sumOfPrimeNumbersForRange(10, 30);
		System.out.println();
	}
}
