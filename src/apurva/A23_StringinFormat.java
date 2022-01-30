package apurva;

/*Program 3 : Return a string by placing all small characters first, followed by digits, capital letters, special characters.

input : te4c&Hno7CreD-8i*ts
output : tecnoreits478HCD&-*/

public class A23_StringinFormat {

	void displayStringinAFormat(String str) {
		String lowerCase = "";
		String caps = "";
		String specialChar = "";
		String number = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch))
				lowerCase += ch;
			else if (Character.isUpperCase(ch))
				caps += ch;
			else if (Character.isDigit(ch))
				number += ch;
			else
				specialChar += ch;

		}

		System.out.println("Output String is: " + lowerCase + number + caps + specialChar);
	}

	public static void main(String[] args) {
		String input = "te4c&Hno7CreD-8i*ts";
		System.out.println("Input String is : " + input);
		A23_StringinFormat a23_StringinFormat = new A23_StringinFormat();
		a23_StringinFormat.displayStringinAFormat(input);
	}

}
