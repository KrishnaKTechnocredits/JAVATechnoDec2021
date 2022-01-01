package ranjeet;

public class ExampleOfStringIndexMethod {

	void uniqueCharacterFromString(String str) {
		for (int index = 0; index < str.length(); index++) {
			if (str.indexOf(str.charAt(index)) == str.lastIndexOf(str.charAt(index))) {
				System.out.print(str.charAt(index));
			}
		}
	}

	char firstUniqueCharacter(String str) {
		char ch = 'a';
		for (int index = 0; index < str.length(); index++) {
			if (str.indexOf(str.charAt(index)) == str.lastIndexOf(str.charAt(index))) {
				System.out.println(str.charAt(index));
				ch = str.charAt(index);
				break;
			}
		}

		return ch;
	}

	void duplicateCharacterFromString(String str) {

		for (int index = 0; index < str.length(); index++) {
			if (str.indexOf(str.charAt(index)) != str.lastIndexOf(str.charAt(index))) {
				System.out.println(str.charAt(index));

			}
		}
	}

	char firstDuplicateCharacter(String str) {
		char ch = 'b';
		for (int index = 0; index < str.length(); index++) {
			if (str.indexOf(str.charAt(index)) != str.lastIndexOf(str.charAt(index))) {
				System.out.print(str.charAt(index));
				ch = str.charAt(index);
				break;
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		ExampleOfStringIndexMethod e = new ExampleOfStringIndexMethod();
		e.uniqueCharacterFromString("technocredits");
		e.firstUniqueCharacter("technocredits");
		e.duplicateCharacterFromString("technocredits");
		e.firstDuplicateCharacter("technocredits");
	}
}
