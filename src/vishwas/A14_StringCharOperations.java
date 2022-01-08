package vishwas;

import java.util.Scanner;

public class A14_StringCharOperations {
	int dupCount = 0, uniqCount = 0;

	void getAllDuplicateChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (index == input.indexOf(ch))
				if (input.indexOf(ch) != input.lastIndexOf(ch))
					dupCount++;
		}
	}

	void getAllUniqueChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				uniqCount++;
		}
	}

	void printResult() {
		if (dupCount > uniqCount)
			System.out.println("Java");
		else
			System.out.println("Selenium");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.next();
		A14_StringCharOperations a14_StringCharOperations = new A14_StringCharOperations();
		a14_StringCharOperations.getAllDuplicateChar(str);
		a14_StringCharOperations.getAllUniqueChar(str);
		a14_StringCharOperations.printResult();
		sc.close();
	}
}
