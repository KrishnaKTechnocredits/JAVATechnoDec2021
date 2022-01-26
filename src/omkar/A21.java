package omkar;

public class A21 {
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
		A21 a21 = new A21();
		a21.displayDigitsInString("Tech1NO3Cr5edi7ts9");
	}
}
