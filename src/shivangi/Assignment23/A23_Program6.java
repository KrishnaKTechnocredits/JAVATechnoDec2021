/*
Program 6 : Return a string by placing all odd numbers , first capital letters from given string, even numbers.
input : eTe1CH9cred4it6s
output : 19T46
*/
package shivangi.Assignment23;

public class A23_Program6 {
	
	void findOdd1stCapitalLetterEven(String input) {// 19T46
		String oddNumber = "";
		String evenNumber = "";
		String firstCapitalLetter = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(input.charAt(index))) {
				int digit = Integer.parseInt(input.valueOf(ch));
				if (digit % 2 == 0) {
					evenNumber = evenNumber + digit;
				} else {
					oddNumber = oddNumber + digit;
				}
			} else if (Character.isUpperCase(ch)) {
				if (firstCapitalLetter.equals("")) {
					firstCapitalLetter = firstCapitalLetter + ch;
				}
			}
		}
		System.out.println("Output(odd1stCapitalEven) of given input("+input+") is : " + oddNumber + firstCapitalLetter + evenNumber);
	}
	
	public static void main(String[] args) {
		A23_Program6 p6 = new A23_Program6();
		p6.findOdd1stCapitalLetterEven("eTe1CH9cred4it6s");
	}
}
