package nehaPandey;

public class Assignment27_Validate_Phone_Number {

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
				if (isFirstDigit(num.charAt(4))) {
					if (verifyAllCharAsDigit(num.substring(4))) {
						System.out.println(num + " : Valid Number");
					} else {
						System.out.println(num + " : Invalid Number");
					}
				} else {
					System.out.println(num + " : Invalid Number");
				}
			} else {
				System.out.println(num + " : Invalid Number");
			}
		} else if (num.length() == 13) {
			if (isFirstDigit(num.charAt(0))) {
				if (num.charAt(3) == ' ' && num.charAt(7) == ' ' && num.charAt(10) == ' ') {
					num = num.replace(" ", "");
					if (num.length() == 10) {
						if (verifyAllCharAsDigit(num)) {
							System.out.println(num + " : Valid Number");
						} else {
							System.out.println(num + " : Invalid Number");
						}
					} else {
						System.out.println(num + " : Invalid Number");
					}
				} else {
					System.out.println(num + " : Invalid Number");
				}
			} else {
				System.out.println(num + " : Invalid Number");
			}
		} else if (num.length() == 11) {
			if (num.startsWith("0")) {
				if (isFirstDigit(num.charAt(1))) {
					if (verifyAllCharAsDigit(num)) {
						System.out.println(num + " : Valid Number");
					} else {
						System.out.println(num + " : Invalid Number");
					}
				} else {
					System.out.println(num + " : Invalid Number");
				}
			} else {
				System.out.println(num + " : Invalid Number");
			}
		} else if (num.length() == 10) {
			if (isFirstDigit(num.charAt(0))) {
				if (verifyAllCharAsDigit(num)) {
					System.out.println(num + " : Valid Number");
				} else {
					System.out.println(num + " : Invalid Number");
				}
			} else {
				System.out.println(num + " : Invalid Number");
			}
		} else {
			System.out.println(num + " : Invalid Number");
		}
	}

	public static void main(String[] args) {
		Assignment27_Validate_Phone_Number a27 = new Assignment27_Validate_Phone_Number();

		a27.checkValidNumber("+919765463742");
		a27.checkValidNumber("097 654 637 42");
		a27.checkValidNumber("+91 1765463742");
		a27.checkValidNumber("976 546 3742");
		a27.checkValidNumber("3765463742");
		a27.checkValidNumber("9765463742");
		a27.checkValidNumber("9765463742");

	}

}
