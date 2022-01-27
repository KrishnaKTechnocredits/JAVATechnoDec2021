package rahulGavali;

/*Assignment - 13: 
Write a program to satisfy below requirement using indexOf and lastIndexOf method.
1. Print all duplicate characters from given string.
2. Print all unique characters from given string.
3. Return first unique character from given string.
4. Return first duplicate character from given string.*/



public class A13_StringMethods {

	void printDuplicateChars(String input) {
		System.out.print("Duplicate characters in the string are: ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
				if (input.indexOf(ch) == index)
					if (input.indexOf(ch) != input.lastIndexOf(ch))
					System.out.print(ch + " ");
			}
	}

	void printUniqueChars(String input) {
		System.out.print("\nUnique characters in the string are: ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				System.out.print(ch + " ");
		}
		System.out.println();
	}

	char printFirstUniqueChar(String input) {
		System.out.print("First unique character in the string is: ");
		char ch = ' ';
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				break;
		}
		return ch;
	}

	char printFirstDuplicateChar(String input) {
		System.out.print("First duplicate character in the string is: ");
		char ch = ' ';
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (input.indexOf(ch) != input.lastIndexOf(ch))
				break;
		}
		return ch;
	}

	public static void main(String[] args) {
		A13_StringMethods stringMethods = new A13_StringMethods();
		stringMethods.printDuplicateChars("technocredits");
		stringMethods.printUniqueChars("technocredits");
		System.out.println(stringMethods.printFirstUniqueChar("technocredits"));
		System.out.println(stringMethods.printFirstDuplicateChar("technocredits"));
	}

}