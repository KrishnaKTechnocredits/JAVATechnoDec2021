package monikaArkade;

import java.util.Arrays;

public class Test2_P2 {
	void singleOccurance(int[] input) {
		String temp = Arrays.toString(input);
		char ch = ' ';
		System.out.println("Single occurance element from the array:");
		for (int index = 0; index < temp.length(); index++) {
			ch = temp.charAt(index);
			if (temp.indexOf(ch) == temp.lastIndexOf(ch))
				System.out.print(ch + " ");
		}
	}

	public static void main(String[] args) {
		Test2_P2 p2 = new Test2_P2();
		int[] num = { 5, 8, 1, 2, 4, 3, 2, 1 };
		p2.singleOccurance(num);
	}
}
