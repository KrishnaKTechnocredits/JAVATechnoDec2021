package saurav;

public class A11_numOccurance {
	int count = 0;

	int printFirstOccuranceOfChar(String name, char ch) {
		int charIndex = -1;
		for (int index = 0; index < name.length(); index++) {
			if (name.charAt(index) == ch) {
				charIndex = index;
				System.out.println("First occurrence of " + ch + " is at " + charIndex + " index");
				break;
			}
		}
		return charIndex;

	}

	int printLastOccuranceOfChar(String input, char ch) {
		int charIndex = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				charIndex = index;

			}

		}
		System.out.println(charIndex);
		return charIndex;
	}

	boolean charIsFoundOrNot(String input, char ch) {
		boolean flag = true;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				System.out.println(true);
				flag = false;
				break;
			}
		}
		if (flag == true) {
			System.out.println(false);
		}
		return false;
	}

	int getTotalOccuranceOfChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println(count);

		return count;
	}

	public static void main(String[] a) {
		A11_numOccurance numoccurancc = new A11_numOccurance();
		numoccurancc.printFirstOccuranceOfChar("technocredits", 'c');
		numoccurancc.printLastOccuranceOfChar("teicdhnfocredits", 's');
		numoccurancc.charIsFoundOrNot("technocredits", 'd');
		numoccurancc.getTotalOccuranceOfChar("technocccredits", 'c');
	}
}