/*
 Return a string by placing all small characters first, followed by digits, capital letters, special characters.
 input : te4c&Hno7CreD-8i*ts
 output : tecnoreits478HCD&-*
 */
package monikaArkade;

public class A23_Program3 {
	String lowerCase = "", upperCase = "", digits = "", specialchar = "";

	String stringByPlacingTheChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				digits += ch;
			else if (Character.isLowerCase(ch))
				lowerCase += ch;
			else if (Character.isUpperCase(ch))
				upperCase += ch;
			else if ((!Character.isDigit(ch)) && !Character.isLowerCase(ch) && !Character.isUpperCase(ch))
				specialchar += ch;
		}
		return lowerCase + "" + digits + "" + upperCase + "" + specialchar;
	}

	public static void main(String[] args) {
		A23_Program3 p3 = new A23_Program3();
		String input = "te4c&Hno7CreD-8i*ts";
		System.out.println(p3.stringByPlacingTheChar(input));
	}
}
