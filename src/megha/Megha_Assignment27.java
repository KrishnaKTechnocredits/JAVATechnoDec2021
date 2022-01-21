package megha;

public class Megha_Assignment27 {

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
		case 14: {
			if (phoneNumber.startsWith("+91 ")) {
				if (isFirstCharValid(phoneNumber.charAt(4))) {
					if (isAllCharDigits(phoneNumber.substring(4)))
						System.out.println("Valid Phone Number Pattern");
					else
						System.out.println("Not a Valid Phone Number Pattern");
				} else
					System.out.println("Not a Valid Phone Number Pattern");

			} else
				System.out.println("Not a Valid Phone Number Pattern");

			break;
		}

		case 13: {

			if (isFirstCharValid(phoneNumber.charAt(0))) {
				if (phoneNumber.charAt(3) == ' ' && phoneNumber.charAt(7) == ' ' && phoneNumber.charAt(10) == ' ') {
					phoneNumber = phoneNumber.replace(" ", "");
					if (isAllCharDigits(phoneNumber))
						System.out.println("Valid Phone Number Pattern");
					else
						System.out.println("Not a Valid Phone Number Pattern");
				} else
					System.out.println("Not a Valid Phone Number Pattern");
			} else
				System.out.println("Not a Valid Phone Number Pattern");

			break;

		}

		case 11: {

			if (phoneNumber.startsWith("0")) {

				if (isFirstCharValid(phoneNumber.charAt(1))) {
					if (isAllCharDigits(phoneNumber.substring(1)))
						System.out.println("Valid Phone Number Pattern");
					else
						System.out.println("Not a Valid Phone Number Pattern");
				} else
					System.out.println("Not a Valid Phone Number Pattern");
			} else
				System.out.println("Not a Valid Phone Number Pattern");
			break;
		}

		case 10: {

			if (isFirstCharValid(phoneNumber.charAt(0))) {
				if (isAllCharDigits(phoneNumber))
					System.out.println("Valid Phone Number Pattern");
				else
					System.out.println("Not a Valid Phone Number Pattern");
			} else
				System.out.println("Not a Valid Phone Number Pattern");

			break;

		}

		default: {
			System.out.println("Not a Valid Phone Number Pattern");
			break;
		}
		}

	}

	public static void main(String[] args) {
		Megha_Assignment27 megha_Assignment = new Megha_Assignment27();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("+91 9765463742");
		System.out.println();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("976 546 37 42");
		System.out.println();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("09765463742");
		System.out.println();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("9765463742");
		System.out.println();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("AD 9765 36 25");
		System.out.println();
		megha_Assignment.findValidOrInvalidPhoneNumPattern("6765262523");
	}

}
