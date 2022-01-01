package saurav;

import java.util.Scanner;

public class A14_ifCharAreMoreThanUniqChar {

	static int uniqueCount = 0;
	static int duplicateCount = 0;

	int getUniqueChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.println(ch);
				uniqueCount += 1;
			}
		}
		System.out.println("Unique char count = " + uniqueCount);
		return uniqueCount;
	}

	int getDuplicateChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char chr = input.charAt(index);
			if (index == input.indexOf(chr)) /////////////// IMP///////////////////
				if (input.indexOf(chr) != input.lastIndexOf(chr)) {
					System.out.println(chr);
					duplicateCount += 1;
				}
		}
		System.out.println("Duplicate char count = " + duplicateCount);
		return duplicateCount;
	}

	void result(String word) {
		boolean flag = true;
		if (duplicateCount > uniqueCount) {
			System.out.println("Java");
			flag = false;
		}
		if (flag == true) {
			System.out.println("selenium");
		}
	}

	public static void main(String[] a) {
		A14_ifCharAreMoreThanUniqChar name = new A14_ifCharAreMoreThanUniqChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String scan = sc.next();
		System.out.println("Unique chars from String are : ");
		name.getUniqueChar(scan);
		System.out.println("Duplicate chars from String are : ");
		name.getDuplicateChar(scan);
		System.out.println();
		name.result(scan);
	}
}
