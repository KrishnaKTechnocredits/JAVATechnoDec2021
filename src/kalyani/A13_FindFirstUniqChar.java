package kalyani;

import java.util.Scanner;

public class A13_FindFirstUniqChar {

	void findFirstUniqueChar(String str) {
		char ch = ' ';
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				break;
		}
		System.out.println("The First Unique Character is : " + ch);
	}

	public static void main(String[] args) {
		A13_FindFirstUniqChar findfirstuniquechar = new A13_FindFirstUniqChar();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.next();
		findfirstuniquechar.findFirstUniqueChar(str);
		sc.close();
	}
}
