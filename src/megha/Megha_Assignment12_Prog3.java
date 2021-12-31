package megha;

import java.util.Scanner;

public class Megha_Assignment12_Prog3 {

	void findFirstNonRepeatingCharInString(String name) {
		char charIndex = ' ';
		int nameLength = name.length();
		for (int index = 0; index < nameLength; index++) {
			char ch = name.charAt(index);
			int count = 0;
			for (int index1 = index; index1 < nameLength; index1++) {
				if (name.charAt(index1) == ch)
					count++;
			}
			if (count == 1) {
				charIndex = name.charAt(index);
				break;
			}
		}
		System.out.println("The first Non Repeating Character in " + name + " is : " + charIndex);
	}

	void findFirstRepeatingCharInString(String name) {
		char charIndex = ' ';
		int nameLength = name.length();
		for (int index = 0; index < nameLength; index++) {
			char ch = name.charAt(index);
			int count = 0;
			for (int index1 = index; index1 < nameLength; index1++) {
				if (name.charAt(index1) == ch)
					count++;
			}
			if (count > 1) {
				charIndex = name.charAt(index);
				break;
			}
		}
		System.out.println("The first Repeating Character in " + name + " is : " + charIndex);
	}

	void reverseString(String name) {

		String revString = "";
		for (int index = name.length() - 1; index >= 0; index--) {
			char ch = name.charAt(index);
			revString = revString + ch;
		}
		System.out.println("The Reverse String of " + name + " is : " + revString);
	}

	public static void main(String[] args) {
		Megha_Assignment12_Prog3 megha_Assignment12 = new Megha_Assignment12_Prog3();
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the String : ");
		String name = sc.nextLine();
		megha_Assignment12.findFirstNonRepeatingCharInString(name);
		System.out.println();

		System.out.print("Enter the String : ");
		String name1 = sc.nextLine();
		megha_Assignment12.findFirstRepeatingCharInString(name1);
		System.out.println();

		System.out.print("Enter the String : ");
		String name2 = sc.nextLine();
		megha_Assignment12.reverseString(name2);
		System.out.println();

		sc.close();

	}

}
