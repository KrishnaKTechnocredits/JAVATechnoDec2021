package sham;

public class A27_ValidatePhoneNumber {
	/*
	 * 1) +91 9765463742 2) 976 546 37 42 3) 09765463742 4) 9765463742
	 */
	void validatePhoneNumberPatters(String phoneNo) {
		
		for(int i=0;i<phoneNo.length();i++ )
		{
			char ch=phoneNo.charAt(i);
			if(!Character.isDigit(ch) || ch != ' ')
			{
				System.out.println("Invalid");
				return;
			}
		}
		if (phoneNo.length() == 14) {
			if (phoneNo.startsWith("+91 ")) {
				String[] number = phoneNo.split(" ");
				if (number[1].startsWith("9") || number[1].startsWith("8")) {
					if (number[1].length() == 10) {
						System.out.println("Valid");
					} else
						System.out.println("Invalid");
				} else
					System.out.println("Invalid");
			} else
				System.out.println("Invalid");

		} else if (phoneNo.length() == 13) {

			if (phoneNo.startsWith("9") || phoneNo.startsWith("8")) {
				if (phoneNo.charAt(3) == ' ' || phoneNo.charAt(7) == ' ' || phoneNo.charAt(10) == ' ') {
					int ActualLengthofNumber = phoneNo.replace(" ", "").length();
					if (ActualLengthofNumber == 10) {
						System.out.println("Valid Number");
					} else
						System.out.println("Invalid");
				} else
					System.out.println("Invalid");
			} else
				System.out.println("Invalid");

		} else if (phoneNo.length() == 11) {

			if (phoneNo.charAt(0) == '0' && phoneNo.charAt(1) == '9') {
				System.out.println("Valid");
			} else
				System.out.println("Invalid");

		} else if (phoneNo.length() == 10) {
			if (phoneNo.charAt(0) == '9' || phoneNo.charAt(0) == '8') {
				System.out.println("Valid");
			} else
				System.out.println("Invalid");

		} else {
			System.out.println("Invalid Pattern");
		}

	}

	public static void main(String[] args) {
		A27_ValidatePhoneNumber validateNumber = new A27_ValidatePhoneNumber();
		validateNumber.validatePhoneNumberPatters("+91 1765463742");

	}

}
