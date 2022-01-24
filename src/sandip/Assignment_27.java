package sandip;

public class Assignment_27 {

	void validatingNumber(String input) {
		if (input.length() == 14) {
			if (input.startsWith("+91 ")) {
				String[] arg = input.split(" ");
				if (arg[1].startsWith("8") || arg[1].startsWith("9") || arg[1].startsWith("7")) {
					if (arg[1].length() == 10) {
						System.out.println("Valid Number :" + input);
					} else {
						System.out.println("Invalid Number");
					}
				} else {
					System.out.println("Invalid Number");
				}
			} else {
				System.out.println("Invalid Number");
			}
		} else if (input.length() == 10) {
			if (input.startsWith("9") || input.startsWith("8") || input.startsWith("7")) {
				System.out.println("Valid Number :" + input);
			} else {
				System.out.println("Invalid Number");
			}
		} else if (input.length() == 13) {
			if (input.startsWith("9") || input.startsWith("8") || input.startsWith("7")) {
				if (input.charAt(3) == ' ' && input.charAt(7) == ' ' && input.charAt(10) == ' ') {
					System.out.println("Valid Number :" + input);
				} else {
					System.out.println("Invalid Number");
				}
			} else {
				System.out.println("Invalid Number");
			}
		} else if (input.length() == 11) {
			if (input.startsWith("0")) {
				if (input.charAt(1) == '9' || input.charAt(1) == '7' || input.charAt(1) == '8') {
					System.out.println("Valid Number :" + input);
				}
			} else {
				System.out.println("Invalid Number");
			}
		} else {
			System.out.println("Invalid Number");
		}
	}

	public static void main(String[] args) {
		Assignment_27 a1 = new Assignment_27();
		a1.validatingNumber("9518529528");
		a1.validatingNumber("09765463742");
		a1.validatingNumber("976 546 37 42");
		a1.validatingNumber("+91 9765463742");
		a1.validatingNumber("84561");
	}
}
