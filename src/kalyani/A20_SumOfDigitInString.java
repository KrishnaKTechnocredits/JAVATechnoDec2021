package kalyani;

public class A20_SumOfDigitInString {
	
	int sum = 0;

	void SumOfDigitsInString(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of Digits in the given string is : " + sum);
	}

	public static void main(String[] args) {
		A20_SumOfDigitInString assign20 = new A20_SumOfDigitInString();
		assign20.SumOfDigitsInString("TE1ch5no2C3red4iTs5DeC21");	
	}
}


