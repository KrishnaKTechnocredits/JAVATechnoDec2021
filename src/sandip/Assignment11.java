package sandip;

public class Assignment11 {
	int firstOccurance(String input, char ch) {
		int charIndex = -1;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				charIndex = index;
				break;
			}
		}
		return charIndex;
	}

	int lastOccurance(String input, char ch) {
		int charIndex = -1;
		for (int index = input.length() - 1; index >= 0; index--) {
			if (input.charAt(index) == ch) {
				charIndex = index;
				break;
			}
		}
		return charIndex;
	}

	boolean presentCharacter(String input, char ch) {
		boolean flag = false;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	int totalOccurance(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment11 returnmethod = new Assignment11();
		int temp1 = returnmethod.firstOccurance("technocredits", 'c');
		if (temp1 == -1) {
			System.out.println("Character not found");
		} else {
			System.out.println("Character occurance at index : " + temp1);
		}

		int temp2 = returnmethod.lastOccurance("technocredits", 'c');
		if (temp1 == -1) {
			System.out.println("Character not found");
		} else {
			System.out.println("Character occurance at index : " + temp2);
		}

		boolean tempFlag = returnmethod.presentCharacter("sandip", 'n');
		System.out.println("Character presence : " + tempFlag);

		int temp3 = returnmethod.totalOccurance("technocredits", 'c');
		System.out.println("Total occurance : " + temp3);
	}

}
