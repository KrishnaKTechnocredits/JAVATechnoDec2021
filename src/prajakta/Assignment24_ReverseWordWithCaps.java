package prajakta;

public class Assignment24_ReverseWordWithCaps {
	String reverseString(String data) {
		String revString = "";
		for (int index = data.length() - 1; index >= 0; index--) {
			char ch = data.charAt(index);
			if (index == data.length() - 1)
				ch = Character.toUpperCase(ch);
			revString += ch;
		}
		return revString;
	}

	void spiltWordsInString(String input) {
		String[] str = input.split(" ");
		String temp1 = "";
		for (int index = 0; index < str.length; index++) {
			temp1 = temp1 + " " + reverseString(str[index]);
		}
		System.out.println(temp1.trim());
	}

	public static void main(String[] args) {
		Assignment24_ReverseWordWithCaps ass24_6 = new Assignment24_ReverseWordWithCaps();
		ass24_6.spiltWordsInString("Vrushali Sagar Shital");
	}
}