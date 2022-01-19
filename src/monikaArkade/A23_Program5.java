/*
 *  Return a string by placing all odd numbers , first capital letters from given string, even numbers.
input : eTe1CH9cred4it6s
output : 19T46
*/
package monikaArkade;

public class A23_Program5 {
	String firstUpperCase = "", EvenDigits = "", oddDigits = "";

	String arrangeStrning(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch) && input.charAt(index) % 2 == 0)
				EvenDigits += ch;
			else if (Character.isDigit(ch) && input.charAt(index) % 2 != 0)
				oddDigits += ch;
			else if (Character.isLetter(ch) && Character.isUpperCase(ch))
				firstUpperCase += ch;
		}
		return oddDigits + firstUpperCase.charAt(0) + EvenDigits;
	}

	public static void main(String[] args) {
		A23_Program5 p5 = new A23_Program5();
		String input = "eTe1CH9cred4it6s";
		System.out.println(p5.arrangeStrning(input));

	}
}
