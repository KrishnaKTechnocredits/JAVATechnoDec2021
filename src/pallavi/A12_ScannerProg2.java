/*Assignment - 12 : 26th Dec'2021

2. find max prime number from given range. [range : 2 to 100, ans ; 97]*/

package pallavi;

import java.util.Scanner;

public class A12_ScannerProg2 {

	void findMaxPrime(int startnum, int endnum) {
		int primeNum = 0;

		for (int index = startnum; index <= endnum; index++) {
			boolean isprime = true;
			for (int i = 2; i <= (index / 2); i++) {
				if (index % i == 0) {
					isprime = false;
					break;
				}
			}
			if (isprime == true)
				primeNum = index;
		}
		System.out.println("Max Prime number is: " + primeNum);
	}

	public static void main(String[] arr) {
		A12_ScannerProg2 a12_scannerProg2 = new A12_ScannerProg2();
		Scanner scanner = new Scanner(System.in);
		int startNum = 0, endNum = 0;
		System.out.println("Enter number range:");
		startNum = scanner.nextInt();
		endNum = scanner.nextInt();
		a12_scannerProg2.findMaxPrime(startNum, endNum);
		scanner.close();
	}

}
