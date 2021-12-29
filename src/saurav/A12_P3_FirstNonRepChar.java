package saurav;

import java.util.Scanner;

public class A12_P3_FirstNonRepChar {

	int findChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		return count;
	}

	void firstRepetedChar(String word) {
		char chr = ' ';
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			int name = findChar(word, ch);
			if (name != 1) {
				chr = ch;
				break;
			}
		}
		System.out.println(chr);
	}

	void firstNonRepetedChar(String word) {
		char chr = ' ';
		for (int index = 0; index < word.length(); index++) {
			char ch = word.charAt(index);
			int name = findChar(word, ch);
			if (name == 1) {
				chr = ch;
				break;
			}
		}
		System.out.println(chr);
	}

	public static void main(String[] a) {
		A12_P3_FirstNonRepChar prime = new A12_P3_FirstNonRepChar();

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string1 = ");
		String input = scanner.nextLine();

		System.out.print("Enter the string2 = ");
		String word = scanner.nextLine();

		// prime.findChar(input,);
		prime.firstRepetedChar(word);
		prime.firstNonRepetedChar(word);
		System.out.println("Program End");
		scanner.close();
	}
}
