package sagarShrikhande.arrayAndStrings;

public class A24_P3_DigitsInString {

	void findDigitsInWords(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
		}
		System.out.println(temp);
	}

	void spiltWordsInString(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			findDigitsInWords(arr[index]);
		}
	}

	public static void main(String[] args) {
		A24_P3_DigitsInString a24_P3_DigitsInString = new A24_P3_DigitsInString();
		a24_P3_DigitsInString.spiltWordsInString("Te1c2h C94re3");
	}
}
