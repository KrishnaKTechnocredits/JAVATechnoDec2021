/*Assignment 24 - 16th Jan 2022

Program 1. WAP to find out total words in a given string & print each word with its length
Input    : Hi Hello
Output : Total 2 words
              Hi --> 2
              Hello --> 5

Program 2. WAP to find our total vowels in each word from the given string
Input    : aashvi technocredits
Output : aashvi --> 3
              technocredits --> 4

Program 3. WAP to retuen array of words containing only digits.
Input    : "Te1c2h C94re3"
Output : "12" "943"
 */

package pallavi;

import java.util.Arrays;

public class A24_StringSimple1_3 {

	// Program 1. WAP to find out total words in a given string & print each word
	// with its length

	void findLength(String str) {
		String[] arr = str.split(" ");
		System.out.println("Total " + arr.length + " words");
		for (int index = 0; index < arr.length; index++) {
			System.out.println(arr[index] + " -> " + arr[index].length());
		}
	}

	// Program 2. WAP to find our total vowels in each word from the given string

	void findVowels(String str) {
		int count = 0;
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			count = 0;
			for (int innerIndex = 0; innerIndex < arr[index].length(); innerIndex++) {
				char ch = arr[index].charAt(innerIndex);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					count++;
			}
			System.out.println(arr[index] + " -> " + count);
		}
	}

	// Program 3. WAP to return array of words containing only digits.

	String[] getDigits(String str) {
		String[] arr = str.split(" ");
		String[] output = new String[arr.length];

		for (int index = 0; index < arr.length; index++) {
			String tempStr = "";
			for (int innerIndex = 0; innerIndex < arr[index].length(); innerIndex++) {
				char ch = arr[index].charAt(innerIndex);
				if (Character.isDigit(ch))
					tempStr += ch;
			}
			output[index] = tempStr;
		}
		return output;
	}

	public static void main(String[] args) {
		A24_StringSimple1_3 a24_StringSimple = new A24_StringSimple1_3();

		System.out.println("-------Prog1-----------");
		String input = "Hi Hello";
		System.out.println("Input string:- " + input);
		a24_StringSimple.findLength(input);

		System.out.println("-------Prog2-----------");
		input = "aashvi technocredits";
		System.out.println("Input string:- " + input);
		a24_StringSimple.findVowels(input);

		System.out.println("-------Prog3-----------");
		input = "Te1c2h C94re3";
		System.out.println("Input string:- " + input);
		String[] output = a24_StringSimple.getDigits(input);
		System.out.println("Output: " + Arrays.toString(output));
	}

}
