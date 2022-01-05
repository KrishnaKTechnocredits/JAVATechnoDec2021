/*Assignment - 19 : 5th Jan'2022

Print total Letters, Uppercase , Lowercase , Digits from given String.

Input : TE1ch2noC2red9iTs
output :  Total Letters -> 13
               Total UpperCase characters -> 4
               Total LowerCase characters -> 9
               Total Digits -> 4
 */
package shwetaDharmadhikari;

public class Assign19_CountLettersFromString {
	void countLetters(String input) {
		int letterCount = 0, digitCount = 0, uppercaseCount = 0, lowecaseCount = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isLetter(input.charAt(index))) {
				letterCount++;
				if (Character.isUpperCase(input.charAt(index)))
					uppercaseCount++;
				else if (Character.isLowerCase(input.charAt(index)))
					lowecaseCount++;
			} else if (Character.isDigit(input.charAt(index)))
				digitCount++;
		}
		System.out.println(" Total Letters -> " + letterCount);
		System.out.println(" Total UpperCase characters -> " + uppercaseCount);
		System.out.println(" Total LowerCase characters -> " + lowecaseCount);
		System.out.println(" Total Digits -> " + digitCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "TE1ch2noC2red9iTs";
		Assign19_CountLettersFromString assign19_CountLettersFromString = new Assign19_CountLettersFromString();
		assign19_CountLettersFromString.countLetters(name);
	}

}
