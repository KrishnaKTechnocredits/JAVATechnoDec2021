package jayashri;

public class A20_SumOfDigits {
	
	String str = "tech1noc9red3its";
	int sum = 0;

	void sum() {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
		System.out.println("Sum of Digits in " + str + " is " + sum);
	}
	public static void main(String[] args) {
		A20_SumOfDigits a20_sumofdigits = new A20_SumOfDigits();
		a20_sumofdigits.sum();
	}
}
