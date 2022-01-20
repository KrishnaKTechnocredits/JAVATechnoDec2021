package naquibalam;

import java.util.Scanner;

public class A23_Program3 {
	
	String getSegregatedValues(String input) {
		String lowerCase = "";
		String digits = "";
		String upperCase = "";
		String specialChar = "";
		for (int i = 0; i < input.length(); i++) {
			char eachChar = input.charAt(i);
			if (Character.isLowerCase(eachChar)) {
				lowerCase = lowerCase + eachChar;
			} else if (Character.isDigit(eachChar)) {
				digits = digits + eachChar;
			} else if (Character.isUpperCase(eachChar)) {
				upperCase = upperCase + eachChar;
			} else {
				specialChar = specialChar + eachChar;
			}
		}
		return lowerCase + digits + upperCase + specialChar;
	}

	public static void main(String[] args) {
		A23_Program3 a23_Program3 = new A23_Program3();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String from which you want segregated values : ");
		String stringToUse = scanner.next();
		System.out.println("Segregated Values from string : " + a23_Program3.getSegregatedValues(stringToUse));
		scanner.close();
	}
}
