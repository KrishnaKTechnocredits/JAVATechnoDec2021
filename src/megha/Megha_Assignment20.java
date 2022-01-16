package megha;

public class Megha_Assignment20 {

	int sum = 0;

	void sumOfDigitsInGivenStringChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
	}

	public static void main(String[] args) {
		Megha_Assignment20 megha_Assignment = new Megha_Assignment20();
		megha_Assignment.sumOfDigitsInGivenStringChar("TE1ch2no2C3red4iTs5DeC21");
		System.out.println("Sum of Digits in the given string : " + megha_Assignment.sum);
	}

}
