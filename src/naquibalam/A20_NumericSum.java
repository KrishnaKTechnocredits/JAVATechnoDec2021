package naquibalam;

import java.util.Scanner;

public class A20_NumericSum {

	int getSumNumeric(String inputString) {
		int sum = 0;
		for (int i = 0; i <= inputString.length() - 1; i++) {
			char charCheck = inputString.charAt(i);
			if (Character.isDigit(charCheck)) {
				int num = Character.getNumericValue(charCheck);
				sum = sum + num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		A20_NumericSum a20_NumericSum = new A20_NumericSum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String from which you want sum : ");
		String stringToUse = scanner.next();
		System.out.println("Sum of integers from string : " + a20_NumericSum.getSumNumeric(stringToUse));
		scanner.close();
	}
}
