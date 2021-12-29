/*Program 2 : find sum of first 10 prime numbers in given range.*/

package deepak;

public class Test1_P2_PrimeNumbers {
	int count, sum;

	void isPrime(int num) {
		boolean isPrime = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				// System.out.println(num+" is not Prime");
				isPrime = false;
			}
		}
		if (isPrime == true && count < 11) {
			System.out.println(num + " is Prime");
			sum = sum + num;
			count++;
		}
	}

	void isPrimeInRange(int startNum, int endNum) {
		for (int index = startNum; index <= endNum; index++) {
			isPrime(index);
		}
		System.out.println("Sum of first 10 Prime Numbers: " + sum);
	}

	public static void main(String[] args) {
		Test1_P2_PrimeNumbers first10PrimeNos = new Test1_P2_PrimeNumbers();
		// first10PrimeNos.isPrime(7);
		first10PrimeNos.isPrimeInRange(2, 30);
	}
}
