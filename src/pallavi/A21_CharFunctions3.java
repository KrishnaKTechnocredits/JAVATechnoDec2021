//Assignment 21 7jna22
//Program returning digits in string

package pallavi;

import java.util.Scanner;

public class A21_CharFunctions3 {

	String getDigitsInString(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				temp = temp + str.charAt(i);
		}

		return temp;
	}

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter input string:");
		String input = sc1.nextLine();
		System.out.println("Digits in input string are:"+new A21_CharFunctions3().getDigitsInString(input));
		sc1.close();
	}
}
