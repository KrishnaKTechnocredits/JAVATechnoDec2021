package naquibalam;

import java.util.Scanner;

public class A21_StringAppend {

	String getSumNumeric(String inputString) {
		String temp = "";
		for (int i = 0; i <= inputString.length() - 1; i++) {
			char charCheck = inputString.charAt(i);
			if (Character.isDigit(charCheck)) {
				temp += charCheck;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		A21_StringAppend a21_StringAppend = new A21_StringAppend();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String from which you want digits : ");
		String stringToUse = scanner.next();
		System.out.println("All digits from string : " + a21_StringAppend.getSumNumeric(stringToUse));
		scanner.close();
	}
}
