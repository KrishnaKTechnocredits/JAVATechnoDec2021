package archana;

public class Ass23_P6_ReturnStringSection {
	String stringSection(String input) {
		String lowerCase = "";
		String upperCase = "";
		String tDigits = "";
		String other = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch))
				lowerCase = lowerCase + ch;
			else if (Character.isUpperCase(ch))
				upperCase = upperCase + ch;
			else if (Character.isDigit(ch))
				tDigits = tDigits + ch;
			else
				other = other + ch;
		}
		return lowerCase + tDigits + lowerCase + other;
	}

	public static void main(String[] args) {
		Ass23_P6_ReturnStringSection ass23 = new Ass23_P6_ReturnStringSection();
		String s = "te4c&Hno7CreD-8i*ts";
		String ans = ass23.stringSection(s);
		System.out.println("output String is: " + ans);
	}
}
