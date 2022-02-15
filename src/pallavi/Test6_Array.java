/*Programmining Test - 6
1.  Write a method to return the first non repeating Capital character.
Input : tEChNoCrEdits
Output : N

2. Find maximum word length from a given statement.
input = "good morning technocredits hi hello";
output : technocredits

3. sum of all numbers in a given statement.
input = "10 10 20 30";
output : 70

Expected time to complete all 3 program is 1 hr 15 mins (max)
*/

package pallavi;

public class Test6_Array {

	char getNonRepeatingCapitalChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index))) {
				if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index)))
					return input.charAt(index);
			}
		}
		return 0;
	}

	private void findMaxLength(String input2) {
		String[] input = input2.split(" ");
		int max = 0;
		String output = "";
		for (String str : input) {
			if (str.length() > max) {
				max = str.length();
				output = str;
			}
		}
		System.out.println("Output - Word with maximum length : " + output);

	}

	void findSumOfNum(String input3) {
		String[] input = input3.split(" ");
		int sum = 0;

		for (String num : input)
			sum += Integer.parseInt(num);
		System.out.println("Output - Sum of numbers in given statement : " + sum);
	}

	public static void main(String[] args) {
		Test6_Array test6 = new Test6_Array();
		String input1 = " tEChNoCrEdits";
		System.out.println("Input - " + input1);
		System.out
				.println("Output - First non repeating capital character:" + test6.getNonRepeatingCapitalChar(input1));
		System.out.println();

		String input2 = "good morning technocredits hi hello";
		System.out.println("Input - " + input2);
		test6.findMaxLength(input2);
		System.out.println();

		String input3 = "10 10 20 30";
		System.out.println("Input - " + input3);
		test6.findSumOfNum(input3);

	}

}
