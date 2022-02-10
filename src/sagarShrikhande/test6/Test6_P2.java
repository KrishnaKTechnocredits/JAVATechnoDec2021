package sagarShrikhande.test6;

public class Test6_P2 {

	void findWordWithMaxLength(String input) {
		String[] arr = input.split(" ");
		int maxLength = arr[0].length();
		String maxString = arr[0];
		if (arr.length > 1) {
			for (int index = 1; index < arr.length; index++) {
				if (maxLength < arr[index].length()) {
					maxString = arr[index];
					maxLength = arr[index].length();
				}
			}
		}
		System.out.println("Word with max length is: " + maxString);
	}

	public static void main(String[] args) {
		Test6_P2 tp2 = new Test6_P2();
		String input = "good morning technocredits hi hello";
		tp2.findWordWithMaxLength(input);
	}
}
/*
 * 2. Find maximum word length from a given statement. input =
 * "good morning technocredits hi hello"; output : technocredits
 */