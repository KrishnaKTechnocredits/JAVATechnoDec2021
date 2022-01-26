package nehaPandey;

public class Assignment23_Program4 {
	void findTheDifferenceBetweenOddAndEvenDigitsFromGivenString(String str) {

		int evenSum = 0;
		int oddSum = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int num = (Character.getNumericValue(ch));

				if (num % 2 == 0) {
					evenSum = evenSum + num;
				} else {
					oddSum = oddSum + num;
				}
			}
		}
		int sum = oddSum - evenSum;
		System.out.println("Difference between odd and even digits from given string: " + sum);

	}

	public static void main(String[] args) {
		Assignment23_Program4 program4 = new Assignment23_Program4();
		program4.findTheDifferenceBetweenOddAndEvenDigitsFromGivenString("tec5hno3cre6di1ts");

	}
}
