package vaishnavi;

public class A27_ValidPhoneNumberOrNot {

	boolean checkStringContainsAllDigitsOrNot(String str) {
		boolean flag = true;
		for (int index = 0; index < str.length(); index++) {
			if (!Character.isDigit(str.charAt(index))) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	void checkPhoneNumberIsValidOrNot(String str) {
		if (str.length() == 14) {
			if (str.startsWith("+91 ")) {
				String[] arr = str.split("");
				if (arr[1].startsWith("9") || arr[1].startsWith("8") || arr[1].startsWith("7")) {
					if (arr[1].length() == 10) {
						System.out.println(str + " : Phone number is valid ");
					} else {
						System.out.println(str + " : Phone number is invalid.");
					}
				} else {
					System.out.println(str + " : Phone number is invalid.");
				}
			} else {
				System.out.println(str + " : Phone number is invalid.");
			}
		} else if (str.length() == 10) {
			if (str.startsWith("9") || str.startsWith("8") || str.startsWith("7")) {
				System.out.println(str + " : Phone number is valid ");
			} else {
				System.out.println(str + " : Phone number is invalid ");
			}
		} else if (str.length() == 13) {
			if (str.startsWith("9") || str.startsWith("8") || str.startsWith("7")) {
				if (str.charAt(3) == ' ' && str.charAt(7) == ' ' && str.charAt(10) == ' ') {
					System.out.println(str + " : Phone number is valid ");
				} else {
					System.out.println(str + " : Phone number is invalid ");
				}
			} else {
				System.out.println(str + " : Phone number is invalid ");
			}
		} else if (str.length() == 11) {
			if (str.startsWith("0")) {
				if (str.charAt(1) == '9' || str.charAt(1) == '8' || str.charAt(1) == '7') {
					System.out.println(str + " : Phone number is valid ");
				}
			} else {
				System.out.println(str + " : Phone number is invalid ");
			}
		} else {
			System.out.println(str + ": Phone number is invalid ");

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A27_ValidPhoneNumberOrNot a27_ValidPhoneNumberOrNot = new A27_ValidPhoneNumberOrNot();
		a27_ValidPhoneNumberOrNot.checkPhoneNumberIsValidOrNot("+91 9375890537");
		a27_ValidPhoneNumberOrNot.checkPhoneNumberIsValidOrNot("09375490537");
		a27_ValidPhoneNumberOrNot.checkPhoneNumberIsValidOrNot("945 830 82 67");
		a27_ValidPhoneNumberOrNot.checkPhoneNumberIsValidOrNot("9348350543");
		a27_ValidPhoneNumberOrNot.checkPhoneNumberIsValidOrNot("7937587");
		a27_ValidPhoneNumberOrNot.checkPhoneNumberIsValidOrNot("8890227");
		a27_ValidPhoneNumberOrNot.checkPhoneNumberIsValidOrNot("8747890227");
		a27_ValidPhoneNumberOrNot.checkPhoneNumberIsValidOrNot("7896790227");
	}

}
