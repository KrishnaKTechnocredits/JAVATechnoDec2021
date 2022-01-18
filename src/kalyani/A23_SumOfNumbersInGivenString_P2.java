package kalyani;

public class A23_SumOfNumbersInGivenString_P2 {

	void getSumOfNum(String input) {
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
		System.out.println(sum);
	}

	public static void main(String[] args) {
		A23_SumOfNumbersInGivenString_P2 numSum = new A23_SumOfNumbersInGivenString_P2();
		System.out.print("Sum of the numbers in given string is : ");
		numSum.getSumOfNum("te4c&Hno7CreD-8i*ts");
	}

}