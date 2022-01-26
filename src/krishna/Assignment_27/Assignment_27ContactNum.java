package krishna.Assignment_27;

public class Assignment_27ContactNum {
	String validContact(String provide) {
		boolean flag = true;
		for (int i = 0; i < provide.length(); i++) {
			if (!(Character.isDigit(provide.charAt(i)) || provide.charAt(i) == '+' || provide.charAt(i) == ' '))
				flag = false;
		}
		if (flag == true) {
			if (provide.length() == 14 && provide.substring(0, 5).equals("+91 9")) {
				return " Valid Contact Number";
			} else if (provide.length() == 13 && provide.charAt(0) == '9' && provide.contains(" ")
					&& provide.charAt(3) == ' ' && provide.charAt(7) == ' ' && provide.charAt(10) == ' '
					&& provide.split(" ").length == 4) {
				return " Valid Contact Number";
			} else if (provide.length() == 11 && provide.startsWith("09")) {
				return " Valid Contact Number";
			} else if (provide.length() == 10 && provide.startsWith("9")) {
				return "  Valid Contact Number";
			}
			return " Invalid Contact Number";

		} else {
			return " Invalid Contact Number";
		}
	}

	public static void main(String[] args) {
		Assignment_27ContactNum ass27 = new Assignment_27ContactNum();
		String[] con = { "097 654 637 42", "+919765463742", "+91 1765463742", "976 546 3742", "976546A742",
				"3765465742", "9765463742" };
		for (int i = 0; i < con.length; i++) {
			
			System.out.println(con[i] + "====>" + ass27.validContact(con[i]));
			System.out.println("---------------------------------------");
		}
	}
}