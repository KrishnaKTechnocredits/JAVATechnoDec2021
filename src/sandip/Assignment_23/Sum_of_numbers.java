package sandip.Assignment_23;

public class Sum_of_numbers {

	void sumOfNumbers(String input) {
		String temp = "";
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			} else if (!temp.equals("")) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		if (!temp.equals("")) {
			sum = sum + Integer.parseInt(temp);
		}
		System.out.println("Addition of numbers is :" + sum);
	}

	public static void main(String[] args) {
		Sum_of_numbers s1 = new Sum_of_numbers();
		s1.sumOfNumbers("te12ch22nocre3dits4");
	}
}
