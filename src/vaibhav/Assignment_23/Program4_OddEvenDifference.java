/* Assignment - 23 : 15th Jan'2022

Program 4 : Find the difference between odd and even digits from given string.
input : tec5hno3cre6di1ts
output : 3
Hint : (5+3+1)-(6) = 9-6

*/

package vaibhav.Assignment_23;

public class Program4_OddEvenDifference {

	int getOddEvenDiff(String str) {
		char ch;
		String tempString = "0";
		int tempNum = 0;
		int evenSum = 0;
		int oddSum = 0;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				tempString = tempString + ch;
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

		return oddSum - evenSum;

	}

	public static void main(String[] args) {
		Program4_OddEvenDifference program4_OddEvenDifference = new Program4_OddEvenDifference();
		String inputStr = "tec5hno3cre6di1ts";
		int oddEvenDiff = program4_OddEvenDifference.getOddEvenDiff(inputStr);
		System.out.println("Input String 					: " + inputStr);
		System.out.println("Difference between Odd Sum and Even Sum is 	: " + oddEvenDiff);
	}
}
