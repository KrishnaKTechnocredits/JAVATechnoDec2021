package nehaPandey;

public class A13_UseIndexOfAndLastIndexOf {

	void printAllDuplicateCharacters(String str) {

		String duplicateChars = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				String temp = ch + "";
				if (duplicateChars.contains(temp) != true) {
					duplicateChars = duplicateChars + " " + ch;
				}
			}
		}
		System.out.println("Duplicate Chars: -" + duplicateChars);

	}

	void printAllUniqueCharacters(String str) {

		String unique = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				unique = unique + " " + ch;

			}
		}
		System.out.println("Unique Chars: -" + unique);

	}

	char getUniqueCharacters(String str) {

		char c = ' ';
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				c = ch;
				break;

			}
		}
		return c;
	}

	char getDuplicateCharacters(String str) {

		char c = ' ';
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str.indexOf(ch) != str.lastIndexOf(ch)) {
				c = ch;
				break;

			}
		}
		return c;
	}

	public static void main(String[] args) {
		A13_UseIndexOfAndLastIndexOf a13_UseIndexOfAndLastIndexOf = new A13_UseIndexOfAndLastIndexOf();
		a13_UseIndexOfAndLastIndexOf.printAllDuplicateCharacters("LOL");
		a13_UseIndexOfAndLastIndexOf.printAllUniqueCharacters("Helloo");
		char ch = a13_UseIndexOfAndLastIndexOf.getUniqueCharacters("Helloo");
		System.out.println("First Unique Character:-" + ch);
		char ch1 = a13_UseIndexOfAndLastIndexOf.getDuplicateCharacters("Helloo");
		System.out.println("First Duplicate Character:-" + ch1);

	}

}
