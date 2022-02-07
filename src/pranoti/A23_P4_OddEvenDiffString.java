package pranoti;

public class A23_P4_OddEvenDiffString {
	
	void findOddEvenDiffrence(String input) {
		int evenSum = 0;
		int oddSum = 0;
		String temp = "";
		int num = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
				num = Integer.parseInt(temp);
				temp = "";
				if (num % 2 == 0)
					evenSum = evenSum + num;
				else
					oddSum = oddSum + num;
			}
		}

		System.out.println("Diffrence between odd & Even sum : " + (oddSum - evenSum));
	}

	public static void main(String[] args) {
		A23_P4_OddEvenDiffString a23_P4_OddEvenDiffString = new A23_P4_OddEvenDiffString();
		a23_P4_OddEvenDiffString.findOddEvenDiffrence("tec5hno3cre6di1ts");
	}
}
