package hevin;

import java.util.Scanner;

public class A12_Countfrequency {
	
	int stringOccuurrence(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void countOccurrence(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = stringOccuurrence(input, ch);
			System.out.println(ch + " Occurred : " + count+ " times");
		}
	}

	public static void main(String[] a) {
		A12_Countfrequency a12_freq = new A12_Countfrequency();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String input = sc.nextLine();
		a12_freq.countOccurrence(input);
		sc.close();
	}
}