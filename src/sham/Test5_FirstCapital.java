package sham;

public class Test5_FirstCapital {

	char FirstCapitalFromeString(String input) {

		char nonRepetingChar = 0;
		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);
			if (Character.isAlphabetic(ch)) {
				if (Character.isUpperCase(ch)) {
					if (input.indexOf(ch) == input.lastIndexOf(ch)) {

						nonRepetingChar += ch;
						break;
					}
				}
			}

		}
		return nonRepetingChar;

	}

	String MaxWordLength() {
		String input = "good morning technocredits hi hello";
		String[] SplittedString = input.split(" ");
		String maxLenWord = "";
		for (int index = 0; index < SplittedString.length; index++) {
			int lengthOfString = SplittedString[1].length();

			if (lengthOfString < SplittedString[index].length()) {

				lengthOfString = SplittedString[index].length();
				maxLenWord = SplittedString[index];

			}
		}

		return maxLenWord;

	}

	void sumOfAllDigitFromString(String input) {
		
		String[] digits = input.split(" ");
		int sum = 0;
		for (int index = 0; index < digits.length; index++) {
			int num = Integer.parseInt(digits[index]);
			sum = sum + num;

		}
		System.out.println("Sum of number is:" + sum);
	}

	public static void main(String[] args) {
		Test5_FirstCapital firstCapital = new Test5_FirstCapital();
		char ch = firstCapital.FirstCapitalFromeString("tEcNoCrEdits");
		System.out.println("First non Repeting char is: " + ch);

		String name = firstCapital.MaxWordLength();
		System.out.println("Max length of String is: " + name);
		
		firstCapital.sumOfAllDigitFromString("10 10 20 30");

	}

}
