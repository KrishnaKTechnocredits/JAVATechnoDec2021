package jagdish;
/*Program 6 : Return a string by placing all odd numbers , first capital letters from given string, even numbers.
input : eTe1CH9cred4it6s
output : 19T46*/

public class A23_6_Assignment {

	String FindAllOddEvenCap(String input) {
		String even = "";
		String odd = "";
		boolean Uppercase = true;
		String firstletter = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				if (Integer.parseInt(ch + "") % 2 == 0)
					even = even + ch;
				else
					odd = odd + ch;
			}

			if (Character.isUpperCase(ch) && Uppercase == true) {
				firstletter = firstletter + ch;
				Uppercase = false;

			}

		}
		return odd + firstletter + even;
	}

	public static void main(String[] args) {
		A23_6_Assignment a11 = new A23_6_Assignment();
		String name = "eTe1CH9cred4it6s";
		System.out.println("The value is " + a11.FindAllOddEvenCap(name));
	}

}
