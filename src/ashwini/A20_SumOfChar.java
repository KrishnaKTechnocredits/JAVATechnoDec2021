package ashwini;

public class A20_SumOfChar {

	int digitCount = 0;
	int sum = 0;

	void sumChar(String s) {

		for (int index = 0; index < s.length(); index++) {
			char ch = s.charAt(index);
			int value = Character.getNumericValue(ch);
			if (Character.isDigit(ch)) {
				digitCount++;

				sum = sum + value;
				}
		}
		System.out.println("sum of all digits in given string is : " + sum);
		System.out.println("the count of digits in given string is: " + digitCount);
	}

	public static void main(String[] args) {
		A20_SumOfChar p = new A20_SumOfChar();
		p.sumChar("Tec193");
	}
}
