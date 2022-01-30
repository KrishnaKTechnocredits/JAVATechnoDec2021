package shital;

public class A27 {

	static boolean isAllCharDigits(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch))
				return false;
		}
		return true;
	}

	static boolean isFirstCharValid(char ch) {
		if (ch == '9' || ch == '8' || ch == '7')
			return true;
		return false;
	}

	void findValidOrInvalidPhoneNumPattern(String phoneNumber) {
		System.out.println("Phone number: " + phoneNumber);
		switch (phoneNumber.length()) {
		case 4: {
			if (phoneNumber.startsWith("+91 ")) {
				if (isFirstCharValid(phoneNumber.charAt(4))) {
					if (isAllCharDigits(phoneNumber.substring(4)))
						System.out.println("Valid Phone Number Pattern");
					else
						System.out.println("Invalid Phone Number Pattern");
				} else
					System.out.println("Invalid Phone Number Pattern");

			} else
				System.out.println("Invalid Phone Number Pattern");
			break;
		}

		case 3: {
			if (isFirstCharValid(phoneNumber.charAt(0))) {
				if (phoneNumber.charAt(3) == ' ' && phoneNumber.charAt(7) == ' ' && phoneNumber.charAt(10) == ' ') {
					phoneNumber = phoneNumber.replace(" ", "");
					if (isAllCharDigits(phoneNumber))
						System.out.println("Valid Phone Number Pattern");
					else
						System.out.println("Invalid Phone Number Pattern");
				} else
					System.out.println("Invalid Phone Number Pattern");
			} else
				System.out.println("Invalid Phone Number Pattern");
			break;
		}

		case 2: {
			if (phoneNumber.startsWith("0")) {
				if (isFirstCharValid(phoneNumber.charAt(1))) {
					if (isAllCharDigits(phoneNumber.substring(1)))
						System.out.println("Valid Phone Number Pattern");
					else
						System.out.println("Invalid Phone Number Pattern");
				} else
					System.out.println("Invalid Phone Number Pattern");
			} else
				System.out.println("Invalid Phone Number Pattern");
			break;
		}

		case 1: {

			if (isFirstCharValid(phoneNumber.charAt(0))) {
				if (isAllCharDigits(phoneNumber))
					System.out.println("Valid Phone Number Pattern");
				else
					System.out.println("Invalid Phone Number Pattern");
			} else
				System.out.println("Invalid Phone Number Pattern");
			break;

		}

		default: {
			System.out.println("Invalid Phone Number Pattern");
			break;
		}
		}

	}

	public static void main(String[] args) {
		A27 megha_Assignment = new A27();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("+91 9765463742");
		System.out.println();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("976 546 37 42");
		System.out.println();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("09765463742");
		System.out.println();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("9765463742");
		System.out.println();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("+919765463742");
		System.out.println();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("097 654 637 42");
		System.out.println();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("+91 1765463742");
		System.out.println();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("976 546 3742");
		System.out.println();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("976546a742");
		System.out.println();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("3765466742");
	}

}