package saurav;

public class A27_ValidatePhoneNumber {
	String num = "";

	/*
	 * static boolean verifyAllCharsAsDigit(String num) { for(int index =0;
	 * index<num.length(); index++) { char ch = num.charAt(index);
	 * if(Character.isDigit(ch)) return false; } return true; }
	 */

	void display(String input) {
		if (input.length() == 14) {
			if (input.startsWith("+91 ")) {
				if (input.charAt(4) == '9' || input.charAt(4) == '8' || input.charAt(4) == '7') {
					System.out.println("valid no.");
				} else {
					System.out.println("invalid number");
				}
			} else {
				System.out.println("invalid number");
			}

		} else if (input.length() == 13) {
			if (input.charAt(3) == ' ' && input.charAt(7) == ' ' && input.charAt(10) == ' ') {
				if (input.startsWith("9") || input.startsWith("8") || input.startsWith("7")) {
					System.out.println("valid no.");
				} else {
					System.out.println("invalid number");

				}
			} else {
				System.out.println("invalid number");
			}

		} else if (input.length() == 10) {
			if (input.startsWith("9") || input.startsWith("8") || input.startsWith("7")) {
				System.out.println("valid no.");
			} else {
				System.out.println("invalid number");
			}

		} else if (input.length() == 11) {
			if (input.startsWith("0")) {
				if (input.charAt(1) == '9' || input.charAt(1) == '8' || input.charAt(1) == '7') {
					System.out.println("valid no.");
				}
			} else {
				System.out.println("invalid number");
			}
		} else {
			System.out.println("invalid number");
		}
	}

	public static void main(String[] a) {
		A27_ValidatePhoneNumber assignment1 = new A27_ValidatePhoneNumber();
		assignment1.display("+91 9518529528");
		assignment1.display("09518529528");
		assignment1.display("951 852 95 28");
		assignment1.display("9518529528");
		System.out.println();
		StringArrayPractice assignment2 = new StringArrayPractice();
		assignment2.display("+9 9518529528");
		assignment2.display("19518529528");
		assignment2.display("951852 95 28");
		assignment2.display("91518529528");

	}
}
