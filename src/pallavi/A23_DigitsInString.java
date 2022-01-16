/*Program 2 : Find sum of numbers from given string.
input : te12ch22nocre3dits4
output : 12 + 22 + 3 + 4 = 41

Program 3 : Return a string by placing all small characters first, followed by digits, capital letters, special characters.

input : te4c&Hno7CreD-8i*ts
output : tecnoreits478HCD&-*

Program 4 : Find the difference between odd and even digits from given string.
input : tec5hno3cre6di1ts
output : 3
Hint : (5+3+1)-(6) = 9-6

Program 5 : Find the difference between even and odd numbers from given string.
input : te112ch34no29
output : 117
hint : (112+34)-(29)
*/

package pallavi;

public class A23_DigitsInString {

	// Find sum of numbers from given string.
	void findSumOfDigits(String str) {
		int sum = 0;
		String temp = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp += Character.getNumericValue(ch);
			} else {
				if (!(temp.equals(""))) {
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
			}
		}

		if (!(temp.equals(""))) {
			sum = sum + Integer.parseInt(temp);
			System.out.println("Sum of digits in string is :- " + sum);
		}
	}

	// Return a string by placing all small characters first, followed by digits,
	// capital letters, special characters.

	String reArrangeString(String str) {
		String smallChar = "", digits = "", capitalChar = "", specialChar = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					capitalChar += ch;
				else
					smallChar += ch;
			} else if (Character.isDigit(ch)) {
				digits += ch;
			} else
				specialChar += ch;

		}
		return smallChar + digits + capitalChar + specialChar;

	}

	// Find the difference between odd and even digits from given string.
	
	void diffOddEvenDigit(String str) {
		int sumOdd = 0, sumEven = 0, num = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				num = Integer.parseInt(ch + "");
				if (num % 2 == 0)
					sumEven += num;
				else
					sumOdd += num;
			}
		}
		System.out.println("The difference between odd and even digit:- " + (sumOdd - sumEven));
	}

	// Find the difference between Even and odd numbers from given string.

	void diffEvenOddNum(String str) {
		String temp = "";
		int sumEven = 0, sumOdd = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (Character.isDigit(ch)) {
				temp += Character.getNumericValue(ch);
			} else {
				if (!(temp == "")) {
					int num = Integer.parseInt(temp);

					if (num % 2 == 0)
						sumEven += num;
					else
						sumOdd += num;
				}

				temp = "";
			}
		}
		if (!(temp == "")) {
			int num = Integer.parseInt(temp);

			if (num % 2 == 0)
				sumEven += num;
			else
				sumOdd += num;
		}

		System.out.println("The difference between even and odd digit:- " + (sumEven - sumOdd));
	}

	public static void main(String[] args) {
		A23_DigitsInString a23_DigitsInString = new A23_DigitsInString();
		String input = "te12ch22nocre3dits4";
		System.out.println("----------Prog2---------------");
		System.out.println("Input:- " + input);
		a23_DigitsInString.findSumOfDigits(input);

		input = "te4c&Hno7CreD-8i*ts";
		System.out.println("----------Prog3---------------");
		System.out.println("Input:- " + input);
		System.out.println("Output:- " + a23_DigitsInString.reArrangeString(input));

		input = "tec5hno3cre6di1ts";
		System.out.println("----------Prog4---------------");
		System.out.println("Input:- " + input);
		a23_DigitsInString.diffOddEvenDigit(input);

		input = "te112ch34no29";
		System.out.println("----------Prog5---------------");
		System.out.println("Input:- " + input);
		a23_DigitsInString.diffEvenOddNum(input);

	}

}
