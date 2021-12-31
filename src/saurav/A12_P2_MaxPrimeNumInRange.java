package saurav;

import java.util.Scanner;

public class A12_P2_MaxPrimeNumInRange {

	int maxPrime;

	void isPrime(int num) {
		boolean flag = true;
		for (int index = 2; index < num; index++) {
			if (num % index == 0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
			maxPrime = num;
		}
	}

	void maxPrimeNumInRange(int fnum, int lnum) {
		for (int index = fnum; index <= lnum; index++) {
			isPrime(index);
		}
		System.out.println("max prime number in given range = " + maxPrime);
	}

	public static void main(String[] a) {
		A12_P2_MaxPrimeNumInRange name = new A12_P2_MaxPrimeNumInRange();
		Scanner sc = new Scanner(System.in);
		System.out.print("enterr the first num ");
		int input1 = sc.nextInt();
		System.out.print("enterr the second num ");
		int input2 = sc.nextInt();
		// name.isPrime();
		name.maxPrimeNumInRange(input1, input2);
		sc.close();
	}
}
