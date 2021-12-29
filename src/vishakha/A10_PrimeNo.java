package vishakha;

public class A10_PrimeNo {

	int count;
	int sum = 0;

	void isPrimeNumber(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}

		if (flag == true) {
			System.out.println(num + "is prime number");
			sum = sum + num;
			count++;

		}

	}

	void primeNumberInRange(int firstnum, int lastnum) {
		for (int startnum = firstnum; startnum <= lastnum; startnum++) {
			isPrimeNumber(startnum);

		}
	}

	void totalPrimeNumber() {
		System.out.println("\nTotal prime numbers are: " + count);
	}

	void sumOfPrimeNumber() {
		System.out.println("Sum of prime numbers: " + sum);
	}

	void avgOfPrimeNumber() {
		int avg = sum / count;
		System.out.println("Average of prime numbers: " + avg);

	}

	public static void main(String[] args) {
		A10_PrimeNo primeNumber = new A10_PrimeNo();
		primeNumber.isPrimeNumber(17);
		System.out.println("-------------");
		primeNumber.primeNumberInRange(50, 100);
		primeNumber.totalPrimeNumber();
		primeNumber.sumOfPrimeNumber();
		primeNumber.avgOfPrimeNumber();

	}

}
