/* Programming Test - 6 : 10th Feb'2022
 
1.  Write a method to return the first non repeating Capital character.
Input : tEChNoCrEdits
Output : N

*/
package vaibhav.Exam_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exam6_Program1 {

	static char getNonRepeatingChar(String input) {
		char expectedChar = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				int count = 0;
				for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
					char ch1 = input.charAt(innerIndex);
					if (Character.isUpperCase(ch1)) {
						if (ch == ch1) {
							count++;
						}
					}
				}
				if (count == 1) {
					expectedChar = ch;
					break;
				}
			}
		}
		return expectedChar;
	}

	public static void main(String[] args) {
		Exam6_Program1 Exam6_Program1 = new Exam6_Program1();
		String input = "tEChNoCrEdits";
		System.out.println("Input String 					: " + input);
		System.out.println("Expected first non repeating Capital character	: " + getNonRepeatingChar(input));
	}

}
