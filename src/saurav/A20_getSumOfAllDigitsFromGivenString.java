package saurav;

public class A20_getSumOfAllDigitsFromGivenString {

	int getSumOfDidits(String input) {
		int count = 0;
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(input.charAt(index));
			}
		}
		System.out.println("Sum of all digits from given String = " + sum);
		return count;
	}

	public static void main(String[] a) {
		new A20_getSumOfAllDigitsFromGivenString().getSumOfDidits("TE1ch2noC2red9iTs");
	}
}
