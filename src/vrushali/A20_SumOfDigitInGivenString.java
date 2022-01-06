package vrushali;

public class A20_SumOfDigitInGivenString {
	
	void sumOfDigitsInString(String name) {
		int sum =0;
		for(int index = 0; index<name.length(); index++) {
			if(Character.isDigit(name.charAt(index))) {
				int temp = Character.getNumericValue(name.charAt(index));
				sum = sum + temp;
			}
		}
		System.out.println("Sum of digit from given String " + name + " is " + sum);
	}
	
	
	
	public static void main(String[] args) {
		A20_SumOfDigitInGivenString sumOfDigitInGivenString = new A20_SumOfDigitInGivenString();
		sumOfDigitInGivenString.sumOfDigitsInString("TE1ch2noC2red9iTs1");
	}
}
