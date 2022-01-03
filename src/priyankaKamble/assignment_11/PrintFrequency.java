package priyankaKamble.assignment_11;

import java.util.Scanner;

/*Write a program with following methods.
1. create a method to return first occurrence of given character from given string.
2. create a method to return last occurrence of given character from given string.
3. create a method to return true if given character is found from given string else return false.
4. create a method to return total occurrence of given character from given string.*/
public class PrintFrequency {
	static int count = 0;

	void firstOccaranceOfchar(String input, char character) {
		input = input.toLowerCase();
		int indexOccurance = -1;
		character = Character.toLowerCase(character);
		// System.out.println("check = "+Character.toLowerCase(character));
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (character == ch) {
				indexOccurance = index;
				break;
			}
		}
		System.out.println("First Occurance of Character '" + character + "' is at index " + indexOccurance
				+ " in String " + input + "\n");
	}

	void lastOccurance(String input, char character) {
		input = input.toLowerCase();
		int indexOccurance = -1;
		character = Character.toLowerCase(character);
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (character == ch) {
				indexOccurance = input.lastIndexOf(ch);
			}
		}
		System.out.println("Last occurance of Character '" + character + "' in String '" + input + "' is at "
				+ indexOccurance + "\n");
	}

	boolean isCharpresent(String input, char character) {
		boolean flag = false;
		input = input.toLowerCase();
		character = Character.toLowerCase(character);
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == character) {
				flag = true;
				break;
			} else
				flag = false;
		}
		return flag;
	}

	void totalOccaranceOfchar(String input, char character) {
		input = input.toLowerCase();
		int indexOccurance = -1;
		character = Character.toLowerCase(character);
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (character == ch) {
				count++;
			}
		}
		System.out.println("Character '" + character + "' appeared " + count + " times in String '" + input + "'\n");
	}

	public static void main(String[] args) {
		PrintFrequency printFrequency = new PrintFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String - ");
		String input = scanner.nextLine();
		System.out.println("Enter character to find  - ");
		char character = scanner.next().charAt(0);
		printFrequency.firstOccaranceOfchar(input, character);
		printFrequency.lastOccurance(input, character);
		boolean result = printFrequency.isCharpresent(input, character);
		System.out.println("Is charcter '" + character + "' is found in " + input + " ? Ans =>"
				+ printFrequency.isCharpresent(input, character) + "\n");
		printFrequency.totalOccaranceOfchar(input, character);
	}
}
