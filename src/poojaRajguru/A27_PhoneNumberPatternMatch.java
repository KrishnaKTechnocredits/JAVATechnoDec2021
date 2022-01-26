package poojaRajguru;
import java.util.Scanner;

public class A27_PhoneNumberPatternMatch {

	static boolean verifyCharAsDigit(String number) {
		boolean flag = false;
		for (int index = 0; index < number.length(); index++) {
			char ch = number.charAt(index);
			if (Character.isDigit(ch))
				flag = true;
		}
		if (flag)
			return true;
		else
			return false;
	}

	void validatePhoneNumber(String number) {
		String[] arr;
		boolean ans = false;
		if (number.length() == 14) {
			if (number.startsWith("+91 ")) {
				arr = number.split(" ");
				if (arr.length == 2) {
					int second = arr[1].length();
					if (second == 10) {
						if (arr[1].startsWith("9") || arr[1].startsWith("8"))
							ans = verifyCharAsDigit(arr[1]);
						if (ans)
							System.out.println("Valid Pattern .. ");
						else
							System.out.println("Invalid Pattern !! ");
					} else
						System.out.println("Invalid Pattern !! ");
				}

			} else
				System.out.println("Invalid pattern !! ");
		} else if (number.length() == 11) {
			if (number.startsWith("0")) {
				if (number.charAt(1) == '9' || number.charAt(1) == '8' || number.charAt(1) == '7') {
					System.out.println(number.indexOf(1));
					boolean valid = verifyCharAsDigit(number);
					if (valid)
						System.out.println("valid pattern ..");
					else
						System.out.println("Invalid pattern !! ");
				} else
					System.out.println("Invalid pattern !! ");
			}
		} else if (number.length() == 10) {
			if (number.charAt(0) == '9' || number.charAt(0) == '8' || number.charAt(0) == '7') {
				System.out.println(number.indexOf(1));
				boolean valid = verifyCharAsDigit(number);
				if (valid)
					System.out.println("valid pattern .. ");
				else
					System.out.println("Invalid pattern !! ");
			} else
				System.out.println("Invalid pattern !! ");

		} else if (number.length() == 13) {
			if (number.charAt(0) == '9' || number.charAt(0) == '8' || number.charAt(0) == '7') {
				if (number.charAt(3) == ' ' && number.charAt(7) == ' ' && number.charAt(10) == ' ') {
					boolean valid = verifyCharAsDigit(number);
					if (valid)
						System.out.println("valid pattern .. ");
					else
						System.out.println("Invalid pattern !! ");
				} else
					System.out.println("Invalid pattern !! ");
			} else
				System.out.println("Invalid pattern !!");
		} else {
			System.out.println("Invalid pattern !!");
		}
	}

	public static void main(String[] args) {
		A27_PhoneNumberPatternMatch phone = new A27_PhoneNumberPatternMatch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Phone number : ");
		String number = sc.nextLine();
		phone.validatePhoneNumber(number);
		sc.close();
	}
}
