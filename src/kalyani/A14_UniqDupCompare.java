package kalyani;

import java.util.Scanner;

public class A14_UniqDupCompare {

	int unique;
	int duplicate;

	void compareDuplicateAndUnique(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) 
				unique++; 
			else 
				duplicate++; 
		}
		
		System.out.println("Count of unique characters :" + unique);
		System.out.println("Count of duplicate characters :" + duplicate);
		
		if (unique > duplicate)
			System.out.println("JAVA");
		else
			System.out.println("SELENIUM");
	}

	public static void main(String[] args) {
		A14_UniqDupCompare assign14 = new A14_UniqDupCompare();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String :");
		String s1 = scanner.next();
		assign14.compareDuplicateAndUnique(s1);
		scanner.close();
	}
}