package rohini.rohini_Assignment18_22;

import java.util.Scanner;

/*Assignment - 20 : 6th Jan'2022

Write a method to print sum of all digits in a given String.
Input : tech1noc9red3its
Output : 13

Hint : 1+9+3
*/

public class Rohini_Assignment20 {

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
		Rohini_Assignment20 rohini_assignment20 = new Rohini_Assignment20();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Input String: ");
		String str = sc.next();
		rohini_assignment20.sumOfDigits(str);
		sc.close();
	}
}


