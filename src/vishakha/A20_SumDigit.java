package vishakha;

public class A20_SumDigit {

	int sum = 0;

	void SumDigit(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}

		System.out.println("Sum of Digits in the given string is:" + sum);
	}

	public static void main(String[] args) {
		A20_SumDigit digit20 = new A20_SumDigit();
		digit20.SumDigit("TE1ch5no2C3red4iTs5DeC21");

	}
}
