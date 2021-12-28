package saurav;

import java.util.Scanner;

public class A13_P3_PrintFirstUniqueChar {///////////////// completed//////////////////

	String getfirstUniqueChar(String input) {
		boolean flag = true;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}
		}
		if(flag==true)
			System.out.println("No unique char present in String");
		return input;
	}

	public static void main(String[] a) {
		A13_P3_PrintFirstUniqueChar funiqchar = new A13_P3_PrintFirstUniqueChar();
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the input String :");
		String word = sc.next();
		System.out.print(" first Unique char from given string is : ");
		funiqchar.getfirstUniqueChar(word);

	}
}
