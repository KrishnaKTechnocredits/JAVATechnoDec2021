package naquibalam;

import java.util.Scanner;

public class A23_Program2 {

	int getAddition(String input) {
		String temp = "0";
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char eachChar = input.charAt(i);
			if (Character.isDigit(eachChar)) {
				temp = temp + eachChar;
			} else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		if (temp != "0") {
			sum = sum + Integer.parseInt(temp);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		A23_Program2 a23_Program2 = new A23_Program2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the String from which you want numeric sum : ");
		String stringToUse = scanner.next();
		System.out.println("Sum of integers from string : " + a23_Program2.getAddition(stringToUse));
		scanner.close();
	}
}
