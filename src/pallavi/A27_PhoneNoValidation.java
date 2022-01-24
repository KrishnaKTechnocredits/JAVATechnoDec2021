/*Assignment 27 : 21st Jan'2022

WAP to validate the phone number which is starting from number 9/8/7 and which should fit in the below mentioned valid patterns.
Valid Patters (considering initial number is 9 ):
1) +91 9765463742
2) 976 546 37 42
3) 09765463742
4) 9765463742

Input    : +919765463742
Output :  +919765463742 --> Invalid

Input    : 097 654 637 42
Output : 097 654 637 42 --> Invalid

Input    : +91 1765463742
Output : +91 1765463742 --> Invalid

Input    : 976 546 3742
Output : 976 546 3742 --> Invalid

Input    : 976546A742
Output : 976546A742 --> Invalid

Invalid  : 3765463742
Output : 3765463742 --> Invalid

Invalid  : 9765463742
Output : 9765463742 --> Valid 
*/

package pallavi;

import java.util.Scanner;

public class A27_PhoneNoValidation {

	public static boolean isTenDigit(String num) {
		boolean isTenDigit = false;
		if (num.length() == 10) {
			for (int index = 0; index < num.length(); index++) {
				if (Character.isDigit(num.charAt(index)))
					isTenDigit = true;
				else {
					isTenDigit = false;
				    break;
				}
			}

		} else
			isTenDigit = false;

		return isTenDigit;

	}

	public static boolean isValidStart(String num) {
		if (num.startsWith("9") || num.startsWith("8") || num.startsWith("7"))
			return true;
		else
			return false;
	}

	public static void main(String[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter phone number:");
		String input = sc.nextLine();

		switch (input.length()) {

		case 14:
			String[] temp14 = input.split(" ");
			if (temp14[0].equals("+91")) {
				if (isTenDigit(temp14[1])) {
					if (isValidStart(temp14[1])) {
						System.out.println("Valid phone number");
					} else
						System.out.println("Invalid phone number");
				} else
					System.out.println("Invalid phone number");

			} else
				System.out.println("Invalid phone number");
			break;

		case 13:
			String[] temp13 = input.split(" ");
				if (temp13[0].length() == 3 && temp13[1].length() == 3 && temp13[2].length() == 2
						&& temp13[3].length() == 2) {
					String temp = input.replaceAll(" ", "");
					if (isTenDigit(temp)) {
						if (isValidStart(temp)) {
							System.out.println("Valid phone number");
						} else
							System.out.println("Invalid phone number");
					} else
						System.out.println("Invalid phone number");
				} else
					System.out.println("Invalid phone number");

			
			break;

		case 11:
			if (input.startsWith("0")) {
				if (isTenDigit(input.substring(1))) {
					if (isValidStart(input.substring(1))) {
						System.out.println("Valid phone number");
					} else
						System.out.println("Invalid phone number");

				} else
					System.out.println("Invalid phone number");

			} else
				System.out.println("Invalid phone number");
			break;

		case 10:
			if (isTenDigit(input)) {
				if (isValidStart(input)) {
					System.out.println("Valid phone number");
				} else
					System.out.println("Invalid phone number");

			} else
				System.out.println("Invalid phone number");

		default:
			System.out.println("Invalid phone number");
		
		}
		sc.close();
	}

}
