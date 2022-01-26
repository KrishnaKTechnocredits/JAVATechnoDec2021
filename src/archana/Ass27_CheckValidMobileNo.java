package archana;
public class Ass27_CheckValidMobileNo {
	String ans = "";
	int count = 0;

	void checkValidMobileNo(String number) {
		int length = number.length();
		String result = "";
		switch (length) {
		case 14:
			result = length14(number);
			System.out.println(number + " : is " + result);
			break;
		case 13:
			result = length13(number);
			System.out.println(number + " : is " + result);
			break;

		case 11:
			result = length11(number);
			System.out.println(number + " : is " + result);
			break;
		case 10:
			result = length10(number);
			System.out.println(number + " : is " + result);
			break;

		default:
			result = "Default : Invalid Mobile Number ";
			System.out.println(number + " : is " + result);
			break;

		}
	}

	String length14(String number) { // length 14

		String arr[] = number.split(" ");
		if (number.startsWith("+91")) {
			ans = isDigit(arr[1]);
		} else {
			ans = "Invalid mobile number";
		}
		return ans;
	}

	String length13(String number) { // length 13

		String num = number.replaceAll("\\s+", "");
		ans = isDigit(num);
		return ans;
	}
	String length11(String number) { // length 11
		String num = number.substring(1);
		String ch = String.valueOf(number.charAt(0));
		if (ch.equals("0")) {
			ans = isDigit(num);
		} else {
			ans = "Invalid mobile number";
		}
		return ans;
	}
	String length10(String number) { // length 10

		ans = isDigit(number);
		return ans;
	}

	String isDigit(String num) {
		count = 0;
		for (int i = 0; i < num.length(); i++) {
			char ch = num.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		if (count == 10) {
			boolean b = numberStartWith(num);
			if (b == true) {
				ans = "Valid mobile number";
			} else {
				ans = "Invalid mobile mumber.";
			}
		} else {
			ans = "Invalid mobile number.";
		}
		return ans;
	}

	boolean numberStartWith(String num) {
		if (num.startsWith("9") || num.startsWith("8") || num.startsWith("7")) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Ass27_CheckValidMobileNo ass27 = new Ass27_CheckValidMobileNo();

		String[] num = { "+91 9765463742", "976 546 37 42", "09765463742", "9765463742", "+919765463742",
				"097 654 637 42", "+91 1765463742", "976 546 3742", "976546A742", "3765463742","9765463742" };

		for (int i = 0; i < num.length; i++) {
			ass27.checkValidMobileNo(num[i]);
			System.out.println("-------------------------------------------------------------------------");
		}

		// ass27.checkValidMobileNo("+91 8765463742");
		// ass27.checkValidMobileNo("976 546 37 42");
		// ass27.checkValidMobileNo("19765463742");
		// ass27.checkValidMobileNo("965463742");
	}

}

