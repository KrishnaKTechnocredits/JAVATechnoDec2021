package rahulGavali;

public class FirstNonRepeatingChar {
	int stringOccuurrence(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}

		return count;
	}

	void firstSingleOccurrence(String input) {
		char c = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = stringOccuurrence(input, ch);
			if (count == 1) {
				c = ch;
				break;
			}
		}
		System.out.println("first character having single occurrence in given string is: " + c);
	}

	public static void main(String[] a) {
		FirstNonRepeatingChar firstNonRepeatingChar = new FirstNonRepeatingChar();
		firstNonRepeatingChar.firstSingleOccurrence("technocredits");

	}

}
