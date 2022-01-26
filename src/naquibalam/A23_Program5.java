package naquibalam;

import java.util.Scanner;

public class A23_Program5 {

	int getDiffOddEvenMultiDigit(String input) {
		String temp = "0";
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 0; i < input.length(); i++) {
			char eachChar = input.charAt(i);
			if (Character.isDigit(eachChar)) {
				temp = temp + eachChar;
			} else {
				if (Integer.parseInt(temp) % 2 == 0) {
					evenSum = evenSum + Integer.parseInt(temp);
				} else {
					oddSum = oddSum + Integer.parseInt(temp);
				}
				temp = "0";
			}
		}
		if (temp != "0") {
			if (Integer.parseInt(temp) % 2 == 0) {
				evenSum = evenSum + Integer.parseInt(temp);
			} else {
				oddSum = oddSum + Integer.parseInt(temp);
			}
		}
		return (evenSum - oddSum);
	}
	
	public static void main(String[] args) {
		A23_Program5 a23_Program5 = new A23_Program5();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String from which you want difference between Odd and Even values : ");
		String stringToUse = scanner.next();
		System.out.println("Difference between Odd and Even values from string : " + a23_Program5.getDiffOddEvenMultiDigit(stringToUse));
		scanner.close();
	}
}
