/* Assignment - 12 : 26th Dec'2021 

Write 4 different programs to satisfy below requirements, please take input from user using Scanner class.

3. find the first non repeating character from given string. [program-3]
   input : technocredits
   output : h
   
4. find the first repeating character from given string. [program-3]
   input : shivangi
   output : i

*/


package vaibhav.Assignment_12;

import java.util.Scanner;

public class RepeatingAndNonRepeatingCharacter {

	int getCharfrequency(String input, char ch) {
		int count = 0;

		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void getFirstRepeatingChar(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (getCharfrequency(input, ch) != 1) {
				System.out.println("First repeating character from given string " + input + " is : " + ch);
				break;
			}
		}

	}

	void getFirstNonRepeatingChar(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (getCharfrequency(input, ch) == 1) {
				System.out.println("First non-repeating character from given string " + input + " is : " + ch);
				break;
			}
		}

	}

	public static void main(String[] args) {
		RepeatingAndNonRepeatingCharacter repeatingAndNonRepeatingCharacter = new RepeatingAndNonRepeatingCharacter();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the input string to find the first repeating character : ");
		repeatingAndNonRepeatingCharacter.getFirstRepeatingChar(scanner.next());
		System.out.println("-----------------------------------------------------");
		System.out.println("Enter the input string to find the first non - repeating character : ");
		repeatingAndNonRepeatingCharacter.getFirstNonRepeatingChar(scanner.next());
		scanner.close();
	}

}
