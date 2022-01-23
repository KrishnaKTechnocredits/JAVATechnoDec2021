package jagdish;

/*Program 3 : Return a string by placing all small characters first, followed by digits, capital letters, special characters.
input : te4c&Hno7CreD-8i*ts
output : tecnoreits478HCD&-**/

public class A23_3_Assignment {

	String findAllStrChar(String input) {
		String lowercase = "";
		String digitcase = "";
		String uppercase = "";
		String specialcase = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLowerCase(ch))
				lowercase = lowercase + ch;
			else if (Character.isDigit(ch))
				digitcase = digitcase + ch;
			else if (Character.isUpperCase(ch))
				uppercase = uppercase + ch;
			else
				specialcase = specialcase + ch;

		}

		return lowercase + digitcase + uppercase + specialcase;
	}

	public static void main(String[] args) {
		A23_3_Assignment allstrchar = new A23_3_Assignment();
		String name= "te4c&Hno7CreD-8i*ts";
		System.out.println("The value is " + allstrchar.findAllStrChar(name) );
	}

}
