package sagarShrikhande;

import java.util.Scanner;

public class A14_DuplicateCharsInString {

	void uniqueNDuplicateChars(String input) {

		int uniqueCount = 0;
		int dupCount = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (index == input.indexOf(ch)) {
				if (input.indexOf(ch) == input.lastIndexOf(ch))
					uniqueCount++;
				if (input.indexOf(ch) != input.lastIndexOf(ch))
					dupCount++;
			}

		}
		if (dupCount > uniqueCount)
			System.out.println("Selenium");
		else if (dupCount < uniqueCount)
			System.out.println("java");
		else
			System.out.println("Both have same count");

	}

	public static void main(String[] a) {
		A14_DuplicateCharsInString a14_DuplicateCharsInString = new A14_DuplicateCharsInString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input string: ");
		String input = sc.next();
		a14_DuplicateCharsInString.uniqueNDuplicateChars(input);
		sc.close();
	}

}
