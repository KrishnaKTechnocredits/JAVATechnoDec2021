/*Assignment - 13 : 28th Dec'2021

Write a program to satisfy below requirement using indexOf and lastIndexOf method.

1. Print all duplicate characters from given string.
2. Print all unique characters from given string.
3. Return first unique character from given string.
4. Return first duplicate character from given string. */

package pallavi;

import java.util.Scanner;

public class A13_FirstLast_Index {
	A12_ScannerProg1 a12 = new A12_ScannerProg1();

	void getDuplicateChar(String str) {
		char ch;
		String charpresent = "";
		System.out.print("The duplicate charaters in string are: ");

		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) != str.lastIndexOf(ch))
				if (a12.isPresent(charpresent, ch)) {
					System.out.print(ch);
				}
			charpresent = charpresent + ch;
		}
	}

	void getUniqueChar(String str) {
		char ch;
		System.out.print("The unique charaters in string are: ");

		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				System.out.print(ch);
		}
	}

	void getFirstUniqueChar(String str) {
		char ch = 0;
		System.out.print("The first unique charatrs in string is: ");
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				break;
		}
		System.out.print(ch);
	}

	void getFirstDuplicateChar(String str) {
		char ch = 0;
		System.out.print("The first duplicate charater in string are: ");

		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) != str.lastIndexOf(ch))
				break;
		}
		System.out.print(ch);
	}

	public static void main(String[] arr) {
		Scanner scanner = new Scanner(System.in);
		A13_FirstLast_Index a13_FirstLast_Index = new A13_FirstLast_Index();
		System.out.println("Enter the input string");
		String str = scanner.nextLine();
		a13_FirstLast_Index.getFirstDuplicateChar(str);
		System.out.println("");
		a13_FirstLast_Index.getFirstUniqueChar(str);
		System.out.println("");
		a13_FirstLast_Index.getUniqueChar(str);
		System.out.println("");
		a13_FirstLast_Index.getDuplicateChar(str);
		System.out.println("");
		scanner.close();
	}
}
