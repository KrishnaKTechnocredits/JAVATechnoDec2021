package priyankaKamble.assignment_12;

import java.util.Scanner;

public class ReverseString {
	String reverseString(String input) {
		String reverString = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			reverString = reverString + ch;
		}
		return reverString;
	}

	public static void main(String[] args) {
		ReverseString sc = new ReverseString();
		Scanner scanner = new Scanner(System.in);
	

		System.out.println("Enter String - ");
		String input = scanner.nextLine();
		System.out.println("reverse String of " + input + " is - " + sc.reverseString(input));

	}

}
