package rohini;

/*
 WAP to validate the phone number which is starting from number 9/8/7 and which should fit in the below mentioned valid patterns.
Valid Patters (considering initial number is 9 ):
1) +91 9765463742
2) 976 546 37 42
3) 09765463742
4) 9765463742
 */

public class Rohini_Assignment27 {
	
	String isValidNum(String input) {
		boolean validFlag = true;
		for (int index = 0; index < input.length(); index++) {
			if (!(Character.isDigit(input.charAt(index)) || input.charAt(index) == '+' || input.charAt(index) == ' '))
				validFlag = false;
		}
		if (validFlag == true) {
			if (input.length() == 14 && input.substring(0, 5).equals("+91 9"))
				return " Valid Number";
			if (input.length() == 13 && input.charAt(0) == '9' && input.contains(" ") && input.charAt(3) == ' '
					&& input.charAt(7) == ' ' && input.charAt(10) == ' ' && input.split(" ").length == 4) {
				return " Valid Number";
			}
			if (input.length() == 11 && input.startsWith("09"))
				return " Valid Number";
			if (input.length() == 10 && input.startsWith("9"))
				return " Valid Number";
			return " invalid";
		} else {
			return " invalid";
		}
	}

	public static void main(String[] args) {
		Rohini_Assignment27 ass1 = new Rohini_Assignment27();
		String[] str = { "+919765463742", "097 654 637 42", "+91 1765463742", "976 546 3742", "976546A742",
				"3765465742", "9765463742" };
		System.out.println("Below Are valid and invalid numbers: \n");
		for (int index = 0; index < str.length; index++)
			System.out.println(str[index] + " --> " + ass1.isValidNum(str[index]));

	}

}
