package pradeep;

import java.util.Scanner;

public class A21_StringExample {
	void sumOfDigitInString(String input) {
		int sum = 0;
		int count = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
				temp += ch;
				count++;
			}
		}
		System.out.println("All Digits in given String: " + temp);
		System.out.println("No of Digits in given String: " + count);
		System.out.println("Sum of all Digits in given String: " + sum);
	}

	public static void main(String[] args) {
		A21_StringExample a21_StringExample = new A21_StringExample();
		Scanner sc = new Scanner(System.in);

		String input = sc.next();
		a21_StringExample.sumOfDigitInString(input);
	}

}
