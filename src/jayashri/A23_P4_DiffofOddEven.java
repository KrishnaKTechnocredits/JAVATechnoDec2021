package jayashri;

public class A23_P4_DiffofOddEven {
	int diffofOddEven(String input) {
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
		A23_P4_DiffofOddEven ap4 = new A23_P4_DiffofOddEven();
		String input = "tec5hno3cre6di1ts";
		 int ans = ap4.diffofOddEven(input);
		 System.out.println("Diff of sum of odd and Even no's from string : " +ans);
					
	}
}
