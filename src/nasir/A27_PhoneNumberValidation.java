package nasir;

public class A27_PhoneNumberValidation {
	static boolean isFirstCharValid(char ch) {
		if (ch == '9' || ch == '8' || ch == '7')
			return true;
		return false;
	}

	static boolean isAllCharDigits(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				return true;
		}
		return false;
	}

	void findValidNumber(String number) {
		int length = number.length();
		System.out.println("Phone Number: " + number);
		switch (length) {
		case 14: {
			if (number.startsWith("+91 ")) {
				char ch = number.charAt(4);
				if (isFirstCharValid(ch)) {
					if (isAllCharDigits(number.substring(4)))
						System.out.println("It is Valid phone number");
					else
						System.out.println("this is invalid number");
				} else
					System.out.println("this is invalid number");
			} else
				System.out.println("this is invalid number");
			break;
		}
		case 13: {
			if (isFirstCharValid(number.charAt(0))) {
				if (number.charAt(3) == ' ' && number.charAt(7) == ' ' && number.charAt(10) == ' ') {
					number = number.replace(" ", "");
					if (isAllCharDigits(number))
						System.out.println("it is valid number");
					else
						System.out.println("This is invalid number");
				} else
					System.out.println("it is invalid number");
			} else
				System.out.println("it is invalid number");
			break;
		}
		case 11: {
			if (number.startsWith("0")) {
				if (isFirstCharValid(number.charAt(1))) {
					if (isAllCharDigits(number.substring(1)))
						System.out.println("This is valid phone number");
					else
						System.out.println("it is invalid phone number");
				} else
					System.out.println("it is invalid phone number");
			} else
				System.out.println("it is invalid phone number");
			break;
		}
		case 10: {
			if (isFirstCharValid(number.charAt(0))) {
				if (isAllCharDigits(number))
					System.out.println("It is valid phone number");
				else
					System.out.println("It is invalid phone number");
			} else
				System.out.println("It is invalid phone number");
			break;
		}
		default:
			System.out.println("Invaid phone number");
			break;
		}
	}

	public static void main(String[] args) {
		A27_PhoneNumberValidation phoneNumberValidation = new A27_PhoneNumberValidation();
		phoneNumberValidation.findValidNumber("+91 9765463742");
		phoneNumberValidation.findValidNumber("976 546 37 42");
		phoneNumberValidation.findValidNumber("09765463742");
		phoneNumberValidation.findValidNumber("9765463742");
		phoneNumberValidation.findValidNumber("+91976543742");
		phoneNumberValidation.findValidNumber("976 54 637 42");
		phoneNumberValidation.findValidNumber("01765437422");
		phoneNumberValidation.findValidNumber("3876543451");

	}
}
