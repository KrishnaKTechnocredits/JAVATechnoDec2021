package poojaRajguru;

public class A10_PrimeNumber {

	int primeCount = 0, primeSum = 0;
	float primeAvg = 0;

	void isPrime(int num) {
		boolean flag = true;
		for(int i=2; i<=(num/2); i++) {
			if(num%i == 0)
				flag = false;
		}
		if(flag == true)
		{
			primeCount++;
			primeSum = primeSum + num;
			System.out.println(" " + num);
		}
	}

	void primeNumberRange(int start, int end) {
		System.out.println(" Prime Numbers in range (" + start + "," + end + ") are : ");
		for(int i=start; i<=end; i++) {
			isPrime(i);
		}	
	}

	void countPrimeNumberRange(int start, int end) {
		primeCount = 0;
		System.out.println(" Prime Numbers in range (" + start + "," + end + ") are : ");
		for(int i=start; i<=end; i++) {
			isPrime(i);
		}
		System.out.println();
		System.out.println(" Count of prime numbers in range (" + start + "," + end + ") is : " + primeCount);
	}

	void sumOfPrimeNumberRange(int start, int end) {
		primeSum = 0;
		System.out.println(" Prime Numbers in range (" + start + "," + end + ") are : ");
		for(int i=start; i<=end; i++) {
			isPrime(i);
		}
		System.out.println();
		System.out.println(" Sum of Prime Numbers in range (" + start + "," + end + ") is : " + primeSum);
	}

	void averageOfPrimeNumberRange(int start, int end) {
		primeCount = 0;
		primeSum = 0;
		System.out.println(" Prime Numbers in range (" + start + "," + end + ") are : ");
		for(int i=start; i<=end; i++) {
			isPrime(i);
		}
		primeAvg = (primeSum / primeCount);
		System.out.println();
		System.out.println(" Average of Prime Numbers in range (" + start + "," + end + ") is : " + primeAvg);
	}

	public static void main(String[] args) {

		A10_PrimeNumber primeNumber = new A10_PrimeNumber();
		System.out.println(" The Prime Number Is:  ");
		primeNumber.isPrime(3);
		System.out.println();
		primeNumber.primeNumberRange(10, 30);
		System.out.println();
		primeNumber.countPrimeNumberRange(10, 30);
		System.out.println();
		primeNumber.sumOfPrimeNumberRange(10, 30);
		System.out.println();
		primeNumber.averageOfPrimeNumberRange(10, 30);
	}
}