package hevin;

import java.util.Scanner;

public class A12_MaxPrimeNumber {

	int maxPrime =0;
	int isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			maxPrime = num;

		}
		return maxPrime;
	}


	void primeNumbersInRange(int firstNum, int lastNum) {

		for (int index = lastNum; index >= firstNum; index--) {
			maxPrime= isPrime(index);
			if(maxPrime !=0)
				break;

		}
		System.out.println("Max Prime Number in an inputed Range = "+ maxPrime);
	}

	public static void main(String[] args) {
		A12_MaxPrimeNumber maxPrimeNumber = new A12_MaxPrimeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number of range: ");
		int firstNum = sc.nextInt();
		System.out.println("Enter Last number of range: ");
		int lastNum = sc.nextInt();
		maxPrimeNumber.primeNumbersInRange(firstNum, lastNum);
		sc.close();
	}

}