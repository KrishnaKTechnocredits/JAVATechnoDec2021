package archana;

public class Ass23_P5_FormattString {

	String findOddCapitalEven(String input) {
		String fCap = "";
		String oDigit = "";
		String eDigit = "";
		boolean upperCaseFlag = true;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				if (Integer.parseInt(ch + "") % 2 == 0)
					eDigit = eDigit + ch;
				else
					oDigit = oDigit + ch;
			} else if (Character.isUpperCase(ch) && upperCaseFlag == true) {
				fCap = fCap + ch;
				upperCaseFlag = false;
			}
		}
		return oDigit + fCap + eDigit;
	}

	public static void main(String[] args) {
		Ass23_P5_FormattString ass23 = new Ass23_P5_FormattString();
		String input = "eTe1CH9cred4it6s";
		String ans = ass23.findOddCapitalEven(input);
		System.out.println("Output string is: " + ans);
	}
}
