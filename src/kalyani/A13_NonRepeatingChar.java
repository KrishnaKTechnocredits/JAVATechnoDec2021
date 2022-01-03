
package kalyani;

import java.util.Scanner;

public class A13_NonRepeatingChar {

	void findNonRepeatingChars(String str) {
		System.out.println("Non Repeating Character : ");
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				System.out.print(ch + " ");
		}
	}

	public static void main(String[] args) {
		A13_NonRepeatingChar nonrepeatingchar = new A13_NonRepeatingChar();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		nonrepeatingchar.findNonRepeatingChars(str);
		sc.close();
	}
}

