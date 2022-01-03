package priya;

import java.util.Scanner;

public class A12_P3 {
	int stringOccuurrence(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void countOccurrence(String input) {
		char ch=' ';
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			int count = stringOccuurrence(input, ch);
		}
		
	}

	void reverseString(String input) {
		char ch=' ';
		System.out.println("Reverse String is:   ");
		for (int index = input.length()-1; index >=0; index--) {
			ch = input.charAt(index);
			System.out.print(ch);
		}
	}

	public static void main(String[] a) {
		A12_P3 a12_P3_StringOperations = new A12_P3();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String input = sc.next();
		//System.out.println("Value for Boolean flag firstSingle [true/false]: ");
		//boolean fSingle = sc.nextBoolean();
		//System.out.println("Value for Boolean flag firstRepeat [true/false]: ");
		//boolean fRepeat = sc.nextBoolean();
		a12_P3_StringOperations.countOccurrence(input);
		a12_P3_StringOperations.reverseString(input);
		sc.close();
	}
}
