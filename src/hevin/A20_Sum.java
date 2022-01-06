package hevin;

public class A20_Sum {
	
	void getDigitFromString(String input) {
		
		int sum=0;
		
		for(int index=0;index<input.length();index++) {
			char ch =input.charAt(index);
			if(Character.isDigit(ch)) {
				System.out.println("Digit in String : " + ch);
				int number= Character.getNumericValue(ch); // <-- is used to get numeric value from string digit
				sum = sum + number;
			}
		}
		System.out.println("=========================================");
		System.out.println("Total sum of digits = " + sum);
	}

	public static void main(String[] args) {
		A20_Sum sum = new A20_Sum();
		sum.getDigitFromString("TE1ch2noC4red9iTs");
	}
}