/* Programming Test - 6 : 10th Feb'2022
 
2. Find maximum word length from a given statement.
input = "good morning technocredits hi hello";
output : technocredits

*/

package vaibhav.Exam_6;

public class Exam6_Program2 {

	String getMaxLengthWord(String input) {
		String[] strArr = input.split(" ");
		int maxWordLength = 0;
		String maxLengthWord = "";

		for (String str : strArr) {
			if (str.length() > maxWordLength) {
				maxWordLength = str.length();
				maxLengthWord = str;
			}
		}
		return maxLengthWord;
	}

	public static void main(String[] args) {
		Exam6_Program2 exam6_Program2 = new Exam6_Program2();
		String inputString = "good morning technocredits hi hello";
		String maxLengthWord = exam6_Program2.getMaxLengthWord(inputString);
		System.out.println("Input String 				: " + inputString);
		System.out.println("Expected word with maximum length	: " + maxLengthWord);
	}
}
