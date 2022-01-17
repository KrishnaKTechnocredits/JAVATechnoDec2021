/*Program 6 : Return a string by placing all odd numbers , first capital letters from given string, even numbers.
input : eTe1CH9cred4it6s
output : 19T46*/
package pradeep.A23;

public class Program6 {
	String getStringInGivenOrder(String input) {
		String oddNum = "";
		String evenNum = "";
		String digit = "";
		String upperCase = "";
		int num = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (Character.isDigit(ch)) {
				digit += ch;
			} else if (!digit.equals("")) {
				num = Integer.parseInt(digit);
				if (num % 2 == 0)
					evenNum += num;
				else
					oddNum += num;
				digit = "";
			}

			if (Character.isUpperCase(ch)) {
				upperCase += ch;
			}
		}
		return oddNum + upperCase.charAt(0) + evenNum;
	}

	public static void main(String[] args) {
		Program6 program6 = new Program6();
		String input = "eTe1CH9cred4it6s";
		String output = program6.getStringInGivenOrder(input);
		System.out.println("output : " + output);
	}
}
