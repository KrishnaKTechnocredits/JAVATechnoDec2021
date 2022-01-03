package nehaPandey;

import java.util.Scanner;

public class A12_P1_Scanner_Example {
	int count = 0;

	void findFrequency(String str) {

		for (int x = 0; x < str.length(); x++) {
			char ch = str.charAt(x);

			for (int y = 0; y < str.length(); y++) {

				if (ch == str.charAt(y)) {
					count++;
				}
			}
			System.out.println("Total count of " + ch +" is: " + count);
			count = 0;
		}
	}

	public static void main(String[] args) {
		A12_P1_Scanner_Example se = new A12_P1_Scanner_Example();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter string: ");
		String v = scanner.next();
		scanner.close();
		se.findFrequency(v);

	}

}
