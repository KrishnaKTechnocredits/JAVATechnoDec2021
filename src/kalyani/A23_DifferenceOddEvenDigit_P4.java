package kalyani;

public class A23_DifferenceOddEvenDigit_P4 {

	int findDiffOfOddAndEvenDigits(String str) {
		int oddNum = 0;
		int evenNum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				String tempString = ch + "";
				int temp = Integer.parseInt(tempString);
				if (temp % 2 == 0)
					evenNum = evenNum + temp;
				else
					oddNum = oddNum + temp;
			}
		}
		return oddNum - evenNum;
	}

	public static void main(String[] args) {
		A23_DifferenceOddEvenDigit_P4 assign23 = new A23_DifferenceOddEvenDigit_P4();
		String str = "tec5hno3cre6di1ts";
		System.out.println("Difference between odd & Even Digits from given string is : " + assign23.findDiffOfOddAndEvenDigits(str));
	}
}