package megha;

public class Megha_Assignment21 {

	void displayDigitsInString(String str) {

		String temp = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
		}

		System.out.println("The Digits in the given String " + str + " as a String is : " + temp);
	}

	public static void main(String[] args) {
		Megha_Assignment21 megha_Assignment = new Megha_Assignment21();
		megha_Assignment.displayDigitsInString("Tech1NO3Cr5edi7ts9");

	}

}
