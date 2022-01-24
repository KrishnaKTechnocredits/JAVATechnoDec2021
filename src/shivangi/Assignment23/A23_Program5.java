/*
Program 5 : Find the difference between even and odd numbers from given string.
input : te112ch34no29
output : 117
hint : (112+34)-(29)
*/
package shivangi.Assignment23;

public class A23_Program5 {
	
	void findDiffOddEvenCompleteNumString(String input) {
		int evenSum = 0;
		int oddSum = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
			} else if (temp.length() > 0) {
				int num = Integer.parseInt(temp);
				if (num % 2 == 0) {
					evenSum = evenSum + Integer.parseInt(temp);
					temp = "";
				} else if (temp.length() > 0) {
					num = Integer.parseInt(temp);
					if (num % 2 != 0)
						oddSum = oddSum + Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		if (temp.length() > 0) {
			int num = Integer.parseInt(temp);
			if (num % 2 == 0) {
				evenSum += Integer.parseInt(temp);
				temp = "";
			} else if (!temp.equals("")) {
				num = Integer.parseInt(temp);
				if (num % 2 != 0)
					oddSum += Integer.parseInt(temp);
				temp = "";
			}
		}
		int output = evenSum - oddSum;
		System.out.print("Difference between the Sum of Even numbers and Odd numbers is : " + output);
	}

	public static void main(String[] args) {
		A23_Program5 diffOddEven = new A23_Program5();
		diffOddEven.findDiffOddEvenCompleteNumString("te112ch34no29");

	}
}
