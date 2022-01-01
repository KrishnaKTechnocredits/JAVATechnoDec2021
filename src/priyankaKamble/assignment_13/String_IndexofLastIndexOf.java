package priyankaKamble.assignment_13;

import java.util.Scanner;

public class String_IndexofLastIndexOf {

	String printUniqueChar(String input) {
		input = input.toLowerCase();
		String tempString = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				tempString = " " + ch;
				System.out.println("Unique Characters in give string  " + input + " => " + tempString);
			}
		}
		return tempString;
	}

	String printDupicateChar(String input) {
		input = input.toLowerCase();
		String tempString = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) != input.lastIndexOf(ch)) {
				tempString = " " + ch;
				System.out.println("Duplicate Characters in give string  " + input + " => " + tempString);
			}
		}
		return tempString;
	}

	String printFirstUniqueChar(String input) {
		input = input.toLowerCase();
		String tempString = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				tempString = " " + ch;
				System.out.println("\nFirst Unique Characters in give string = " + tempString);
				break;
			}

		}
		return tempString;
	}

	String printFirstDuplicateChar(String input) {
		input = input.toLowerCase();
		String tempString = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) != input.lastIndexOf(ch)) {
				tempString = " " + ch;
				System.out.println("\nFirst Duplicate Characters in give string = " + tempString);
				break;
			}
		}
		return tempString;
	}

	public static void main(String[] args) {
		String_IndexofLastIndexOf stringexample = new String_IndexofLastIndexOf();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String - ");
		String input = sc.nextLine();

		stringexample.printFirstUniqueChar(input);
		stringexample.printFirstDuplicateChar(input);
		System.out.println("\n");
		stringexample.printDupicateChar(input);
		System.out.println("\n");
		stringexample.printUniqueChar(input);
	}
}
