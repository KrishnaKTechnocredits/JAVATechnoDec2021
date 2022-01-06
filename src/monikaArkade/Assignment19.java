//Print total Letters, Uppercase , Lowercase , Digits from given String.
package monikaArkade;

public class Assignment19 {

	void display(String input) {
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitCount = 0;
		char ch = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isLetter(input.charAt(index))) {

				if (Character.isUpperCase(input.charAt(index)))
					upperCaseCount++;
				else
					lowerCaseCount++;
			} else if (Character.isDigit(input.charAt(index)))
				digitCount++;
		}

		int totalLetters = upperCaseCount + lowerCaseCount;
		System.out.println("Total Letters are: " + totalLetters);
		System.out.println("Total Upper Case Letters: " + upperCaseCount);
		System.out.println("Total Lower Case Letters: " + lowerCaseCount);
		System.out.println("Total Digits : " + digitCount);
	}

	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.display("TE1ch2noC2red9iTs");
	}

}
