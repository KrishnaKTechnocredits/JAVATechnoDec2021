package priyankaKamble.assignment_10;

/*
 Assignment - 10 : 23rd Dec’2021

Create a class to satisfy below requirements. 
                  a) Print Number is prime if Given number is prime. (parameterized method)
                  b) Print all the prime numbers between range 100->120. (parameterized method)
                  c) Print total count of prime numbers between 100->120.
                  d) Find sum of all prime numbers between 100->120
                  e) Find avg of prime numbers between 100->120


 */
public class PrimeNumber {
	static int count, sum = 0, averageOfPrime;

	void isPrime(int inputNum) {
		boolean flag = false;
		for (int index = 2; index <= inputNum / 2; index++) {
			if (inputNum % index == 0)
				flag = true;
		}
		// if (flag == true)
		// System.out.println(inputNum + " is not a Prime Number");
		if (flag == false) {
			System.out.println(inputNum + " is a Prime Number");
			count++;
			sum = +inputNum;
		}
	}

	void primeNumberInRange(int startNum, int lastNum) {
		// boolean flag = false;
		for (int index = startNum; index <= lastNum; index++) {
			isPrime(index);
		}
	}

	void countPrimeNumber() {
		System.out.println("Total Number of Prime Number = " + count);
	}

	void sumOfPrimeNumber() {
		System.out.println("Sum of all Prime Number in given Range = " + sum);
	}

	void averageOfPrimeNumber() {
		System.out.println("Average of all prime Numbers = " + (sum / count));
	}

	public static void main(String[] args) {
		PrimeNumber prime = new PrimeNumber();
		prime.isPrime(17);
		prime.primeNumberInRange(100, 120);
		prime.countPrimeNumber();
		prime.sumOfPrimeNumber();
		prime.averageOfPrimeNumber();
	}
}
