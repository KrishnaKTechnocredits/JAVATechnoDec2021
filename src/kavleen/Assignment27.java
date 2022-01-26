package kavleen;

public class Assignment27 {

	boolean isDigit(String phoneNum) {
		for (int index = 0; index < phoneNum.length(); index++) {
			char ch = phoneNum.charAt(index);
			if (!Character.isDigit(ch))
				return false;
		}
		return true;
	}

	boolean startsWithValidSet(char ch) {
		if (ch == '9' || ch == '8' || ch == '7') {
			return true;
		} else
			return false;
	}
	void validNumCheck(String phoneNum) {
		switch (phoneNum.length()) {
		case 14:
			if (phoneNum.startsWith("+91")) {
				if (startsWithValidSet(phoneNum.charAt(4))) {
					if (isDigit(phoneNum.substring(4))) {
						System.out.println(phoneNum + " is a valid number");
					} else
						System.out.println(phoneNum + " is not a valid number");
				} else
					System.out.println(phoneNum + " is not a valid number");
			} else
				System.out.println(phoneNum + " is not a valid number");
			break;

		case 13:
			if (startsWithValidSet(phoneNum.charAt(0))) {
				String newPhoneNum = phoneNum.replaceAll(" ", "");
				if (isDigit(newPhoneNum)) {
					System.out.println(phoneNum + " is a valid number");
				} else
					System.out.println(phoneNum + " is not a valid number");
			} else
				System.out.println(phoneNum + " is not a valid number");
			break;

		case 11:
			if (startsWithValidSet(phoneNum.charAt(1))) {
				if (isDigit(phoneNum))
					System.out.println(phoneNum + " is a valid number");
				else
					System.out.println(phoneNum + " is not a valid number");
			} else
				System.out.println(phoneNum + " is not a valid number");
			break;

		case 10:
			if (startsWithValidSet(phoneNum.charAt(0))) {
				if (isDigit(phoneNum))
					System.out.println(phoneNum + " is a valid number");
				else
					System.out.println(phoneNum + " is not a valid number");
			} else
				System.out.println(phoneNum + " is not a valid number");
			break;

		default:
			System.out.println(phoneNum + " is not a valid number");
		}
	}
	public static void main(String[] args) {
		Assignment27 check = new Assignment27();
		check.validNumCheck("+91 9765463742");
		check.validNumCheck("097 654 637 42");
		check.validNumCheck("91 1765463742");
		check.validNumCheck("9765463742");
		check.validNumCheck("09765463742");
	}
}
