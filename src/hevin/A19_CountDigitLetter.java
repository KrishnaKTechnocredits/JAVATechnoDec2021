package hevin;

public class A19_CountDigitLetter {

	void getCount(String input) {
		
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

		System.out.println("Total Letters in String           : " + totalLetterCount);
		System.out.println("Total UpperCase letters in String : " + totalUpperCaseCount);
		System.out.println("Total LowerCase letters in String : " + totalLowerCaseCount);
		System.out.println("Total digit count in String       : " + totalDigitCount);
		System.out.println("==============================================================");
		System.out.println("Total count of String : " + count);
	}

	public static void main(String[] args) {
		A19_CountDigitLetter a19 = new A19_CountDigitLetter();
		a19.getCount("TE1ch2noC2red9iTs");
	}
}