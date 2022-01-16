package saurav;

public class A21_GetDigitOutputInFormOfString {

	int getSumOfDidits(String input) {
		int count = 0;
		int sum = 0;
		String temp = " ";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(input.charAt(index));
				temp = temp + input.charAt(index);
			}
		}
		// System.out.println("Sum of all digits from given String = " + sum);
		System.out.println("String of all Digit : " + temp);
		return count;
	}

	public static void main(String[] a) {
		new A21_GetDigitOutputInFormOfString().getSumOfDidits("T1E2c3h4n5o6C7r8e9d0i1T2s");
	}

}
