package archana;

import java.util.ArrayList;

public class Test6_Programms {

	void getNonRepeatingChar(String str) {
		for (int index = 0; index < str.length(); index++) {
			String temp = "";
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				if (Character.isUpperCase(ch)) {
					System.out.println("Non Repeat Char in String :" + ch);
				}
			}
		}
	}

	void getMaxLengthWord(String[] arr) {

		String str = arr[0];
		String[] words = str.split(" ");
		for (int index = 0; index < words.length; index++) {
			for (int ind = 1; index < words.length; index++) {
				if (words[index].length() > words[ind].length()) {
					System.out.println("Max Length word : " + words[index]);
				}
			}
		}
	}

	void getSumOfNums(String num) {
		int sum = 0;
		String temp = "";
		for (int index = 0; index < num.length(); index++) {
			char ch = num.charAt(index);
			if (Character.isDigit(ch))
				temp = temp + ch;
			if ((Character.isSpaceChar(ch) || Character.isLetter(ch) && !temp.isEmpty()) || index == num.length() - 1) {
				sum = sum + Integer.parseInt(temp);
				temp = "";
			}
		}
		System.out.println("Sum of numbers : " + sum);
	}

	public static void main(String[] args) {
		Test6_Programms test6 = new Test6_Programms();
		test6.getNonRepeatingChar("tEChNoCrEdits");
		System.out.println("---------------------------------------------------------");
		String[] arr = { "good morning technocredits hi hello" };
		test6.getMaxLengthWord(arr);
		System.out.println("---------------------------------------------------------");
		String num = "10 10 20 30";
		test6.getSumOfNums(num);
	}
}
