package anvit;

public class A23_3_CharNumUppercharSplDigit {
	
	String getOutput(String input) {
		String lowerCase = "";
		String digit = "";
		String upperCase = "";
		String specialChar = "";
		String str = "";
		for(int i = 0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isLowerCase(ch))
				lowerCase = lowerCase + ch;
			else if(Character.isDigit(ch))
				digit = digit + ch;
			else if(Character.isUpperCase(ch))
				upperCase = upperCase + ch;
			else
				specialChar = specialChar +ch;
		}
		str = lowerCase + digit + upperCase + specialChar;
		return str;
	}
	
	public static void main(String[] args) {
		A23_3_CharNumUppercharSplDigit a23_3 = new A23_3_CharNumUppercharSplDigit();
		String str = a23_3.getOutput("te4c&Hno7CreD-8i*ts");
		System.out.println(str);
	}
}
