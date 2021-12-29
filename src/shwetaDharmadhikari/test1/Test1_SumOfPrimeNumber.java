/*
 * Program 2 : find sum of first 10 prime numbers in given range.
 */
package shwetaDharmadhikari.test1;

public class Test1_SumOfPrimeNumber {
	int sum = 0, primeCount = 1, count = 0;

	void getSumOfPrimeNumbers() {
		boolean flag = true;
		for (int number = 2; primeCount <= 10; number++) {
			{
				count = 0;
				flag = true;
				for (int i = 2; i <= number / 2; i++) {
					if (number % i == 0) {
						count++;
						flag = false;
						break;
					}
				}
				if (flag == true)
					primeCount++;
				if (count == 0 && number != 1) {
					sum = sum + number;
				}
			}

		}
		System.out.println("\n Sum of First 10 Prime Numbers = " + sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1_SumOfPrimeNumber test1_SumOfPrimeNumber = new Test1_SumOfPrimeNumber();
		test1_SumOfPrimeNumber.getSumOfPrimeNumbers();
	}

}
