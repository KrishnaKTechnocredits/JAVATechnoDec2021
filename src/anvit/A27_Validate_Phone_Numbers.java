/*WAP to validate the phone number which is starting from number 9/8/7 
and which should fit in the below mentioned valid patterns.
Valid Patters (considering initial number is 9 ):
1) +91 9765463742
2) 976 546 37 42
3) 09765463742
4) 9765463742
*/
package anvit;

public class A27_Validate_Phone_Numbers {

	boolean isDigit(String num) {
		for (int i = 0; i < num.length(); i++) {
			char ch = num.charAt(i);
			if (!Character.isDigit(ch)) {
				return false;
			}
		}
		return true;
	}

	boolean numStartsWith(String num) {
		if (num.startsWith("9") || num.startsWith("8") || num.startsWith("7"))
			return true;
		return false;
	}

	void validateNumbers(String num) {
		if (num.length() == 14) {
			if (num.contains("+91 ")) {
				num = num.substring(4);
				if (isDigit(num)) {
					if (numStartsWith(num)) {
						System.out.println("Valid");
					} else
						System.out.println("Invalid");
				} else
					System.out.println("Invalid");
			} else
				System.out.println("Invalid");
		} else if (num.length() == 13) {
			if (numStartsWith(num)) {
				if (num.indexOf(3) == ' ' && num.indexOf(7) == ' ' && num.indexOf(10) == ' ') {
					num = num.replace(" ", "");
					if (isDigit(num)) {
						if (num.length() == 10) {
							System.out.println("Valid");
						} else
							System.out.println("Invlid");
					} else
						System.out.println("Invalid");
				} else
					System.out.println("Invalid");
			} else
				System.out.println("Invalid");
		} else if (num.length() == 11) {
			if (num.startsWith("0")) {
				num = num.substring(1);
				if (isDigit(num)) {
					if (numStartsWith(num)) {
						System.out.println("Valid");
					} else
						System.out.println("Invalid");
				} else
					System.out.println("Invalid");
			} else
				System.out.println("Invalid");
		} else if (num.length() == 10) {
			if (isDigit(num)) {
				if (numStartsWith(num)) {
					System.out.println("Valid");
				} else
					System.out.println("Invalid");
			} else
				System.out.println("Invalid");
		} else
			System.out.println("Invalid");
	}

	public static void main(String[] args) {
		A27_Validate_Phone_Numbers a27 = new A27_Validate_Phone_Numbers();
		a27.validateNumbers("+919765463742");
		a27.validateNumbers("097 654 637 42");
		a27.validateNumbers("+91 1765463742");
		a27.validateNumbers("976 546 3742");
		a27.validateNumbers("976546A742");
		a27.validateNumbers("3765463742");
		a27.validateNumbers("9765463742");
	}
}
