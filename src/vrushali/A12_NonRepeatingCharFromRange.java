package vrushali;

import java.util.Scanner;

public class A12_NonRepeatingCharFromRange {
	
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
	
	public static void main(String[] args) {
		A12_NonRepeatingCharFromRange nonRepeatingChar= new A12_NonRepeatingCharFromRange();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String: ");
		String name = scanner.next();
		nonRepeatingChar.findFirstNonRepeatingCharInString(name);
	}
}
