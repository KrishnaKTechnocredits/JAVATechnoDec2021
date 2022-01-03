package jagdish;

import java.util.Scanner;

public class Assignment_13 {
	// Print all unique characters from given string.
	void findUniqueChar(String input) {
		System.out.println("The Unique value are :- ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				System.out.println(ch);
		}
	}

	// Return first duplicate character from given string.
	void findDuplicateChar(String input) {
		System.out.println("The Duplicate char is:- ");
		char ch = ' ';
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (input.indexOf(ch) != input.lastIndexOf(ch))
				break;
		}

		System.out.println(ch);
	}

	// Return first unique character from given string.
	void firstUniqueChar(String input) {
		System.out.println("The 1st Unquie char is:- ");
		char ch = 0;
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				break;
		}
		System.out.println(ch);
	}

	public static void main(String[] args) {

		Assignment_13 duplicatechar = new Assignment_13();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name and it will return Unique Char:- ");
		String temp = sc.next();
		duplicatechar.findUniqueChar(temp);
		System.out.println("Enter the Name and it will return Duplicate Char:- ");
		String dup = sc.next();
		duplicatechar.findDuplicateChar(dup);
		System.out.println("Enter the Name and it will First Unique Char:- ");
		String unique = sc.next();
		duplicatechar.firstUniqueChar(unique);
		sc.close();
	}

}
