package nehaPandey;

public class Assignment23_Program6 {
	String findOddNumbersFirstCapitalLettersFromGivenString(String str) {

		String oddTemp = "";
		String evenTemp = "";
		String firstCapLetter = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int digit = (Character.getNumericValue(ch));
				if (digit % 2 == 0) {
					evenTemp = evenTemp + digit;
				} else {
					oddTemp = oddTemp + digit;
				}
			} else if (Character.isUpperCase(ch)) {
				if (firstCapLetter.equals("")) {
					firstCapLetter = firstCapLetter + ch;
				}
			}
		}
		return oddTemp + firstCapLetter + evenTemp;
	}

	public static void main(String[] args) {
		Assignment23_Program6 program6 = new Assignment23_Program6();
		String str = program6.findOddNumbersFirstCapitalLettersFromGivenString("eTe1CH9cred4it6s");
		System.out.println(str);

	}

}
