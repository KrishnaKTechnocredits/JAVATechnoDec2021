package yogeshNagar;

public class A27_StringLogic {

	boolean phoneNumberIsDigit(String str) {
		boolean flag = true;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isLetter(str.charAt(index))) {
				flag = false;
			}
		}
		if (flag == true) {
			return true;
		}
		return false;
	}

	boolean isPhoneNumberStartWith(String str) {
		if (str.charAt(0) == '9' || str.charAt(0) == '8' || str.charAt(0) == '0' || str.charAt(0) == '7')
			return true;
		return false;
	}

	void validatePhoneNumber(String str) {
		int count = 0;

		if (str.length() == 10 || str.length() == 11) {
			if (phoneNumberIsDigit(str) == true) {
				if (isPhoneNumberStartWith(str) == true) {
					if (!str.contains(" "))
						count = 1;
					else
						count = 0;
				} else
					count = 0;
			} else
				count = 0;
		}

		else if (str.length() == 13) {
			if (phoneNumberIsDigit(str) == true) {
				if (str.valueOf(str.charAt(3)).contains(" ") && str.valueOf(str.charAt(7)).contains(" ")
						&& str.valueOf(str.charAt(10)).contains(" ")) {
					count = 1;
					if (!str.substring(0, 3).contains(" ") && !str.substring(4, 7).contains(" ")
							&& !str.substring(8, 10).contains(" "))
						count = 1;
					else
						count = 0;
				} else
					count = 0;
			} else
				count = 0;
		}

		else if (str.length() == 14) {
			if (phoneNumberIsDigit(str) == true) {
				if (str.substring(0, 4).contains("+91 ")) {
					count = 1;
					if (str.valueOf(str.charAt(3)).contains(" ")) {
						count = 1;
						if (!str.substring(4).contains(" "))
							count = 1;
						else
							count = 0;
					} else
						count = 0;
				}
			}
		}

		if (count == 1)
			System.out.println("Phone Number is valid");
		else
			System.out.println("Phone Number is invalid");
	}

	public static void main(String[] args) {
		A27_StringLogic strLogic = new A27_StringLogic();
		strLogic.validatePhoneNumber("+91 9518529528");
		strLogic.validatePhoneNumber("09518529528");
		strLogic.validatePhoneNumber("951 852 95 28");
		strLogic.validatePhoneNumber("9518529528");

		System.out.println("\n---Invalid Phone number---\n");
		A27_StringLogic strLogic1 = new A27_StringLogic();
		strLogic1.validatePhoneNumber("+9 9518529528");
		strLogic1.validatePhoneNumber("19518529528");
		strLogic1.validatePhoneNumber("951852 95 28");
		strLogic1.validatePhoneNumber("31518529528");

		System.out.println("\n---Invalid Phone number with space---\n");
		A27_StringLogic strLogic2 = new A27_StringLogic();
		strLogic2.validatePhoneNumber("+91 9518 29528");
		strLogic2.validatePhoneNumber("09518 29528");
		strLogic2.validatePhoneNumber("951 8 2 95 28");
		strLogic2.validatePhoneNumber("9518 29528");
	}
}
