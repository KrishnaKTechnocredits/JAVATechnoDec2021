package ashwini_A24;

public class Program7 {

	void reverseCaseOfEachChar(String str) {
		String outputString = "";
		char ch;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			}
			outputString += ch;
		}
		System.out.println("Expected output string 	: " + outputString);
	}

	public static void main(String[] args) {
		Program7 program7_ReverseCaseOfChar = new Program7();
		String inputString = "TeCHnoC";
		System.out.println("Input String 		: " + inputString);
		program7_ReverseCaseOfChar.reverseCaseOfEachChar(inputString);
	}
}
