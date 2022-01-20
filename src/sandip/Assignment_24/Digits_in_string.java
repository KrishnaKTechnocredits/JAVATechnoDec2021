package sandip.Assignment_24;

import java.util.Arrays;

public class Digits_in_string {
	void splitWords(String s1) {
		String[] s2 = s1.split(" ");
		String[] output = new String[s2.length];
		for (int index = 0; index < s2.length; index++) {
			output[index] = digits(s2[index]);
		}
		System.out.println("Output Array is : " + Arrays.toString(output));
	}

	String digits(String s1) {
		String temp = "";
		for (int index = 0; index < s1.length(); index++) {
			char ch = s1.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		Digits_in_string d1 = new Digits_in_string();
		d1.splitWords("Tec123no cre4d65its");
	}
}
