package priyankaKamble.assignment_14;

import java.util.Scanner;

public class FindDuplicate {
	static int duplicateCount = 0, uniqueCount = 0;

	int findUniqueCharCount(String input) {
		input = input.toLowerCase();
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				uniqueCount++;
			}
		}
		System.out.println("Total Unique Characters in String  "+input+ "  = " +uniqueCount);
		return uniqueCount;
	}

	int findDuplicateCharCount(String input) {
		input = input.toLowerCase();
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) != input.lastIndexOf(ch)) {
				duplicateCount++;
			}
		}
		System.out.println("Total Duplicate Characters in String  "+input+ "  = " +duplicateCount);
		return duplicateCount;
	}

	public static void main(String[] args) {
		FindDuplicate findDuplicate = new FindDuplicate();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String - ");
		String input = sc.nextLine();
		
		findDuplicate.findUniqueCharCount(input);
		findDuplicate.findDuplicateCharCount(input);
		if (duplicateCount > uniqueCount)
			System.out.println("\nOutput String = Java");
		if (duplicateCount < uniqueCount)
			System.out.println("\nOutput String =  Selenium");
		
	}
}
