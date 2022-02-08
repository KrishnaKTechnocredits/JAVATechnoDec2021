package pranoti;

public class A23_P3_StringOperations {
	String getString(String input) {
		String lowerCase = "";
		String upperCase = "";
		String digit = "";
		String splChar = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch))
				lowerCase = lowerCase + ch;
			else if (Character.isDigit(ch))
				digit = digit + ch;
			else if (Character.isUpperCase(ch))
				upperCase = upperCase + ch;
			else
				splChar = splChar + ch;
		}
		return lowerCase + digit + upperCase + splChar;
	}

	public static void main(String[] args) {
		A23_P3_StringOperations a23_P3_StringOperations = new A23_P3_StringOperations();
		String str = a23_P3_StringOperations.getString("te4c&Hno7CreD-8i*ts");
		System.out.println(str);
	}
}
