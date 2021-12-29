package monikaArkade;

public class A13_Assignment13 {

	int count;
	char store;

	void nonRepeatingChar(String input) {
		System.out.println("The Unique characters are :");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.print(ch + " ");
			}
		}
	}

	void repeatingChar(String input) {
		System.out.println("The Duplicate characters are :");
		for (int index = 0; index <= input.length() - 1; index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) != input.lastIndexOf(ch) && input.indexOf(ch) == index) {
				System.out.print(ch + " ");
			}
		}
	}

	void firstUniqueChar(String input) {
		System.out.println("The first Unique character is :");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.print(ch + " ");
				break;
			}
		}
	}

	void firstDuplicateChar(String input) {
		System.out.println("The Duplicate characters are :");
		for (int index = 0; index <= input.length() - 1; index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) != input.lastIndexOf(ch) && input.indexOf(ch) == index) {
				System.out.print(ch + " ");
				break;
			}
		}
	}

	public static void main(String[] args) {
		A13_Assignment13 character = new A13_Assignment13();
		character.nonRepeatingChar("technocredits");
		System.out.println();
		character.repeatingChar("technocredits");
		System.out.println();
		character.firstUniqueChar("technocredits");
		System.out.println();
		character.firstDuplicateChar("technocredits");
	}
}
