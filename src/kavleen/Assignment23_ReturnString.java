package kavleen;

public class Assignment23_ReturnString {

	void stringAdjustment(String input) {
		String oddNums = "";
		String evenNums = "";
		String firstCap = "";
		for (int index = 0; index < input.length(); index++) {
			String temp = "";
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
				int num = Integer.parseInt(temp);
				if (num % 2 != 0) {
					oddNums += temp;
					temp = "";
				} else
					evenNums += temp;
				temp = "";
			}
		}
		for (int index1 = 0; index1 < input.length(); index1++) {
			String temp = "";
			char ch = input.charAt(index1);
			if (Character.isLetter(ch) && Character.isUpperCase(ch)) {
				temp += ch;
				firstCap = temp;
				break;
			}
		}
		System.out.println(oddNums + firstCap + evenNums);
	}

	public static void main(String[] args) {
		Assignment23_ReturnString assignmentreturn = new Assignment23_ReturnString();
		String input = "eTe1CH9cred4it6s";
		System.out.print("Arranged String of '" + input + "' string is: ");
		assignmentreturn.stringAdjustment(input);
	}

}

