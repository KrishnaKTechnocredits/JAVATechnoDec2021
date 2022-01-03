/*Assignment - 13 : 28th Dec'2021

Write a program to satisfy below requirement using indexOf and lastIndexOf method.

1. Print all duplicate characters from given string.
2. Print all unique characters from given string.
3. Return first unique character from given string.
4. Return first duplicate character from given string. 
 * 
 */
package shwetaDharmadhikari.array_examples;
import java.util.*;
public class Assign_13_PrintCharacters {

	void displayDuplicateCharacter(String input) {
		System.out.println("Duplicate character in string :");
		for (int index = 0; index < input.length();index++) {
			if (input.indexOf(input.charAt(index)) != input.lastIndexOf(input.charAt(index))){
				System.out.println(input.charAt(index));
			}
		}
	}
	
	void displayUniqueCharacter(String input) {
		System.out.println("Unique character in string :");
		for (int index = 0; index < input.length();index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index))){
				System.out.println(input.charAt(index));
			}
		}
	}
	
	void displayFirstUniqueCharacter(String input) {
		for (int index = 0; index < input.length();index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index))){
				System.out.println("First unique character is :"+input.charAt(index));
				break;
			}
		}
	}
	
	void displayFirstDuplicateCharacter(String input) {
		for (int index = 0; index < input.length();index++) {
			if (input.indexOf(input.charAt(index)) != input.lastIndexOf(input.charAt(index))){
				System.out.println("First duplicate character is :"+input.charAt(index));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assign_13_PrintCharacters assign_13_PrintCharacters = new Assign_13_PrintCharacters();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		assign_13_PrintCharacters.displayDuplicateCharacter(str);
		assign_13_PrintCharacters.displayUniqueCharacter(str);
		assign_13_PrintCharacters.displayFirstUniqueCharacter(str);
		assign_13_PrintCharacters.displayFirstDuplicateCharacter(str);
	}

}
