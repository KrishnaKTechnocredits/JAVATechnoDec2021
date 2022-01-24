/*  Program 2 : Find sum of numbers from given string.  ------> Understood
input : te12ch22nocre3dits4
output : 12 + 22 + 3 + 4 = 41       */

package amruta.Assignment_23;

class SumOfNumbersFromString {

	int returnSumOfNumber(String str) {
		int sum = 0;
		String temp = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (Character.isDigit(ch)) {
				temp += ch;
			} else if (Character.isLetter(ch)) {

				if (!temp.equals("")) {
					sum = sum + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		if (!temp.equals(""))
			sum = sum + Integer.parseInt(temp);

		return sum;
	}

	public static void main(String[] args) {

		SumOfNumbersFromString sumofnumbersfromstring = new SumOfNumbersFromString();

		String input = "te12ch22nocre3dits4";

		int sum = sumofnumbersfromstring.returnSumOfNumber(input);
		System.out.println("\nSum of Numbers from given string is : " + sum);

		String str = "am3ru4ta";

		int sum2 = sumofnumbersfromstring.returnSumOfNumber(str);
		System.out.println("\nSum of Numbers from given string is : " + sum2);
	}
}