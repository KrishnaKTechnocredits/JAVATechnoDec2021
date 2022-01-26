package nehaPandey;

public class Assignment23_Program3 {
	String findLowerUpperDigitsSpecialCharacterInOrder(String str) {
		String lowerCase = "";
		String upperCase = "";
		String digits = "";
		String specialChar = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLowerCase(ch))
				lowerCase = lowerCase + ch;
			else if (Character.isUpperCase(ch))
				upperCase = upperCase + ch;
			else if (Character.isDigit(ch))
				digits = digits + ch;
			else
				specialChar = specialChar + ch;
		}
		return lowerCase + digits + upperCase + specialChar;
	}

	public static void main(String[] args) {
		Assignment23_Program3 program3 = new Assignment23_Program3();
		String str = program3.findLowerUpperDigitsSpecialCharacterInOrder("te4c&Hno7CreD-8i*ts");
		System.out.println(str);

	}

}
