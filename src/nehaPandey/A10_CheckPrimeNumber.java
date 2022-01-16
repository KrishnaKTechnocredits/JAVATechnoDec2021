package nehaPandey;

public class A10_CheckPrimeNumber {
	int count = 0;
	int sum = 0;

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

	void logigForSum(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			sum = sum + num;
			count++;
		}

	}

	void checkPrimeNumberInRange(int start, int end) {
		for (int range = start; range <= end; range++) {
			isPrimeNumberLogic(range);

		}
		System.out.println();
	}

	void totalCountOfPrimeNumbers(int start, int end) {

		for (int range = start; range <= end; range++) {
			logigForSum(range);
		}
		System.out.println("Total count of prime numbers between given range: " + count);
		System.out.println();

	}

	void sumOfPrimeNumbers(int start, int end) {

		for (int range = start; range <= end; range++) {
			logigForSum(range);
		}
		System.out.println("Sum of prime numbers in range: " + sum);
		System.out.println();

	}

	void avgOfPrimeNumbers(int start, int end) {
		sum = 0;
		count = 0;
		for (int range = start; range <= end; range++) {
			logigForSum(range);
		}
		double avg = sum / count;

		System.out.println("Average of prime numbers: " + avg);

	}

	public static void main(String[] args) {
		A10_CheckPrimeNumber pn = new A10_CheckPrimeNumber();

		pn.isPrimeNumberLogic(19);
		pn.checkPrimeNumberInRange(100, 200);
		pn.totalCountOfPrimeNumbers(100, 300);
		pn.sumOfPrimeNumbers(100, 300);
		pn.avgOfPrimeNumbers(100, 250);

	}
}
