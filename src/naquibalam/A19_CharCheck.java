package naquibalam;

import java.util.Scanner;

public class A19_CharCheck {
	
	void getCharType(String inputString) {
		int lettersCount = 0;
		int lowerCaseCount = 0;
		int upperCaseCount = 0;
		int digitCount = 0;
		for (int i = 0; i <= inputString.length() - 1; i++) {
			char charCheck = inputString.charAt(i);
			if (Character.isLetter(charCheck)) {
				lettersCount++;
				if (Character.isLowerCase(charCheck)) {
					lowerCaseCount++;
				} else if (Character.isUpperCase(charCheck)) {
					upperCaseCount++;
				}
			} else if (Character.isDigit(charCheck)) {
				digitCount++;
			}
		}
		System.out.println("Total Letters -> " + lettersCount);
		System.out.println("Total UpperCase characters -> " + upperCaseCount);
		System.out.println("Total LowerCase characters -> " + lowerCaseCount);
		System.out.println("Total Digits -> " + digitCount);
	}

	public static void main(String[] args) {
		A19_CharCheck a19_CharCheck = new A19_CharCheck();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String for which you want count of total letter, Uppercase letter, lowercase letter, digit : ");
		String stringToUse = scanner.next();
		a19_CharCheck.getCharType(stringToUse);
		scanner.close();
	}
}
