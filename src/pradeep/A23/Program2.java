/*Program 2 : Find sum of numbers from given string.
input : te12ch22nocre3dits4
output : 12 + 22 + 3 + 4 = 41*/
package pradeep.A23;

public class Program2 {
	int getSumFromString(String input) {
		String digit = "0";
		int sum = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int temp = 0;

			if (Character.isDigit(ch)) {
				digit += ch;
				if (index == (input.length() - 1)) {
					temp = Integer.parseInt(digit);
				}
			} else {
				temp = Integer.parseInt(digit);
				digit = "0";
			}
			sum += temp;
		}

		return sum;
	}

	public static void main(String[] args) {
		Program2 program2 = new Program2();
		String input = "te12ch22nocre3dits4";

		int sum = program2.getSumFromString(input);
		System.out.println("sum : " + sum);
	}
}
