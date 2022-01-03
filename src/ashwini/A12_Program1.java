package ashwini;

import java.util.Scanner;

class A12_Program1 {
	void getOccurenceOfAllChar(String s2) {
		String charisPresent = "";
		int nameLength = s2.length();
		for (int i = 0; i < nameLength; i++) {
			char ch = s2.charAt(i);
			int count = 0;
			for (int a = i; a < nameLength; a++) {
				if (s2.charAt(a) == ch)
					count++;
			}
			if (isAlreadyPresent(charisPresent, ch) == false)
				System.out.println(ch + " is present : " + count + " times");
			charisPresent = charisPresent + ch;
		}
	}

	boolean isAlreadyPresent(String charisPresent, char ch) {
		for (int i = 0; i < charisPresent.length(); i++) {
			if (charisPresent.charAt(i) == ch)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		A12_Program1 p = new A12_Program1();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String input:");
		String s = sc.nextLine();
		p.getOccurenceOfAllChar(s);
		sc.close();
	}

}
