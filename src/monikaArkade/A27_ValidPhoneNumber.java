/*
WAP to validate the phone number which is starting from number 9/8/7 and which should fit in the below mentioned valid patterns.
Valid Patters (considering initial number is 9 ):
1) +91 9765463742
2) 976 546 37 42
3) 09765463742
4) 9765463742
 */
package monikaArkade;

public class A27_ValidPhoneNumber {
	String num = "";

	static boolean verifyAllCharAsDigit(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				return true;
		}
		return false;
	}

	static boolean isFirstDigit(char ch) {
		if (ch == '9' || ch == '8' || ch == '7')
			return true;
		return false;
	}

	void checkValidNumber(String num) {
		if (num.length() == 14) {
			if (num.startsWith("+91 ")) {
				if (verifyAllCharAsDigit(num))
					System.out.println("Valid Number");
				else
					System.out.println("Invalid String");
			}
		} else if (num.length() == 11) {
			if (num.startsWith("0")) {
				if (isFirstDigit(num.charAt(1))) {
					if (verifyAllCharAsDigit(num))
						System.out.println("Valid String");
					else
						System.out.println("Invalid String");
				} else
					System.out.println("Invalid numbers");
			} else
				System.out.println("Invalid starting number");
		} else if (num.length() == 10) {
			if (isFirstDigit(num.charAt(0))) {
				if (verifyAllCharAsDigit(num))
					System.out.println("Valid Number");
				else
					System.out.println("Invalid String");
			} else
				System.out.println("Invalid numbers");
		} else if (num.length() == 13) {
			String number = num.replace(" ", "");
			if (number.length() == 10) {
				if (isFirstDigit(num.charAt(0))) {
					if (verifyAllCharAsDigit(num))
						System.out.println("Valid Number");
					else
						System.out.println("Invalid String");
				} else
					System.out.println("Invalid numbers");
			}
		}
	}

	public static void main(String[] args) {
		A27_ValidPhoneNumber obj = new A27_ValidPhoneNumber();
		String input = "+91 9765463742";
		obj.checkValidNumber(input);
		String input1 = "09765463742";
		obj.checkValidNumber(input1);
		String input2 = "9765463742";
		obj.checkValidNumber(input2);
		String input3 = "976 546 37 42";
		obj.checkValidNumber(input3);
	}
}
