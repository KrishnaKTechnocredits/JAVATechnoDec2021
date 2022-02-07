package rohini.rohini_Assignment18_22;

/*
Assignment - 21 : 8th Jan'2022

Print all Digits as a String from a given String.
 */

public class Rohini_Assignment21 {

	String sumOfDigits(String input) {

		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp+ch;
			}
		}

		return temp;
	}

	public static void main(String[] a) {
		Rohini_Assignment21 rohini_Assignment21 = new Rohini_Assignment21();
		String str = rohini_Assignment21.sumOfDigits("Srohini199413mayu26012021"); 
		System.out.println("digit string is: "+str);
	}

}
