
/*	Assignment - 13 : 28th Dec'2021
Write a program to satisfy below requirement using indexOf and lastIndexOf method. 
1. Print all duplicate characters from the given string.
2. Print all unique characters from a given string.
3. Return the first unique character from the given string.
4. Return the first duplicate character from the given string. 
*/

package amruta.Assignment_10to14;
class StringIndexMethods {

	// 1. Print all duplicate characters from the given string.
	// 1st Logic
	void printDuplicateChar(String input) {
		System.out.println("Duplicate characters from given string " + input + " are :");
		System.out.println("-------------------------------------------------------------------");
		String str = input.toLowerCase();

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			int count = 0;
			if (str.indexOf(ch) == index) {

				for (int innerindex = 0; innerindex < str.length(); innerindex++) {
					if (str.charAt(innerindex) == ch)
						count++;
				}
			}
			if (count > 1)
				System.out.println(ch);
		}
	}

	// 2nd Logic
	void duplicate(String input) {
		System.out.println("\n Duplicate characters from given string" + input + " are :");
		System.out.println("-------------------------------------------------------------------");
		String str = input.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (str.indexOf(ch) != str.lastIndexOf(ch))
				System.out.println(ch);
		}
	}

	// 2. Print all unique characters from a given string.
	// 1st Logic
	void printUniqueCharacter(String input) {
		System.out.println("\nUnique characters from given string " + input + " are :");
		System.out.println("-------------------------------------------------------------------");
		String name = input.toLowerCase();
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);

			if (name.indexOf(ch) == index) {
				int count = 0;
				for (int innerindex = 0; innerindex < name.length(); innerindex++) {
					if (name.charAt(innerindex) == ch)
						count++;
				}
				if (count == 1)
					System.out.println(ch + " ");
			}
		}
	}

	// 2nd Logic
	void printUniqueChar2(String input) {
		System.out.println("\nUnique characters from given string " + input + " are :");
		System.out.println("-------------------------------------------------------------------");
		String str = input.toLowerCase();
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch))
				System.out.println(ch);
		}
	}

	// 3. Return the first unique character from the given string.

	void printFirstUniqueChar(String input) {
		System.out.println("\nFirst Unique character from given string " + input + " is :");
		System.out.println("-------------------------------------------------------------------");
		String str = input.toLowerCase();
		
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				if (str.indexOf(ch) == str.lastIndexOf(ch)) {
					System.out.println(ch);
					break;
				}
			}
	}

	// 4. Return the first duplicate character from the given string.

	void printFirstDuplicateChar(String input) {
		System.out.println("\nFirst Duplicate character from given string " + input + " is :");
		System.out.println("-------------------------------------------------------------------");
		String str = input.toLowerCase();

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				System.out.println(ch);
				break;
			}	
		}
	}

	public static void main(String[] args) {
		
		StringIndexMethods stringindexmethods = new StringIndexMethods();
		stringindexmethods.printDuplicateChar("teChNOcreDItS");
		stringindexmethods.duplicate("teChNOcreDItS");

		stringindexmethods.printUniqueCharacter("teChNOcreDItS");
		stringindexmethods.printUniqueChar2("teChNOcreDItS");

		stringindexmethods.printFirstUniqueChar("teChNOcreDItS");
		stringindexmethods.printFirstDuplicateChar("teChNOcreDItS");
	}
}