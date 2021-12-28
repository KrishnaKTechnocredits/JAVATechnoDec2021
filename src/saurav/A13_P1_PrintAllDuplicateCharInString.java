package saurav;

import java.util.Scanner;

public class A13_P1_PrintAllDuplicateCharInString {//////// completed one query///////////////

	String getduplicateChar(String input) {
		boolean flag = true;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) != input.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
		if(flag==true)
			System.out.println("No unique char present in String");
		return input;
	}

	public static void main(String[] a) {
		A13_P1_PrintAllDuplicateCharInString dupchar = new A13_P1_PrintAllDuplicateCharInString();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the String :");
		String word = scanner.nextLine();
		System.out.print("all duplicate char from given string :");
		dupchar.getduplicateChar(word);
	}
}
