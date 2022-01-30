/*Write a program to satisfy below requirement using indexOf and lastIndexOf method. 
1. Print all duplicate characters from the given string.
2. Print all unique characters from a given string.
3. Return the first unique character from the given string.
4. Return the first duplicate character from the given string. */


package vrushali;

import java.util.Scanner;

public class A13_PrintCharUsingIndexOf {

	void getDuplicateChar(String input) {
		char ch = ' ';
		System.out.println("All duplicate characters from the given String: ");
		boolean flag = true;

		for(int index = 0; index<= input.length()-1; index++) {
			ch = input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch))
				flag = false;
			if(flag==true)
				System.out.println(ch + "");
		}
		System.out.println("-------------------------------");
	}

	void allUniqueCharFromGivenString(String input) {
		char ch = ' ';
		System.out.println("All Unique characters: ");
		for(int index = 0; index<= input.length()-1; index++) {
			ch = input.charAt(index);
			if(input.indexOf(ch)== input.lastIndexOf(ch))
				System.out.println(ch);
		}
		System.out.println("-------------------------------");
	}

	void firstUniqueChar(String input) {
		char ch = ' ';
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.println("First unique character is : " + ch);
				break;
			}
		}
		System.out.println("--------------------------------");
	}
	
	void firstDuplicateChar(String input) {
		char ch = ' ';
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (input.indexOf(ch) != input.lastIndexOf(ch)) {
				System.out.println("First duplicate character is : " + ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		A13_PrintCharUsingIndexOf printCharUsingIndexOf = new A13_PrintCharUsingIndexOf();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String ");
		String str = sc.next();
		printCharUsingIndexOf.getDuplicateChar(str);
		printCharUsingIndexOf.allUniqueCharFromGivenString(str);
		printCharUsingIndexOf.firstUniqueChar(str);
		printCharUsingIndexOf.firstDuplicateChar(str);
	}
}
