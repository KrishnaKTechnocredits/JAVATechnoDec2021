package abhishek;
class Assignment20 {
	int sum = 0;
	void sumOfDigitsInGivenStringChar(String str) {
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				sum = sum + num;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		assignment20.sumOfDigitsInGivenStringChar("TE1ch2no2C3red4iTs5DeC21");
		System.out.println("Sum of Digits in the given string : " + assignment20.sum);
	}
}