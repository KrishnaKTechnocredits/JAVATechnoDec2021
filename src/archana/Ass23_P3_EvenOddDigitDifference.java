package archana;

public class Ass23_P3_EvenOddDigitDifference {
	int getDiffOfOddEven(String input) {
		int sumOdd = 0;
		int sumEven = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				String tempStr = ch + "";
				int temp = Integer.parseInt(tempStr);
				if (temp % 2 == 0)
					sumEven = sumEven + temp;
				else
					sumOdd = sumOdd + temp;
			}
		}
		return sumOdd - sumEven;
	}

	public static void main(String[] args) {
		Ass23_P3_EvenOddDigitDifference ass23 = new Ass23_P3_EvenOddDigitDifference();
		String input = "tech6nocre9di7t4s";
		 int ans = ass23.getDiffOfOddEven(input);
		 System.out.println("Diff of sum of odd and Even no's from string : " +ans);
					
	}
}
