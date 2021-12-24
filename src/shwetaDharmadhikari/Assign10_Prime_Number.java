/*Assignment - 10 : 23rd Dec’2021

Create a class to satisfy below requirements. 
                  a) Print Number is prime if Given number is prime. (parameterized method)
                  b) Print all the prime numbers between range 100->120. (parameterized method)
                  c) Print total count of prime numbers between 100->120.
                  d) Find sum of all prime numbers between 100->120
                  e) Find avg of prime numbers between 100->120*/

package shwetaDharmadhikari;

public class Assign10_Prime_Number {

	int count;
	int sum;
	int average;

	void displayPrimeNumber(int number) {
		boolean isPrime = true;
		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0) {
				isPrime = false;
				break;
			}
		}

		if (isPrime == true) {
			System.out.println(number + " is prime number");
			count++;
			sum += number;
			average = sum / count;
		}
	}

	void countPrimeNumbers() {
		System.out.println("\nCount of Prime numbers are:" + count);
	}

	void sumOfPrimeNumbers() {
		System.out.println("\nSum of Prime numbers are:" + sum);
	}

	void AverageOfPrimeNumber() {
		System.out.println("\nAverage of Prime numbers are:" + average);
	}

	void verifyNumbersIsPrimeInRange(int startIndex, int endIndex) {
		count = 0;
		sum = 0;
		average = 0;
		System.out.println("\nPrime numbers between " + startIndex + " to " + endIndex);
		for (int index = startIndex; index < endIndex; index++) {
			displayPrimeNumber(index);
		}
	}

	public static void main(String[] args) {
		Assign10_Prime_Number assign10_Prime_Number = new Assign10_Prime_Number();
		assign10_Prime_Number.displayPrimeNumber(17);
		assign10_Prime_Number.displayPrimeNumber(6);
		assign10_Prime_Number.verifyNumbersIsPrimeInRange(100, 120);
		assign10_Prime_Number.countPrimeNumbers();
		assign10_Prime_Number.sumOfPrimeNumbers();
		assign10_Prime_Number.AverageOfPrimeNumber();

	}
}
