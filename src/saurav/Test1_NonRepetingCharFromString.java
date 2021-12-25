package saurav;

public class Test1_NonRepetingCharFromString {

	int getCountOfChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		return count;
	}

	void firstNonRepetingChar(String input) {
		char letter = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = getCountOfChar(input, ch);
			if (count == 1) {
				letter = ch;
				break;
			}
		}
		System.out.println(letter);
	}

	public static void main(String[] a) {
		Test1_NonRepetingCharFromString prime = new Test1_NonRepetingCharFromString();
		prime.firstNonRepetingChar("technocreditsF");
	}
}
