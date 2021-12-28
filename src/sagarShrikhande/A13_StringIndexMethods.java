package sagarShrikhande;

import java.util.Scanner;

public class A13_StringIndexMethods {
	
	void stringIndexOpsNonRepeating(String input, boolean firstNonRepeating) {
		for (int index =0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch) == input.lastIndexOf(ch)) {
				if(firstNonRepeating == true) {
					System.out.println("First Unique Char is:" + ch);
					firstNonRepeating = false;
					System.out.println("List of all Unique chars: ");
				}
				System.out.print(ch + "  ");
				
			}
		}
		System.out.println(" ");
	}
	
	void stringIndexOpsRepeatingChar(String input,boolean firstRepeating ) {
		for (int index =0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch) != input.lastIndexOf(ch)) {			
				if(firstRepeating == true) {
					firstRepeating = false;
					System.out.println("First duplicate Char in given string is:" + ch);
					System.out.println("List of all duplicate chars: ");
				}
				if(index == input.lastIndexOf(ch)) {
					System.out.print(ch +"   ");
					
				}
				
			}
		}
	}
	
	public static void main(String[] a) {
		A13_StringIndexMethods a13_StringIndexMethods = new A13_StringIndexMethods();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input String: ");
		String input = sc.next();
		System.out.println("Enter value for firstNonRepeating flag (true/false): ");
		boolean firstNonRepeating = sc.nextBoolean();
		System.out.println("Enter value for firstRepeating flag (true/false): ");
		boolean firstRepeating = sc.nextBoolean();
		a13_StringIndexMethods.stringIndexOpsNonRepeating(input, firstNonRepeating);
		a13_StringIndexMethods.stringIndexOpsRepeatingChar(input, firstRepeating);
		sc.close();
	}

}
