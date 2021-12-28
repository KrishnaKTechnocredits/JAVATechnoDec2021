package naquibalam;

import java.util.Scanner;

public class A12_4_Scanner {
	
	int getNumberReverse(int num) {
		int revValue = 0;
		while (num!=0) {
			int mod = num % 10;
			revValue = revValue * 10 + mod;
			num = num/10;
		}
		return revValue;
	}

	public static void main(String[] args) {
		A12_4_Scanner a12_4_Scanner = new A12_4_Scanner();
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Please enter the number to be reversed");
		int numberToReverse = scanner.nextInt();
		int reversedNumber = a12_4_Scanner.getNumberReverse(numberToReverse);
		System.out.println("Reverse of number '" + numberToReverse + "' is '" + reversedNumber + "'");
	}
}
