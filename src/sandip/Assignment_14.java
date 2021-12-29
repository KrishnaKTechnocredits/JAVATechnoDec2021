package sandip;

import java.util.Scanner;

public class Assignment_14 {
	int count;
	int count1;

	void isDuplicateMoreThanUnique(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				count++; // non repeating characters or unique characters
			} else if (input.indexOf(ch) != input.lastIndexOf(ch) && input.indexOf(ch) == index) {
				count1++; // repeating characters or duplicate characters
			}
		}
		System.out.println("Count of unique characters :" + count);
		System.out.println("Count of duplicate characters :" + count1);
		if (count1 > count) {
			System.out.println("Output is : JAVA");
		} else {
			System.out.println("Output is : SELENIUM");
		}
	}

	public static void main(String[] args) {
		Assignment_14 enter = new Assignment_14();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s1 = scanner.next();
		enter.isDuplicateMoreThanUnique(s1);
		scanner.close();
	}
}
