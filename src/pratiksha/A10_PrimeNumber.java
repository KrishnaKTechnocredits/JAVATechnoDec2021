package pratiksha;

public class A10_PrimeNumber {

	
	int primeOccurance;
	int sum;
	
	void findPrimeNumber(int input, boolean print) {
		boolean flag = true;
		for (int i=2; i <= input/2; i++) {
			if (input%i==0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			if (print == true) {
				System.out.println("Given input number - " + input + " is a Prime number");
			}
			primeOccurance++;
			sum = sum + input;
		}
	}
	
	void isPrimeNumberSingleCheck(int input) {
		boolean flag = true;
		for (int i=2; i <= input/2; i++) {
			if (input%i==0) {
				flag = false;
				System.out.println("Given input number - " + input + " is NOT a Prime number");
				break;
			}
		}
		if (flag == true) {
			System.out.println("Given input number - " + input + " is a Prime number");
			primeOccurance++;
			sum = sum + input;
		}
	}
	
	void primeRange(int startNumber, int endNumber) {
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Prime Numbers in range [" + startNumber + ", " + endNumber + "] are below - ");
		for (int i = startNumber; i <= endNumber; i++) {
			findPrimeNumber(i, true);
		}
		System.out.println("----------------------------------------------------------------------------");
	}
	
	void primeCount(int sNumber, int eNumber) {
		primeOccurance = 0;
		for (int i = sNumber; i <= eNumber; i++) {
			findPrimeNumber(i, false);
		}
		System.out.println("Count of Prime Numbers in range [" + sNumber + ", " + eNumber + "] is - " + primeOccurance);
	}
	
	void primeSum(int sNumber, int eNumber) {
		sum = 0;
		for (int i = sNumber; i <= eNumber; i++) {
			findPrimeNumber(i, false);
		}
		System.out.println("Sum of Prime Numbers in range [" + sNumber + ", " + eNumber + "] is - " + sum);
	}
	
	void primeAverage(int sNumber, int eNumber) {
		primeOccurance = 0;
		sum = 0;
		for (int i = sNumber; i <= eNumber; i++) {
			findPrimeNumber(i, false);
		}
		int average = (sum/primeOccurance);
		System.out.println("Average of Prime Numbers in range [" + sNumber + ", " + eNumber + "] is - " + average);
	}

	public static void main(String[] args) {
		A10_PrimeNumber a10_PrimeNumber = new A10_PrimeNumber();
		a10_PrimeNumber.isPrimeNumberSingleCheck(101);
		a10_PrimeNumber.isPrimeNumberSingleCheck(28);
		a10_PrimeNumber.primeRange(10, 100);
		a10_PrimeNumber.primeCount(10, 100);
		a10_PrimeNumber.primeSum(10, 100);
		a10_PrimeNumber.primeAverage(10, 100);
	}
	
}
