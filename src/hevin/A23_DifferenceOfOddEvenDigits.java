package hevin;

public class A23_DifferenceOfOddEvenDigits {

	void getDifferenceOddEvenNums(String input) {
		int sumOdd = 0;
		int sumEven = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp += ch;
				@SuppressWarnings("static-access")
				int num = Integer.parseInt(temp.valueOf(ch));
				if (num % 2 != 0) {
					sumOdd += num;
				} else
					sumEven += num;
			}
		}
		System.out.println("Difference between the sum of odd numbers and sum of even numbers is: " + (sumOdd - sumEven));
	}

	public static void main(String[] args) {
		A23_DifferenceOfOddEvenDigits diffOddEven = new A23_DifferenceOfOddEvenDigits();
		String input = "tec5hno3cre6di1ts";
		diffOddEven.getDifferenceOddEvenNums(input);

	}

}
