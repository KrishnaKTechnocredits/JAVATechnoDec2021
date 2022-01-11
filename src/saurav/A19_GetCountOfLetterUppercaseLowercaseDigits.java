package saurav;

public class A19_GetCountOfLetterUppercaseLowercaseDigits {

	int getCountOfAllElements(String input) {
		int count = 0;
		int totalDigitCount = 0;
		int totalLetterCount = 0;
		int totalUpperCaseCount = 0;
		int totalLowerCaseCount = 0;
		for (int index = 0; index < input.length(); index++) {
			count++;
			if (Character.isLetter(input.charAt(index))) {
				totalLetterCount++;
				if (Character.isUpperCase(input.charAt(index))) {
					totalUpperCaseCount++;
				} else {
					totalLowerCaseCount++;
				}
			} else if (Character.isDigit(input.charAt(index)))
				totalDigitCount++;
		}

		System.out.println("Total Letters in given String = " + totalLetterCount);
		System.out.println();
		System.out.println("Total UpperCase characters in given String = " + totalUpperCaseCount);
		System.out.println();
		System.out.println("Total LowerCase characters in given String = " + totalLowerCaseCount);
		System.out.println();
		System.out.println("Total digit count in given String = " + totalDigitCount);
		System.out.println();
		System.out.println("Total elements counted = " + count);
		return count;
	}

	public static void main(String[] a) {
		A19_GetCountOfLetterUppercaseLowercaseDigits assignment19 = new A19_GetCountOfLetterUppercaseLowercaseDigits();
		assignment19.getCountOfAllElements("TE1ch2noC2red9iTs");
	}
}
