package apurva;

public class A23_OddNumberCapsLetterEvenNumber {
	void getResultofString(String str) {
		String temp = "";
		int input;
		String oddNumber = "";
		String evenNumber = "";
		String capLetter = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
				input = Integer.parseInt(temp);
				if (input % 2 == 0) {
					evenNumber += temp;
					temp = "";
				} else
					oddNumber += temp;
				temp = "";
			}
		}
		for (int innerIndex = 0; innerIndex < str.length(); innerIndex++) {
			String tempString = "";
			char c = str.charAt(innerIndex);
			if (Character.isLetter(c) && Character.isUpperCase(c)) {
				tempString += c;
				capLetter = tempString;
				tempString = "";
				break;
			}
		}
		System.out.println("String after adjusting: " + oddNumber + capLetter + evenNumber);
	}

	public static void main(String[] args) {
		String s = "eTe1CH9cred4it6s";
		System.out.println("Input String is: " + s);
		new A23_OddNumberCapsLetterEvenNumber().getResultofString(s);
	}

}
