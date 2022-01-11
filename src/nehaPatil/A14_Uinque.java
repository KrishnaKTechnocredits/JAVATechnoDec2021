package nehaPatil;

import java.util.Scanner;

public class A14_Uinque {
	
	void findDuplicateGreaterThanUnique(String str) {
		int uniqueCount = 0;
		int duplicateCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				if (str.indexOf(ch) != str.lastIndexOf(ch))
					duplicateCount++;
				else
					uniqueCount++;
			}
		}

		if (duplicateCount > uniqueCount)
			System.out.println("Java");
		else
			System.out.println("Selenium");
	}

	public static void main(String[] args) {
		A14_Uinque a14_uinque = new A14_Uinque();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		String str = sc.nextLine();
	a14_uinque.findDuplicateGreaterThanUnique(str);
		sc.close();
	}

}
