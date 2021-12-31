package pranoti;

import java.util.Scanner;

public class A13_StringCharOpertions {

	void getAllDuplicateChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (index == input.indexOf(ch))
				if (input.indexOf(ch) != input.lastIndexOf(ch))
					System.out.println(ch);
		}
	}

	void getAllUniqueChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				System.out.println(ch);
		}
	}

	void getFirstDuplicateChar(String input) {
		char ch = ' ';
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (input.indexOf(ch) != input.lastIndexOf(ch))
				break;
		}
		System.out.println("first duplicate character from given string is :" + ch);
	}

	void getFirstuniqueChar(String input) {
		char ch = ' ';
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				break;
		}
		System.out.println("first unique character from given string is :" + ch);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input String :");
		String str = sc.next();
		A13_StringCharOpertions a13_StringCharOpertions = new A13_StringCharOpertions();
		System.out.println("All duplicate characters are :");
		a13_StringCharOpertions.getAllDuplicateChar(str);
		System.out.println("------------------------------------");
		System.out.println("All unique characters are :");
		a13_StringCharOpertions.getAllUniqueChar(str);
		System.out.println("------------------------------------");
		a13_StringCharOpertions.getFirstuniqueChar(str);
		System.out.println("------------------------------------");
		a13_StringCharOpertions.getFirstDuplicateChar(str);
		sc.close();
	}
}
