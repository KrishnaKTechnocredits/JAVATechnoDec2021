package saurav;

import java.util.Scanner;

public class A12_P1_FreqOfEachCharInString {

	String word;

	void charFreq(String name) {
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			int num = 0;
			for (int innerIndex = 0; innerIndex < name.length(); innerIndex++) {
				if (name.charAt(innerIndex) == ch) {
					num++;
				}
			}
			word = "Char : " + ch + " : " + num;
			if (num > 0)
				System.out.println("Freq of  char = " + ch + " : " + num);
		}
	}

	public static void main(String[] a) {
		A12_P1_FreqOfEachCharInString moon = new A12_P1_FreqOfEachCharInString();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String input = sc.nextLine();
		moon.charFreq(input);
		sc.close();
	}
}
