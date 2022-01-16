package anvit;

import java.util.Scanner;

public class A13_UniqueChar {
	void findUniqueChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				System.out.print(ch + " ");
		}
	}
	
	public static void main(String[] args) {
		A13_UniqueChar a13_uniquechar = new A13_UniqueChar();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.next();
		System.out.println("Unique char are: ");
		a13_uniquechar.findUniqueChar(str);
	}
}
