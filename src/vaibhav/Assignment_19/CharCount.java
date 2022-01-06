/* Assignment - 18 : 5th Jan'2022

Print total Letters, Uppercase , Lowercase , Digits from given String.

Input : TE1ch2noC2red9iTs
output :  Total Letters -> 13
               Total UpperCase characters -> 4
               Total LowerCase characters -> 9
               Total Digits -> 4  
  
 */

package vaibhav.Assignment_19;

public class CharCount {

	int upperCaseCount;
	int lowerCaseCount;
	int digitCount;
	int letterCount;
	int specialCharCount;

	void charCount(String input) {
		char ch;
		for (int index = 0; index <= input.length() - 1; index++) {
			ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					upperCaseCount++;
				} else
					lowerCaseCount++;
			} else if (Character.isDigit(ch)) {
				digitCount++;
			} else {
				specialCharCount++;
			}

		}
		letterCount = upperCaseCount + lowerCaseCount;
		System.out.println("In the given string "+input+" character count is as below :");
		System.out.println();
		System.out.println("Letter count 	==> " + letterCount);
		System.out.println(" - Uppercase letter count	: " + upperCaseCount);
		System.out.println(" - Lower letter count 		: " + lowerCaseCount);
		System.out.println(" - Digit count 			: " + digitCount);
		System.out.println("------------------------------------");
		System.out.println("Special Character count ==> " + specialCharCount);
	}
	public static void main(String[] args) {
		CharCount charCount = new CharCount();
		charCount.charCount("TE1ch2noC2re@d9iTs*");
	}
}
