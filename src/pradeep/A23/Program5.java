/*Program 5 : Find the difference between even and odd numbers from given string.
input : te112ch34no29
output : 117
hint : (112+34)-(29)*/
package pradeep.A23;

public class Program5 {

	int getSumFromString(String input) {
		String digit = "0";
		int evenDigit = 0;
		int oddDigit = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int temp = 0;

			if (Character.isDigit(ch)) {
				digit += ch;
				if (index == (input.length() - 1)) {
					temp = Integer.parseInt(digit);
					if (temp % 2 == 0)
						evenDigit += temp;
					else
						oddDigit += temp;
				}
			} else {
				temp = Integer.parseInt(digit);
				if (temp % 2 == 0)
					evenDigit += temp;
				else
					oddDigit += temp;

				digit = "0";
			}
		}
		int diff = evenDigit - oddDigit;
		return diff;
	}

	public static void main(String[] args) {
		Program5 program5 = new Program5();
		String input = "te112ch34no29";

		int diff = program5.getSumFromString(input);
		System.out.println("Difference between Even and Odd number is: " + diff);
	}
}
