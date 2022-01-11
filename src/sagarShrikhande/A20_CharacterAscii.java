package sagarShrikhande;

import java.util.Scanner;

public class A20_CharacterAscii {

	void sumOfDigits(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + (Character.getNumericValue(ch));
			}
		}
		System.out.println("Sum of digits in input string is: " + sum);
	}

	public static void main(String[] a) {
		A20_CharacterAscii a20_CharacterAscii = new A20_CharacterAscii();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input String: ");
		String str = sc.next();
		a20_CharacterAscii.sumOfDigits(str);
		sc.close();
	}
}
