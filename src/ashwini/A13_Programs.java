package ashwini;

import java.util.Scanner;

class A13_Programs {

	void allUniqueChar(String str) {
		System.out.println("Non Repeating Character : ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				System.out.print(ch + " ");
		}
	}

	void allDuplicateChar(String str) {
		System.out.println("Repeating Character : ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				System.out.print(ch + " ");
			}
		}
	}

	void firstUniquechar(String str) {
		System.out.println("firstUniquechar is : ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.print(ch);
				break;
			}
		}
	}

	void firstDuplicateChar(String str) {
		System.out.println("firstDuplicateChar : ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				System.out.print(ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		A13_Programs p1 = new A13_Programs();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		p1.allUniqueChar(str);
		System.out.println();
		p1.allDuplicateChar(str);
		System.out.println();
		p1.firstUniquechar(str);
		System.out.println();
		p1.firstDuplicateChar(str);
		sc.close();
	}
}
