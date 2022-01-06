package sham;

public class A19_CharacterGetNumeric {

	void displayNumericValue(String name) {
		int charSum = 0;
		System.out.println("Given String is: " + name);
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			if (Character.isLetter(ch)) {
				int nValue = Character.getNumericValue(ch);
				System.out.println("Numeric Value for: " + ch + " is " + nValue);
				charSum = charSum + nValue;
			}
		}
		System.out.println("----------------------------------------------");
		System.out.println("Total sum of char from String is: " + charSum);
		System.out.println("----------------------------------------------");
	}

	public static void main(String[] args) {
		A19_CharacterGetNumeric numeric = new A19_CharacterGetNumeric();
		numeric.displayNumericValue("Techno1cre2dit3s");

	}

}
