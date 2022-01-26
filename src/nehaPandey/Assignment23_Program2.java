package nehaPandey;

public class Assignment23_Program2 {

	void findSumOfNumbersFromGivenString(String input) {
		int sum = 0;
		String temp = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			} else if (temp.length() > 0) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		if (temp.length() > 0) {
			sum = sum + Integer.parseInt(temp);
			System.out.println("Sum of numbers from given string: " + sum);

		}

	}

	public static void main(String[] args) {
		Assignment23_Program2 program2 = new Assignment23_Program2();
		program2.findSumOfNumbersFromGivenString("te12ch22nocre3dits4");
	}

}
