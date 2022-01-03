package archana;

import java.util.Scanner;

public class Ass14_DuplicateCharContains {
	char ch;
	int Dupcount = 0;
	int count = 0;
	void DuplicateChar(String name) {

		for (int index = 0; index < name.length(); index++) {
			ch = name.charAt(index);
			if (name.indexOf(ch) != name.lastIndexOf(ch)) {
				Dupcount++;
			} else {
				count++;
			}

		}

		if (Dupcount > count) {
			System.out.println(": java");
		} else {
			System.out.println(" : selenium");
		}

	}

	public static void main(String[] a) {

		Ass14_DuplicateCharContains ass14 = new Ass14_DuplicateCharContains();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string : ");
		String input = sc.next();
		ass14.DuplicateChar(input);
		System.out.println("Enter the input string : ");
		String input2 = sc.next();
		ass14.DuplicateChar(input2);
		sc.close();
	}

}
