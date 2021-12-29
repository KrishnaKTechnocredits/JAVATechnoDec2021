package sham;
import java.util.Scanner;

public class A14_UniqueDuplicate {
	int duplicateCount, uniqueCount;
	void findAllUniqueChar(String name) {
		System.out.println(" unique character: ");
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (name.indexOf(ch) == name.lastIndexOf(ch)) {
				System.out.print(ch + " ");
				uniqueCount++;

			}
		}
	}

	void findAllDuplicateChar(String name) {
		System.out.println(" duplicate characters: ");
		String temp = "";
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			String s = ch + "";
			if (temp.contains(s)) {

			} else {
				if (name.indexOf(ch) != name.lastIndexOf(ch)) {
					System.out.print(ch + " ");
					duplicateCount++;

				}
			}
			temp = temp + ch;
		}

	}

	void displayCount() {
		System.out.println();
		if (uniqueCount > duplicateCount) {
			System.out.println("unique Count is more: Java");
		} else
			System.out.println("duplicate Count is more: Selenium");
	}

	public static void main(String[] args) {
		A14_UniqueDuplicate uniqueDuplicate = new A14_UniqueDuplicate();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String name = sc.next();

		uniqueDuplicate.findAllDuplicateChar(name);
		uniqueDuplicate.findAllUniqueChar(name);
		uniqueDuplicate.displayCount();
		sc.close();
	}

}
