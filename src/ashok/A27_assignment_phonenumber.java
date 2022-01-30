package ashok;

public class A27_assignment_phonenumber {

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
		A27_assignment_phonenumber validatePhoneNumber = new A27_assignment_phonenumber();
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