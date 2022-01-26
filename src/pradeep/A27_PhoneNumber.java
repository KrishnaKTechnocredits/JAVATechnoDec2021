package pradeep;

import java.util.Scanner;

public class A27_PhoneNumber {

	boolean isFirstCharValid(char ch) {
		if (ch == '9' || ch == '8' || ch == '7')
			return true;
		return false;
	}

	boolean verifyAllCharAsDigit(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch))
				return false;
		}
		return true;
	}

	void checkValidNumber(String input) {

		switch (input.length()) {
		case 14:
			if (input.startsWith("+91 ")) {
				char ch = input.charAt(4);
				String phNum = input.substring(4);
				if (isFirstCharValid(ch) && phNum.length() == 10 && verifyAllCharAsDigit(phNum)) {
					System.out.println(input + " --> Valid");
				} else
					System.out.println(input + " --> Invalid");
			} else
				System.out.println(input + " --> Invalid");
			break;

		case 13:
			if (input.charAt(3) == ' ' && input.charAt(7) == ' ' && input.charAt(10) == ' ') {
				String phNum = input.replace(" ", "");
				char ch = phNum.charAt(0);
				if (isFirstCharValid(ch) && verifyAllCharAsDigit(phNum) && phNum.length() == 10)
					System.out.println(input + " --> Valid");
				else
					System.out.println(input + " --> Invalid");

			} else
				System.out.println(input + " --> Invalid");
			break;

		case 11:
			if (input.charAt(0) == '0') {
				char ch = input.charAt(1);
				String phNum = input.substring(1);
				if (isFirstCharValid(ch) && phNum.length() == 10 && verifyAllCharAsDigit(phNum))
					System.out.println(input + " --> Valid");
				else
					System.out.println(input + " --> Invalid");

			} else
				System.out.println(input + " --> Invalid");
			break;

		case 10:
			char ch = input.charAt(0);
			String phNum = input;
			if (isFirstCharValid(ch) && phNum.length() == 10 && verifyAllCharAsDigit(phNum))
				System.out.println(input + " --> Valid");
			else
				System.out.println(input + " --> Invalid");
		}
	}

	public static void main(String[] args) {
		A27_PhoneNumber a27_PhoneNumber = new A27_PhoneNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Input: ");
		String input = sc.nextLine();
		a27_PhoneNumber.checkValidNumber(input);
		sc.close();
	}
}
