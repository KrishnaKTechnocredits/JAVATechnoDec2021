package sagarShrikhande.arrayAndStrings;

public class A27_PhoneNumValidation {

	String isPhoneNumValid(String input) {
		boolean validFlag = true;
		for (int index = 0; index < input.length(); index++) {
			if (!(Character.isDigit(input.charAt(index)) || input.charAt(index) == '+' || input.charAt(index) == ' '))
				validFlag = false;
		}
		if (validFlag == true) {
			if (input.length() == 14 && input.substring(0, 5).equals("+91 9"))
				return " Valid";
			if (input.length() == 13 && input.charAt(0) == '9' && input.contains(" ") && input.charAt(3) == ' '
					&& input.charAt(7) == ' ' && input.charAt(10) == ' ' && input.split(" ").length == 4) {
				return " Valid";
			}
			if (input.length() == 11 && input.startsWith("09"))
				return " Valid";
			if (input.length() == 10 && input.startsWith("9"))
				return " Valid";
			return " invalid";
		} else {
			return " invalid";
		}
	}

	public static void main(String[] args) {
		A27_PhoneNumValidation a27_PhoneNumValidation = new A27_PhoneNumValidation();
		String[] str = { "+919765463742", "097 654 637 42", "+91 1765463742", "976 546 3742", "976546A742",
				"3765465742", "9765463742" };
		for (int index = 0; index < str.length; index++)
			System.out.println(str[index] + "-->" + a27_PhoneNumValidation.isPhoneNumValid(str[index]));

	}
}
