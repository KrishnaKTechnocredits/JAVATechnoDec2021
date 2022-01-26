/*Program 3 : Return a string by placing all small characters first, 
 * followed by digits, capital letters, special characters.
input : te4c&Hno7CreD-8i*ts
output : tecnoreits478HCD&-*
 */
package sham;

public class A23_program3 {

	static String collectAllChar(String name) {
		String total = "";
		String lowercase = "";
		String uppercase = "";
		String digit = "";
		String SpecialChar = "";
		for (int index = 0; index < name.length(); index++) {
			if (Character.isLetter(name.charAt(index))) {
				if (Character.isLowerCase(name.charAt(index)))
					lowercase = lowercase + name.charAt(index);
				else
					uppercase = uppercase + name.charAt(index);
			} else if (Character.isDigit(name.charAt(index)))
				digit = digit + name.charAt(index);
			else
				SpecialChar = SpecialChar + name.charAt(index);
		}
		total = lowercase + uppercase + digit + SpecialChar;
		return total;

	}

	public static void main(String[] args) {
		String allStrings = collectAllChar("te4c&Hno7CreD-8i*ts");
		System.out.println("placed all String formats follwed by sequence: "+allStrings);
	}

}
