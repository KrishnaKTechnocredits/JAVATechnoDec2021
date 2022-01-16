package hevin;

public class A21_Digits {

	String getDigitsInRow(String input) {
		
		String temp = "";

		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				temp += input.charAt(index);
			}
		}
		System.out.println("Digits Present in String --> " + temp);
		return temp;
	}
	
	public static void main(String[] args) {
		A21_Digits digits = new A21_Digits();
		digits.getDigitsInRow("T1e3h45n9o");
	}

}