/* Assignment - 23 : 15th Jan'2022

Program 2 : Find sum of numbers from given string.
input : te12ch22nocre3dits4
output : 12 + 22 + 3 + 4 = 41

*/

package vaibhav.Assignment_23;

public class Program2_SumOfNumbers {

	void sumOfNumbers(String str) {
		char ch;
		String temp = "0";
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);

			if (Character.isDigit(ch)) {
				temp = temp + ch;
			} else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		if (!temp.equals("0")) {
			sum = sum + Integer.parseInt(temp);
			temp = "0";
		}
		System.out.println("Sum of digits in the given string '"+str+"' is : " + sum);
	}

	public static void main(String[] args) {
		Program2_SumOfNumbers program2_SumOfNumbers = new Program2_SumOfNumbers();
		program2_SumOfNumbers.sumOfNumbers("te12ch22nocre3dits4");
	}

}
