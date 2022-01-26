/*
 Find the difference between odd and even digits from given string.
 input : tec5hno3cre6di1ts
output : 3
 */
package monikaArkade;

public class A23_Program4 {
	int evenSum = 0, oddSum = 0;

	int findOddEvenDifference(String input) {
		for (int index = 0; index < input.length(); index++) {
			String ch = "" + input.charAt(index);
			if (Character.isDigit(input.charAt(index)) && input.charAt(index) % 2 == 0) {
				evenSum += Integer.parseInt(ch);
			} else if (Character.isDigit(input.charAt(index)) && input.charAt(index) % 2 != 0) {
				oddSum += Integer.parseInt(ch);
			}
		}
		return oddSum - evenSum;
	}

	public static void main(String[] args) {
		A23_Program4 p4 = new A23_Program4();
		String input1 = "tec5hno3cre6di1ts";
		System.out.println(p4.findOddEvenDifference(input1));

	}

}
