/*	Assignment - 19 : 5th Jan'2022

Print total Letters, Uppercase , Lowercase , Digits from given String.

Input : TE1ch2noC2red9iTs
output :  Total Letters -> 13
               Total UpperCase characters -> 4
               Total LowerCase characters -> 9
               Total Digits -> 4

*/

package amruta.Assignment_19;

public class CharaterMethods2 {

	void performCharacterMethods(String str) {
		int digitCount = 0, uppercaseCount = 0, lowercaseCount = 0, lettercount = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					uppercaseCount++;
				else
					lowercaseCount++;

				lettercount++;
			}

			if (Character.isDigit(ch))
				digitCount++;
		}
		System.out.println("Total Letter Count is : " + digitCount);
		System.out.println("Total UpperCase character Count is : " + uppercaseCount);
		System.out.println("Total LowerCase character Count is : " + lowercaseCount);
		System.out.println("Total Digit Count is : " + lettercount);
	}

	public static void main(String[] args) {
		CharaterMethods2 charactermethods2 = new CharaterMethods2();
		charactermethods2.performCharacterMethods("TE1ch2noC2red9iTs");
	}
}
