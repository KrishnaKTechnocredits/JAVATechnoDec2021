package naquibalam;

import java.util.Scanner;

public class A23_Program4 {
	
	int getDiffOddEven(String input) {
		int oddSum = 0;
		int evenSum = 0;
		for (int i = 0; i < input.length(); i++) {
			char eachChar = input.charAt(i);
			if (Character.isDigit(eachChar)) {
				int temp = Integer.parseInt(eachChar + "");
				if (temp % 2 == 0) {
					evenSum = evenSum + temp;
				} else {
					oddSum = oddSum + temp;
				}
			}
		}
		return (oddSum - evenSum);
	}

	public static void main(String[] args) {
		A23_Program4 a23_Program4 = new A23_Program4();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String from which you want difference between Odd and Even values : ");
		String stringToUse = scanner.next();
		System.out.println("Difference between Odd and Even values from string : " + a23_Program4.getDiffOddEven(stringToUse));
		scanner.close();
	}
}
