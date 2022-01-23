package sagarShrikhande.arrayAndStrings;

public class A23_P6_FormattedString {

	String getOddFCapEvenString(String input) {
		String firstCap = "";
		String oddDigit = "";
		String evenDigit = "";
		boolean upperFlag = true;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				if (Integer.parseInt(ch + "") % 2 == 0)
					evenDigit += ch;
				else
					oddDigit += ch;
			} else if (Character.isUpperCase(ch) && upperFlag == true) {
				firstCap += ch;
				upperFlag = false;
			}
		}
		return oddDigit + firstCap + evenDigit;
	}

	public static void main (String[] args) {
		A23_P6_FormattedString a23_P6_FormattedString = new A23_P6_FormattedString();
		String input = "eTe1CH9cred4it6s";
		System.out.println("Output string is: "+a23_P6_FormattedString.getOddFCapEvenString(input));
	}

}
/*
 * Program 6 : Return a string by placing all odd numbers , first capital
 * letters from given string, even numbers. input : eTe1CH9cred4it6s output :
 * 19T46
 */
