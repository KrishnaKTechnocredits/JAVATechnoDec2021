package swati;
import java.util.Scanner;

public class A27_Mobile {

	boolean findNum(String num) {
		boolean flag = false;
		for (int i = 0; i < num.length(); i++) {
			char c = num.charAt(i);
			if (Character.isDigit(c)) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}

	void checkValid(String num) {
		// if number starte with +91
		if (num.startsWith("+91 ") && num.length() == 14 && ((num.charAt(4) == '9') || (num.charAt(4) == '8') || (num.charAt(4) == '7'))) {
			boolean flag = false;
			for (int i = 4; i < num.length(); i++) {
				char c = num.charAt(i);
				if (Character.isDigit(c)) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.println("Valid number");
			} else {
				System.out.println("invalid Number");
			}
		} else if (num.length() == 13 && (num.startsWith("9") || num.startsWith("8") || num.startsWith("7"))) {
			String number = num.replace(" ", "");
			boolean flag = findNum(number);
			if (flag) {
				System.out.println("Valid number");
			} else {
				System.out.println("inavlid number");
			}
		} else if ((num.length() == 11) && (num.startsWith("0"))
				&& ((num.charAt(1) == '9') || (num.charAt(1) == '8') || (num.charAt(1) == '7'))) {
			boolean flag = findNum(num);
			if (flag) {
				System.out.println("Valid number");
			} else {
				System.out.println("inavlid number");
			}
		} else if (num.length() == 10 && (num.startsWith("9") || num.startsWith("8") || num.startsWith("7"))) {
			boolean flag = findNum(num);
			if (flag) {
				System.out.println("Valid number");
			} else {
				System.out.println("inavlid number");
			}
		} else {
			System.out.println("invalid");

		}
	}

	public static void main(String[] args) {
		A27_Mobile a27 = new A27_Mobile();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Mobile:");
		String mobile = sc.nextLine();
		a27.checkValid(mobile);

	}

}
