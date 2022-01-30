package ashwini_A23;

//Program 3 : Return a string by placing all small characters first, followed by digits, capital letters, 
//special characters.
//
//input : te4c&Hno7CreD-8i*ts
//output : tecnoreits478HCD&-*

public class A23_p3 {

	void returnInCorrectOrder(String input) {
		String smallCase = "";
		String capitalCase = "";
		String digit = "";
		String chars = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (Character.isLetter(ch)) {
				if (Character.isLowerCase(ch))
					smallCase += ch;
				else
					capitalCase += ch;
			} else if (Character.isDigit(ch)) {
				digit += ch;
			} else {
				chars += ch;
			}
		}
		System.out.println(smallCase + digit + capitalCase + chars);

	}

	public static void main(String[] args) {
		A23_p3 a3 = new A23_p3();
		String input = "te4c&Hno7CreD-8i*ts";
		a3.returnInCorrectOrder(input);
	}

}
