package sagarShrikhande.arrayAndStrings;

public class A23_P4_DiffEvenOddDigitsString {

	int getDiffOfOddEvenDigits(String input) {
		int oddSum = 0;
		int evenSum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				String tempString = ch + "";
				int temp = Integer.parseInt(tempString);
				if (temp % 2 == 0)
					evenSum = evenSum + temp;
				else
					oddSum = oddSum + temp;
			}
		}
		return oddSum - evenSum;
	}

	public static void main(String[] args) {
		A23_P4_DiffEvenOddDigitsString a23_P4_DiffEvenOddDigitsString = new A23_P4_DiffEvenOddDigitsString();
		String input = "tec5hno3cre6di1ts";
		System.out.println(
				"Diff of sum of odd & Even Digits: " + a23_P4_DiffEvenOddDigitsString.getDiffOfOddEvenDigits(input));
	}
}

/*
 * Program 4 : Find the difference between odd and even digits from given
 * string. input : tec5hno3cre6di1ts output : 3 Hint : (5+3+1)-(6) = 9-6
 */
