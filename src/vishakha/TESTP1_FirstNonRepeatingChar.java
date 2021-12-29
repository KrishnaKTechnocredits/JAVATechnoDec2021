package vishakha;

public class TESTP1_FirstNonRepeatingChar {
	int stringOccur(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void firstSingleOccur(String input) {
		char c = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = stringOccur(input, ch);
			if (count == 1) {
				c = ch;
				break;

			}
		}
		System.out.println("first character occuring once in given string is: " + c);
	}

	public static void main(String[] a) {
		TESTP1_FirstNonRepeatingChar firstNonRepeatingChar = new TESTP1_FirstNonRepeatingChar();
		firstNonRepeatingChar.firstSingleOccur("technocredits");

	}

}