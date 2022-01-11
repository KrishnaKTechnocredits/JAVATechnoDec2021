package pranoti;

public class A20_CharDigitOperations {

	void charDigitCount(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int num = (Character.getNumericValue(ch));
				sum = sum + num;
			}
		}
		System.out.println("Total Sum of digits present in String : " + sum);
	}

	public static void main(String[] args) {
		A20_CharDigitOperations a20 = new A20_CharDigitOperations();
		a20.charDigitCount("TE1ch2noC2red9iTs");
	}
}
