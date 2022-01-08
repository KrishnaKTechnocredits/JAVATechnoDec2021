package apurva;

/*Print total Letters, Uppercase , Lowercase , Digits from given String.

Input : TE1ch2noC2red9iTs
output :  Total Letters -> 13
               Total UpperCase characters -> 4
               Total LowerCase characters -> 9
               Total Digits -> 4*/

public class A19_CharacterClass {

	void displayCountofEachCharacter() {
		String input = "TE1ch2noC2red9iTs";
		int lowerCount = 0;
		int upperCount = 0;
		int digitCount = 0;
		int index = 0;
		for (; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					upperCount++;

				if (Character.isLowerCase(ch))
					lowerCount++;

			} else if (Character.isDigit(ch)) {
				digitCount++;
			}

		}
		System.out.println("Input String is: " +input);
		System.out.println("Total Letters:" + (upperCount + lowerCount));
		System.out.println("Total Upper Case character count is :" + upperCount);
		System.out.println("Total lower Case charachter count is:" + lowerCount);
		System.out.println("Total digits: " + digitCount);
	}

	public static void main(String[] args) {
		A19_CharacterClass test = new A19_CharacterClass();
		test.displayCountofEachCharacter();
	}

}
