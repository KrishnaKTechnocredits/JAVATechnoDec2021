package sandip.Assignment_12;

import java.util.Scanner;

public class Assignment_12_1 {

	int count;
	char store;

	void nonRepeatingChar(String input) {
		System.out.println();
		for (int index = 0; index < input.length() - 1; index++) {
			count = 1;
			store = input.charAt(index);
			for (int index1 = index + 1; index1 < input.length() - 1; index1++) {
				if (store == input.charAt(index1)) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("First Non-Repeating Character : " + store);
				break;
			}

		}
	}

	void repeatingChar(String input) {
		for (int index = 0; index <= input.length() - 1; index++) {
			count = 1;
			store = input.charAt(index);
			for (int index1 = index + 1; index1 <= input.length() - 1; index1++) {
				if (store == input.charAt(index1)) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println("First Repeating Character : " + store);
				break;
			}

		}
	}

	void reverseCharacter(String input) {
		System.out.print("Reverse Character are: ");
		for (int index = input.length() - 1; index >= 0; index--) {
			System.out.print(input.charAt(index));
		}
		System.out.println();
	}

	void reverseNumber(String input) {
		System.out.print("Reverse Number is: ");
		for (int index = input.length() - 1; index >= 0; index--) {
			System.out.print(input.charAt(index));
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Assignment_12_1 character = new Assignment_12_1();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String first non-repeating character : ");
		String s1 = scanner.next();
		character.nonRepeatingChar(s1);
		System.out.println("Enter string for first repeating character : ");
		String s2 = scanner.next();
		character.repeatingChar(s2);
		System.out.println("Enter string for reverse string : ");
		String s3 = scanner.next();
		character.reverseCharacter(s3);
		System.out.println("Enter the number to be reversed : ");
		String i1 = scanner.next();
		character.reverseNumber(i1);
		System.out.println();
		scanner.close();
	}
}
