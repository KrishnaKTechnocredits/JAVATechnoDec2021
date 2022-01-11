package tanu;

import java.util.Scanner;

class Assignment13 {
	void douplicateCharacter(String name) {
		char i;
		for (int index = 0; index < name.length(); index++) {
			i = name.charAt(index);
			if (name.indexOf(i) != name.lastIndexOf(i)) {

				System.out.println(i + "  is duplicate character in " + name);
			}

		}
	}

	void uniqueCharacter(String name) {
		char i;
		for (int index = 0; index < name.length(); index++) {
			i = name.charAt(index);
			if (name.indexOf(i) == name.lastIndexOf(i)) {

				System.out.println(i + "  is unique character in " + name);
			}

		}

	}

	void firstUniqueCharacter(String name) {
		char i;
		for (int index = 0; index < name.length(); index++) {
			i = name.charAt(index);
			if (name.indexOf(i) == name.lastIndexOf(i)) {

				System.out.println(i + "  is First unique character in " + name);
				break;
			}

		}

	}

	void firstDuplicateCharacter(String name) {
		char i;
		for (int index = 0; index < name.length(); index++) {
			i = name.charAt(index);
			if (name.indexOf(i) != name.lastIndexOf(i)) {

				System.out.println(i + "  is First duplicate character in " +  name);
				break;
			}

		}

	}

	public static void main(String[] arg) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String userInput = input.next();
		Assignment13 assignment = new Assignment13();
		assignment.douplicateCharacter(userInput);
		System.out.println("Enter a string");
		String userInput1 = input.next();
		assignment.uniqueCharacter(userInput1);
		System.out.println("Enter a string");
		String userInput2 = input.next();
		assignment.firstUniqueCharacter(userInput2);
		System.out.println("Enter a string");
		String userInput3 = input.next();
		assignment.firstDuplicateCharacter(userInput3);
		
	}
}
