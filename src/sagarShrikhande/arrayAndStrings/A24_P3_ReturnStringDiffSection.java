package sagarShrikhande.arrayAndStrings;

public class A24_P3_ReturnStringDiffSection {

	String getStringDiffSection(String input) {
		String tLower = "";
		String tUpper = "";
		String tDigits = "";
		String tSpecial = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch))
				tLower = tLower + ch;
			else if (Character.isUpperCase(ch))
				tUpper = tUpper + ch;
			else if (Character.isDigit(ch))
				tDigits = tDigits + ch;
			else
				tSpecial = tSpecial + ch;
		}
		return tLower + tDigits + tUpper + tSpecial;
	}

	public static void main(String[] args) {
		A24_P3_ReturnStringDiffSection a24_P3_ReturnStringDiffSection = new A24_P3_ReturnStringDiffSection();
		String s = "te4c&Hno7CreD-8i*ts";
		System.out.println("output String is: " + a24_P3_ReturnStringDiffSection.getStringDiffSection(s));
	}
}

/*
 * Program 3 : Return a string by placing all small characters first, followed
 * by digits, capital letters, special characters.
 * 
 * input : te4c&Hno7CreD-8i*ts output : tecnoreits478HCD&-*
 */