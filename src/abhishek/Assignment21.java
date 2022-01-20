package abhishek;
public class Assignment21 {

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
		Assignment21 assignment21 = new Assignment21();
		assignment21.displayDigitsInString("Tech1NO3Cr5edi7ts9");

	}

}