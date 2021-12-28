package saurav;

import java.util.Scanner;

public class A13_P4_PrintFirstDuplicateCharInString {//////////////completed/////////

	String getfirstDuplicateChar(String input) {
		boolean flag = true;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) != input.lastIndexOf(ch)) {
				System.out.println(ch);
				flag = false;
				break;
			}
			
		}
		if(flag==true)
			System.out.println("No duplicate char present in String");
		return input;
	}

	public static void main(String[] a) {
		A13_P4_PrintFirstDuplicateCharInString firstdupchar = new A13_P4_PrintFirstDuplicateCharInString();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the input string : ");
		String word = sc.next();
		System.out.print(" first duplicate char from given string is : ");
		firstdupchar.getfirstDuplicateChar(word);

	}
}
