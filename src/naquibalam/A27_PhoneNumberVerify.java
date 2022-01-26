package naquibalam;

public class A27_PhoneNumberVerify {
	
	String verifyPhoneFormat(String input) {
		String outFlag = "Not Valid";
		if (!checkAllDigit(input)) {
			return outFlag;
		}
		if (!checkStartNumber(input)) {
			return outFlag;
		}
		if (input.length() == 14) {
			if (input.startsWith("+91 ")) {
				outFlag = "Valid";
			}
		} else if (input.length() == 13) {
			input = input.replace(" ", "");
			if (input.length() == 10) {
				outFlag = "Valid";
			}
		} else if (input.length() == 11) {
			if (input.startsWith("0")) {
				input = input.replaceFirst("0", "");
				if (input.length() == 10) {
					outFlag = "Valid";
				}
			}
		} else if (input.length() == 10) {
			outFlag = "Valid";
		}
		return outFlag;
	}
	
	boolean checkAllDigit(String input) {
		boolean output = true;
		input = input.replace(" ", "");
		if (input.startsWith("+")) {
			input = input.replace("+", "");
		}
		for (int i = 0; i < input.length(); i++) {
			char eachChar = input.charAt(i);
			if (!(Character.isDigit(eachChar))) {
				output =  false;
			}
		}
		return output;
	}
	
	boolean checkStartNumber(String input) {
		boolean output = true;
		if (input.startsWith("+91 ") || input.startsWith("0")) {
			input = input.replace("+91 ", "");
			input = input.replace("0", "");
		} 
		if (!(input.startsWith("9") || input.startsWith("8") || input.startsWith("7"))) {
			output =  false;
		}
		return output;
	}

	public static void main(String[] args) {
		A27_PhoneNumberVerify a27_PhoneNumberVerify = new A27_PhoneNumberVerify();
		String input1 = "+91 9765463742";
		String input2 = "976 546 37 42";
		String input3 = "09765463742";
		String input4 = "9765463742";
		String input5 = "+919765463742";
		String input6 = "097 654 637 42";
		String input7 = "+91 1765463742";
		String input8 = "976 546 3742";
		String input9 = "976546A742";
		String input10 = "3765463742";
		String input11 = "9765463742";
		System.out.println(input1 + " - This phone number is " + a27_PhoneNumberVerify.verifyPhoneFormat(input1));
		System.out.println(input2 + " - This phone number is " + a27_PhoneNumberVerify.verifyPhoneFormat(input2));
		System.out.println(input3 + " - This phone number is " + a27_PhoneNumberVerify.verifyPhoneFormat(input3));
		System.out.println(input4 + " - This phone number is " + a27_PhoneNumberVerify.verifyPhoneFormat(input4));
		System.out.println(input5 + " - This phone number is " + a27_PhoneNumberVerify.verifyPhoneFormat(input5));
		System.out.println(input6 + " - This phone number is " + a27_PhoneNumberVerify.verifyPhoneFormat(input6));
		System.out.println(input7 + " - This phone number is " + a27_PhoneNumberVerify.verifyPhoneFormat(input7));
		System.out.println(input8 + " - This phone number is " + a27_PhoneNumberVerify.verifyPhoneFormat(input8));
		System.out.println(input9 + " - This phone number is " + a27_PhoneNumberVerify.verifyPhoneFormat(input9));
		System.out.println(input10 + " - This phone number is " + a27_PhoneNumberVerify.verifyPhoneFormat(input10));
		System.out.println(input11 + " - This phone number is " + a27_PhoneNumberVerify.verifyPhoneFormat(input11));
	}
}
