/*
Program 2 : Find sum of numbers from given string.
input : te12ch22nocre3dits4
output : 12 + 22 + 3 + 4 = 41
 */
package monikaArkade;

public class A23_Program2 {
	int sum = 0;
	String temp = "";

	void findSumOfNumbers(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
			else if (!temp.equals("")) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}

		if (!temp.equals("")) {
			sum = sum + Integer.parseInt(temp);
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		A23_Program2 p2 = new A23_Program2();
		String input = "te12ch22nocre3dits4";
		p2.findSumOfNumbers(input);
	}

}
