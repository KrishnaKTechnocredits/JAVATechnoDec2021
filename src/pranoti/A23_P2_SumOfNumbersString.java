package pranoti;

public class A23_P2_SumOfNumbersString {

	void findSumOfNumInString(String input) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			} else if (!temp.equals("")) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		if (!temp.equals(""))
			sum = sum + Integer.parseInt(temp);
		System.out.println("Sum : " + sum);
	}

	public static void main(String[] args) {
		A23_P2_SumOfNumbersString a23_P2_SumOfNumbersString = new A23_P2_SumOfNumbersString();
		a23_P2_SumOfNumbersString.findSumOfNumInString("te12ch22nocre3dits4");
	}
}
