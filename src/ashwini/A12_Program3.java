package ashwini;

import java.util.Scanner;

class A12_Program3 {
	void firstNonReapeatingChar(String s) {
		char ch = ' ';
		int nameLength = s.length();
		for (int index = 0; index < nameLength; index++) {
			char ch1 = s.charAt(index);
			int count = 0;
			for (int index1 = index; index1 < nameLength; index1++) {
				if (s.charAt(index1) == ch1)
					count++;
			}
			if (count == 1) {
				ch = s.charAt(index);
				break;
			}
		}
		System.out.println("The first Non Repeating Character in " + s + " is : " + ch);
	}

	public static void main(String[] args) {
		A12_Program3 p = new A12_Program3();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String s1 = sc.nextLine();
		p.firstNonReapeatingChar(s1);
		System.out.println();
	}
}