package monikaArkade;

public class A21_Assignment21 {

	String getDigits(String input) {
		String temp = " ";
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index))) {
				temp += input.charAt(index);
			}
		}
		System.out.println("Digits : " + temp);
		return temp;
	}

	public static void main(String[] args) {
		A21_Assignment21 assignment21 = new A21_Assignment21();
		assignment21.getDigits("T1e3h45n9o");
	}

}
