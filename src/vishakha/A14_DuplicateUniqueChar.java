package vishakha;

import java.util.Scanner;

public class A14_DuplicateUniqueChar {

	int dupCount, uniCount;

	void searchUniqueChar(String name) {
		System.out.println("Unique characters are: ");
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (name.indexOf(ch) == name.lastIndexOf(ch)) {
				System.out.print(ch + " ");
				uniCount++;
			}
		}
	}

	void searchDupChar(String name) {
		System.out.println("\nDuplicate Characers are: ");
		String temp = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			String s = ch + "";
			if (temp.contains(s)) {
			} else {
				if (name.indexOf(ch) != name.lastIndexOf(ch)) {
					System.out.print(ch + " ");
					dupCount++;
				}
			}

			temp = temp + ch;

		}
	}

	void displayCount() {
		System.out.println();
		if (uniCount > dupCount) {
			System.out.println("Unique count is more : Java");
		} else
			System.out.println("Duplicate count is more: Selenium");
	}

	public static void main(String[] args) {
		A14_DuplicateUniqueChar duplicateUniqueChar = new A14_DuplicateUniqueChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String name = sc.next();

		duplicateUniqueChar.searchUniqueChar(name);
		duplicateUniqueChar.searchDupChar(name);
		duplicateUniqueChar.displayCount();
		sc.close();
	}

}
