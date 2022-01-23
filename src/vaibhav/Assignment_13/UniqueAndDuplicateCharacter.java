/* Assignment - 13 : 28th Dec'2021

Write a program to satisfy below requirement using indexOf and lastIndexOf method.
1. Print all duplicate characters from the given string.
2. Print all unique characters from a given string.
3. Return the first unique character from the given string.
4. Return the first duplicate character from the given string.

*/

package vaibhav.Assignment_13;

public class UniqueAndDuplicateCharacter {

	void printAllDuplicateCharacters(String str) {
		char ch;
		System.out.println("All duplicate characters form given string \"" + str + "\" are as below : ");
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				if (index == str.indexOf(ch)) {
					System.out.print(ch + ", ");
				}
			}
		}
		System.out.println("\n");
	}

	void printAllUniqueCharacters(String str) {
		char ch;
		System.out.println("All unique characters form given string \"" + str + "\" are as below : ");
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				if (index == str.indexOf(ch)) {
					System.out.print(ch + ", ");
				}
			}
		}
		System.out.println("\n");
	}

	char firstUniqueCharacter(String str) {
		char ch = ' ';
		// boolean uniqueFlag = false;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				if (index == str.indexOf(ch)) {
					// uniqueFlag = true;
					return ch;
				}
			}
		}
		return ch;
	}
	
	char firstDuplicateCharacter(String str) {
		char ch = ' ';
		// boolean duplicateFlag = false;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				if (index == str.indexOf(ch)) {
					// duplicateFlag = true;
					return ch;
				}
			}
		}
		return ch;
	}

	public static void main(String[] args) {

		UniqueAndDuplicateCharacter uniqueAndDuplicateCharacter = new UniqueAndDuplicateCharacter();
		String inputString = "ateczhnoabcdabccreditts";
		uniqueAndDuplicateCharacter.printAllDuplicateCharacters(inputString);
		uniqueAndDuplicateCharacter.printAllUniqueCharacters(inputString);
		char firstUniqueChar = uniqueAndDuplicateCharacter.firstUniqueCharacter(inputString);
		char firstDuplicateChar = uniqueAndDuplicateCharacter.firstDuplicateCharacter(inputString);
		System.out.println("First unique character form given string '"+inputString+"' is 		: "+ firstUniqueChar);
		System.out.println("\nFirst duplicate character form given string '"+inputString+"' is	: "+ firstDuplicateChar);

	}

}
