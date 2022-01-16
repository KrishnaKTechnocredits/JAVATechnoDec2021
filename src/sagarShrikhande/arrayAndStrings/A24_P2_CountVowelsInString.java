package sagarShrikhande.arrayAndStrings;

public class A24_P2_CountVowelsInString {

	void countVowelsInEachWord(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
					|| ch == 'U' || ch == 'u') {
				count++;
			}
		}
		System.out.println(input + "-->" + count);
	}

	void spiltWordsInString(String input) {
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			countVowelsInEachWord(arr[index]);
		}
	}

	public static void main(String[] args) {
		A24_P2_CountVowelsInString a24_P2_CountVowelsInString = new A24_P2_CountVowelsInString();
		a24_P2_CountVowelsInString.spiltWordsInString("aashvi technocredits");
	}
}
