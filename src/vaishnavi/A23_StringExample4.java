package vaishnavi;

public class A23_StringExample4 {

	int findDiffbetweenOddAndEvenDigits(String str) {
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
		A23_StringExample4 a23_StringExample4 = new A23_StringExample4();
		String str = "tec5hno3cre6di1ts";
		System.out.println("Difference between odd & Even Digits from string is : " + a23_StringExample4.findDiffbetweenOddAndEvenDigits(str));
	}
}
