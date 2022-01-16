package sham;

public class A18_CharacterMethods {
	private void displayCharactersAndDigits(String name) {
		int upperCaseCount = 0, lowerCaseCount = 0, digitCount = 0;
		System.out.println("Given Input String is: " + name);
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					upperCaseCount++;
				} else
					lowerCaseCount++;

			} else if (Character.isDigit(ch)) {
				digitCount++;
			}

		}
		System.out.println("Uppercase letters count: " + upperCaseCount);
		System.out.println("Lowercase letters count: " + lowerCaseCount);
		System.out.println("Digit count : " + digitCount);
		System.out.println("Total count from String is :" + (upperCaseCount + lowerCaseCount + digitCount));

	}

	public static void main(String[] args) {
		A18_CharacterMethods characterMethod = new A18_CharacterMethods();
		characterMethod.displayCharactersAndDigits("TE1ch2noC2red9iTs");

	}
}
