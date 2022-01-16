package vrushali;

import java.util.Scanner;

public class A12_MaxPrimeNumberFromRange {

	boolean isPrime(int num) {
		boolean flag = true;
		if (num == 1)
			return false;

		for(int index = 2; index <= num/2; index++) {
			if(num % index == 0) {
				flag= false;
				break;
			}
		}
		return flag;
	}

	void findMaxPrimeNumFromRange(int startNum, int endNum) {

		int num = startNum;
		int maxPrime = 0;

		while (num <= endNum) {

			if (isPrime(num) == true) {
				maxPrime = num;
			}
			num++;
		}
		System.out.println("Maximum Prime Number is : " + maxPrime);
	}

	public static void main(String[] args) {
		A12_MaxPrimeNumberFromRange maxPrimeNumberFromRange = new A12_MaxPrimeNumberFromRange();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the Start Range of Prime Numbers : ");
		int startNum = scanner.nextInt();
		System.out.print("Enter the End Range of Prime Numbers : ");
		int endNum = scanner.nextInt();
		maxPrimeNumberFromRange.findMaxPrimeNumFromRange(startNum, endNum);
		scanner.close();
	}
}
