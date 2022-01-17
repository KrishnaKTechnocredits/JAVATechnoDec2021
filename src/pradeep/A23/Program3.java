package pradeep.A23;

public class Program3 {
	// Program 3 : Return a string by placing all small characters first, followed by digits, capital letters, special characters.

	String getStringInGivenOrder(String input) {
		String lowerCase = "";
		String upperCase = "";
		String digit = "";
		String sChar = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (Character.isUpperCase(ch))
				upperCase += ch;
			else if (Character.isLowerCase(ch))
				lowerCase += ch;
			else if (Character.isDigit(ch))
				digit += ch;
			else
				sChar += ch;

		}
		return lowerCase + digit + upperCase + sChar;
	}

	public static void main(String[] args) {
		String input = "te4c&Hno7CreD-8i*ts";
		Program3 program3 = new Program3();
		String output = program3.getStringInGivenOrder(input);
		System.out.println("Output is :" + output);
	}
}
