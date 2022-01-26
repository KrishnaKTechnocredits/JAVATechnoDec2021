/* Assignment 27 : 21st Jan'2022

WAP to validate the phone number which is starting from number 9/8/7 and which should fit in the below
mentioned valid patterns.
Valid Patters (considering initial number is 9 ):
1) +91 9765463742	//14
2) 976 546 37 42	//13
3) 09765463742		//11
4) 9765463742		//10

Input  : +919765463742
Output :  +919765463742 --> Invalid

Input  : 097 654 637 42
Output : 097 654 637 42 --> Invalid

Input  : +91 1765463742
Output : +91 1765463742 --> Invalid

Input  : 976 546 3742
Output : 976 546 3742 --> Invalid

Input  : 976546A742
Output : 976546A742 --> Invalid

Input  : 3765463742
Output : 3765463742 --> Invalid

Input  : 9765463742
Output : 9765463742 --> Valid 

*/

package vaibhav.Assignment_27;

public class ValidatePhoneNumber {

	boolean isDigitCountValid(String str) {
		int digitCount = 0;
		char ch;
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				digitCount++;
			}
		}
		if (digitCount == 10)
			return true;
		else
			return false;
	}

	boolean isStartNumValid(String str) {
		if (str.charAt(0) == '9' || str.charAt(0) == '8' || str.charAt(0) == '7')
			return true;
		else
			return false;
	}

	void validateNum(String str) {
		switch (str.length()) {

		case 14:
			if (str.startsWith("+91 ")) {
				if (isStartNumValid(str.substring(4))) {
					if (isDigitCountValid(str.substring(4))) {
						System.out.println(str + "	--> " + "Valid");
					} else
						System.out.println(str + "	--> " + "Invalid");
				} else
					System.out.println(str + "	--> " + "Invalid");
			} else {
				System.out.println(str + "	--> " + "Invalid");
			}
			break;

		case 13:

			// if (str.valueOf(str.charAt(3)).equals(" ") &&
			// str.valueOf(str.charAt(7)).equals(" ") &&
			// str.valueOf(str.charAt(10)).equals(" ")) {

			if (str.charAt(3) == ' ' && str.charAt(7) == ' ' && str.charAt(10) == ' ') {

				String tempStr = "";
				tempStr = str.replaceAll(" ", "");

				if (isDigitCountValid(tempStr)) {
					if (isStartNumValid(tempStr)) {
						System.out.println(str + "	--> " + "Valid");
					} else {
						System.out.println(str + "	--> " + "Invalid");
					}
				} else {
					System.out.println(str + "	--> " + "Invalid");
				}
			} else {
				System.out.println(str + "	--> " + "Invalid");
			}
			break;

		case 11:

			if (str.charAt(0) == '0') {
				if (isDigitCountValid(str.substring(1))) {
					if (isStartNumValid(str.substring(1))) {
						System.out.println(str + "	--> " + "Valid");
					}else {
						System.out.println(str + "	--> " + "Invalid");
					}
				} else {
					System.out.println(str + "	--> " + "Invalid");
				}
			} else {
				System.out.println(str + "	--> " + "Invalid");
			}
			break;
		case 10:
			if (isDigitCountValid(str)) {
				if (isStartNumValid(str)) {
					System.out.println(str + "	--> " + "Valid");
				} else {
					System.out.println(str + "	--> " + "Invalid");
				}
			} else {
				System.out.println(str + "	--> " + "Invalid");
			}

			break;
		default:
			System.out.println(str + "	--> " + "Invalid");
			break;
		}
	}

	public static void main(String[] args) {
		ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
		System.out.println("Valid Mobile Number Pattrens : ");
		validatePhoneNumber.validateNum("+91 9765463742");
		validatePhoneNumber.validateNum("976 546 37 42");
		validatePhoneNumber.validateNum("09765463742");
		validatePhoneNumber.validateNum("9765463742");
		System.out.println("\nCheck for the various inputs :");
		validatePhoneNumber.validateNum("+919765463742");
		validatePhoneNumber.validateNum("097 654 637 42");
		validatePhoneNumber.validateNum("+91 1765463742");
		validatePhoneNumber.validateNum("976 546 3742");
		validatePhoneNumber.validateNum("976546A742");
		validatePhoneNumber.validateNum("3765463742");
		validatePhoneNumber.validateNum("9765463742");
		validatePhoneNumber.validateNum("1111");
	}
}
