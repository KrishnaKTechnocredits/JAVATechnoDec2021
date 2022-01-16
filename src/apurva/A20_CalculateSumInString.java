package apurva;

/*Write a method to print sum of all digits in a given String.
Input : tech1noc9red3its
Output : 13

Hint : 1+9+3*/

public class A20_CalculateSumInString {

	void displaySumofDigitsInString() {
		String input = "tech1noc9red3its";
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		System.out.println("Given String is : " + input);
		System.out.println("Sum of all the digits in given string is: " + sum);
	}

	public static void main(String[] args) {
		A20_CalculateSumInString a20_CalculateSumInString = new A20_CalculateSumInString();
		a20_CalculateSumInString.displaySumofDigitsInString();
	}
}
