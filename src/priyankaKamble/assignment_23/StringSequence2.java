package priyankaKamble.assignment_23;

/*
Program 6 : Return a string by placing all odd numbers , first capital letters from given string, even numbers.
input : eTe1CH9cred4it6s
output : 19T46*/

public class StringSequence2 {
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
		StringSequence2 stringSequence2 = new StringSequence2();
		String input = "eTe1CH9cred4it6s";
		System.out.println("Input String  = " + input +"\nOutput String = " + stringSequence2.arrangeStrning(input));

	}
}
