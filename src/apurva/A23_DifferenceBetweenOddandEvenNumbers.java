package apurva;
/*Program 5 : Find the difference between even and odd numbers from given string.
input : te112ch34no29
output : 117
hint : (112+34)-(29)
 */

public class A23_DifferenceBetweenOddandEvenNumbers {

	void displayDifferenceofOddandEvenNumbers() {
		int evensum = 0;
		int oddsum = 0;
		int num = 0;
		String temp = "";
		String str = "te112ch34no29";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;

			} else if (!temp.equals("")) {
				num = Integer.parseInt(temp);
				if (num % 2 == 0) {
					evensum += Integer.parseInt(temp);
					temp = "";
				} else
					oddsum += Integer.parseInt(temp);
				temp = "";
			}
		}
		if (!temp.equals("")) {
			num = Integer.parseInt(temp);
			if (num % 2 == 0) {
				evensum += Integer.parseInt(temp);
				temp = "";
			} else
				oddsum += Integer.parseInt(temp);
			temp = "";
		}
		System.out.println("Difference of odd and even numbers in given String is: " + (evensum - oddsum));
	}

	public static void main(String[] args) {
		new A23_DifferenceBetweenOddandEvenNumbers().displayDifferenceofOddandEvenNumbers();
	}
}
