/*
 * 2. find max prime number from given range. [range : 2 to 100, ans ; 97] [Program-2]
 */
package shwetaDharmadhikari.scanner_demo;

import java.util.Scanner;

public class Assign12_MaxPrimeNumberFromRange {

	boolean isPrime(int num) {
		for (int index = 2; index <= num / 2; index++) {
			if (num % index == 0) {
				return false;
			}
		}
		return true;
	}

	int isPrimeNumber(int startNum, int lastNum) {
		int maxPrime = 0;
		for (int index = startNum; index < lastNum; index++) {
			if (isPrime(index) == true) {
				maxPrime = index;
			}
		}
		return maxPrime;
	}

	public static void main(String[] args) {
		Assign12_MaxPrimeNumberFromRange assign12 = new Assign12_MaxPrimeNumberFromRange();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number :");
		int num1 = sc.nextInt();
		System.out.println("Enter last number :");
		int num2 = sc.nextInt();
		System.out.println("Max prime number is : " + assign12.isPrimeNumber(num1, num2));
	}

}
