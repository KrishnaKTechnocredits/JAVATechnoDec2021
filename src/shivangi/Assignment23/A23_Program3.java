/*
Porgram 3 : Return a string by placing all small characters first, followed by digits, capital letters, special 
characters.

input : te4c&Hno7CreD-8i*ts
output : tecnoreits478HCD&-*
*/
package shivangi.Assignment23;

public class A23_Program3 {
	
	void collectAllTypeOfChar(String input) {
		String smallChar = "";
		String digit = "";
		String capitalChar = "";
		String specialChar = "";
		for (int index = 0; index <= input.length()-1; index++) {
			if (Character.isLowerCase(input.charAt(index))) {
				smallChar = smallChar + input.charAt(index);
			} else if (Character.isDigit(input.charAt(index))) {
				digit = digit + input.charAt(index);
			} else if (Character.isUpperCase(input.charAt(index))) {
				capitalChar = capitalChar + input.charAt(index);
			} else {
				specialChar = specialChar + input.charAt(index);
			}
		}
		System.out.println(smallChar + digit + capitalChar + specialChar);
	}
	
	public static void main(String[] args) {
		A23_Program3 p3 = new A23_Program3();
		p3.collectAllTypeOfChar("te4c&Hno7CreD-8i*ts");
	}
}
