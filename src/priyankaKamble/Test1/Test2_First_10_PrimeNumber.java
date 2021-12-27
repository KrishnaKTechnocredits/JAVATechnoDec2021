package priyankaKamble.Test1;

/*
Program 2 : find sum of first 10 prime numbers in given range. 
 */
public class Test2_First_10_PrimeNumber {
	static int count, sum = 0;
	
	void isPrime(int inputNum) {
		boolean flag = false;
		for (int index = 2; index <= inputNum / 2; index++) {
			if (inputNum % index == 0)
				flag = true;
		}
		if (flag == false) {
			System.out.println(inputNum + " is a Prime Number");
			count++;
			if (count <=10)
			sum =sum +inputNum;
		}
	}

	void primeNumberInRange(int startNum, int lastNum) {
		for (int index = startNum; index <= lastNum; index++) {
			isPrime(index);
		}
	}

	void countPrimeNumber() {
		System.out.println("Total Number of Prime Number = " + count);
	}

	void sumOfPrimeNumber() {
		System.out.println("Sum of forst 10 Prime Number in given Range = " + sum);
	}
	
	public static void main(String[] args) {
		Test2_First_10_PrimeNumber test2 = new Test2_First_10_PrimeNumber();
		//test2.findPrime(17);
		test2.primeNumberInRange(2,50);
		test2.sumOfPrimeNumber();
	}
}
