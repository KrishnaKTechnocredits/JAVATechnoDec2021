/* Assignment - 20 : 6th Jan'2022

Print sum of Digits from given String.

Input : TE1ch2noC2red9iTs
output :  14

 */

package vaibhav.Assignment_20;

public class SumOfDigitsInString {

	void sumOfDigits(String input) {
		int sum = 0;
		for (int index = 0; index <= input.length() - 1; index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of digits in the given string " + input + " is : " + sum);
	}

	public static void main(String args[]) {
		SumOfDigitsInString sumOfDigitsInString = new SumOfDigitsInString();
		sumOfDigitsInString.sumOfDigits("TE1ch2noC2red9iTs");
	}
}
