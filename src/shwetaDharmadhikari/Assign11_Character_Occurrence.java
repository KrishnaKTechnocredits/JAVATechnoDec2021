/*
 * 	Assignment - 11 : 24rd Dec'2021

Write a program with following methods.

1. create a method to return first occurrence of given character from given string.
2. create a method to return last occurrence of given character from given string.
3. create a method to return true if given character is found from given string else return false.
4. create a method to return total occurrence of given character from given string.
 */
package shwetaDharmadhikari;

import java.util.Scanner;

public class Assign11_Character_Occurrence {

	int firstOccuranceofCharInString(String name, char ch) {
		int indexChar = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch) {
				indexChar = index + 1;
				break;
			}
		}
		return indexChar;
	}

	int lastOccuranceofCharInString(String name, char ch) {
		int indexChar = 0;
		for (int index = name.length() - 1; index > 0; index--) {
			if (name.charAt(index) == ch) {
				indexChar = index + 1;
				break;
			}
		}
		return indexChar;
	}

	boolean checkCharIsPresentInString(String name, char ch) {
		boolean flag = false;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch) {
				flag = true;
			}
		}
		return flag;
	}

	int totalOccuranceofCharInString(String name, char ch) {
		int indexChar = 0;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch) {
				indexChar++;
			}
		}
		return indexChar;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String str = sc.nextLine();
		Assign11_Character_Occurrence assign11_Character_Occurrence = new Assign11_Character_Occurrence();
		System.out.println("First occurance of char in given string is : "
				+ assign11_Character_Occurrence.firstOccuranceofCharInString(str, 'a'));
		System.out.println("Last occurance of char in given string is  : "
				+ assign11_Character_Occurrence.lastOccuranceofCharInString(str, 'a'));
		System.out.println("Total char count in string is : "
				+ assign11_Character_Occurrence.totalOccuranceofCharInString(str, 'a'));
		System.out.println("Is Given Character present In String : "
				+ assign11_Character_Occurrence.checkCharIsPresentInString(str, 'a'));
	}
}