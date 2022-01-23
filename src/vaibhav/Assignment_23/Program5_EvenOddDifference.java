/* Assignment - 23 : 15th Jan'2022

Program 5 : Find the difference between even and odd numbers from given string.
input : te112ch34no29
output : 117
hint : (112+34)-(29)

*/

package vaibhav.Assignment_23;

public class Program5_EvenOddDifference {

	int getEvenOddDiff(String str) {

		String tempString = "0";
		int tempNum = 0;
		int evenSum = 0;
		int oddSum = 0;
		char ch;

		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);

			if (Character.isDigit(ch)) {
				tempString += ch;
			} else {
				tempNum = Integer.parseInt(tempString);
				if (tempNum % 2 == 0) {
					evenSum += tempNum;
				} else {
					oddSum += tempNum;
				}
				tempNum = 0;
				tempString = "0";
			}
		}
		if (!tempString.equals("0")) {
			tempNum = Integer.parseInt(tempString);
			if (tempNum % 2 == 0) {
				evenSum += tempNum;
			} else {
				oddSum += tempNum;
			}
			tempNum = 0;
			tempString = "0";
		}
		return evenSum - oddSum;

	}

	public static void main(String[] args) {
		Program5_EvenOddDifference program5_EvenOddDifference = new Program5_EvenOddDifference();
		String inputStr = "te112ch34no29";
		int evenOddDiff = program5_EvenOddDifference.getEvenOddDiff(inputStr);
		System.out.println("Input String 					: " + inputStr);
		System.out.println("Difference between Even Sum and Odd Sum is 	: " + evenOddDiff);
	}
}