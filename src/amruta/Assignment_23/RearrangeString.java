/*  Program 3 : Return a string by placing all small characters first, followed by digits, capital letters, special characters.
input : te4c&Hno7CreD-8i*ts	
output : tecnoreits478HCD&-*      */

package amruta.Assignment_23;

class RearrangeString {

	String returnStringInGivenOrder(String str) {

		String lowercase = "";
		String digit = "";
		String uppercase = "";
		String specialchar = "";

		for (int index = 0; index < str.length(); index++) {

			char ch = str.charAt(index);

			if (Character.isDigit(ch))
				digit += ch;

			else if (Character.isLowerCase(ch))
				lowercase += ch;

			else if (Character.isUpperCase(ch))
				uppercase += ch;

			else
				specialchar += ch;
		}

		return lowercase + digit + uppercase + specialchar;
	}

	public static void main(String[] args) {

		String input = "te4c&Hno7CreD-8i*ts";

		String output = new RearrangeString().returnStringInGivenOrder(input);

		System.out.println("\nString after sortinG in given order : " + output);
	}
}