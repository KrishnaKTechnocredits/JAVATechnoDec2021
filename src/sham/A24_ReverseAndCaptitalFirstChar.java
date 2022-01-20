package sham;

public class A24_ReverseAndCaptitalFirstChar {

	String reverseMethod(String name) {
		String reverse = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			reverse = reverse + name.charAt(i);

		}
		return reverse;
	}

	void reverseAndCapitalWords(String input) {

		String[] words = input.split(" ");
		String temp = "";
		for (int i = 0; i < words.length; i++) {
			String rev = reverseMethod(words[i]);
			char ch = rev.charAt(0);
			ch = Character.toUpperCase(ch);
			temp = temp + ch + rev + " ";

		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		A24_ReverseAndCaptitalFirstChar reverseAndCapital = new A24_ReverseAndCaptitalFirstChar();
		reverseAndCapital.reverseAndCapitalWords("Vrushali Sagar Shital");

	}

}
