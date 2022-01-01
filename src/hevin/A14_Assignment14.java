package hevin;

import java.util.Scanner;

class A14_Assignment14 {

	void getDuplicateChar(String str) {
		int unique = 0;
		int duplicate = 0;
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				if(str.indexOf(ch) != str.lastIndexOf(ch))
					duplicate++;
				else
					unique++;
			}
		}
		if(duplicate > unique)
			System.out.println("--> Java");
		else
			System.out.println("--> Selenium");
	}

	public static void main(String[] args) {
		A14_Assignment14 A14_Assignment14 = new A14_Assignment14();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr a String: ");
		String str = sc.nextLine();
		A14_Assignment14.getDuplicateChar(str);
		sc.close();
	}
}