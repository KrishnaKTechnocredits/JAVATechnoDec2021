package rahulGavali;

/*Assignment 23
Program 5 : Find the difference between even and odd numbers from given string.
input : te112ch34no29
output : 117
hint : (112+34)-(29)
*/

public class A23_P5_DifferenceEvenOddDigits {

void getDifferenceOddEvenNums(String input) {
	int sumOdd = 0;
	int sumEven = 0;
	String temp = "";
	for (int index = 0; index < input.length(); index++) {
		char ch = input.charAt(index);
		if (Character.isDigit(ch)) {
			temp += ch;
		} else if (!temp.equals("")) {
			int num = Integer.parseInt(temp);
			if (num % 2 == 0) {
				sumEven += Integer.parseInt(temp);
				temp = "";
			} else if (!temp.equals("")) {
				num = Integer.parseInt(temp);
				if (num % 2 != 0)
					sumOdd += Integer.parseInt(temp);
				temp = "";
			}
		}
	}
	if (!temp.equals("")) {
		int num = Integer.parseInt(temp);
		if (num % 2 == 0) {
			sumEven += Integer.parseInt(temp);
			temp = "";
		} else if (!temp.equals("")) {
			num = Integer.parseInt(temp);
			if (num % 2 != 0)
				sumOdd += Integer.parseInt(temp);
			temp = "";
		}
	}
	System.out.println(sumEven - sumOdd);
}

public static void main(String[] args) {
	A23_P5_DifferenceEvenOddDigits diffOddEven = new A23_P5_DifferenceEvenOddDigits();
	String input = "te112ch34no29";
	System.out.print("Difference between the Sum of Even numbers and Odd numbers is: ");
	diffOddEven.getDifferenceOddEvenNums(input);

}

}