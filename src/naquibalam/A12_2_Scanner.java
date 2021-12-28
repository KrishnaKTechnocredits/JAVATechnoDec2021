package naquibalam;

import java.util.Scanner;

public class A12_2_Scanner {

	int getPrimeNumber(int input) {
		int returnValue = 0;
		boolean flag = true;
		for (int i=2; i <= input/2; i++) {
			if (input%i==0) {
				flag = false;
				break;
			}
		}
		if (flag == true) {
				returnValue = input;
		}
		return returnValue;
	}
	
	void lastInPrimeRange() {
		int primeNumber = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the start number of the range");
		int startNumber = scanner.nextInt();
		System.out.println("Please enter the end number of the range");
		int endNumber = scanner.nextInt();
		for (int i = startNumber; i <= endNumber; i++) {
			getPrimeNumber(i);
			if (getPrimeNumber(i) != 0) {
				primeNumber = getPrimeNumber(i);
			}
		}
		System.out.println("Last prime number in the range [" + startNumber + "," + endNumber + "] is - " + primeNumber );
	}
	
	public static void main(String[] args) {
		A12_2_Scanner a12_2_Scanner = new A12_2_Scanner();
		a12_2_Scanner.lastInPrimeRange();
	}
}
