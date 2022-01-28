package ashwini_A24;

public class Program4 {

	String reverseString(String str) {
		String outputString = "";
		char ch;
		for (int index = str.length() - 1; index >= 0; index--) {
			ch = str.charAt(index);
			outputString += ch;
		}
		return outputString;
	}

	void getExpectedString(String str) {
		String[] inputArr = str.split(" ");
		String expectedString = "";
		for (int index = 0; index < inputArr.length; index++) {
			expectedString = expectedString + " " + reverseString(inputArr[index]);
		}
		System.out.println("Expected output String	: " + expectedString.trim());
	}

	public static void main(String[] args) {
		Program4 program4_ReverseEachWord = new Program4();
		String inputString = "Hi techno hello";
		System.out.println("Input String 		: " + inputString);
		program4_ReverseEachWord.getExpectedString(inputString);
	}
}
