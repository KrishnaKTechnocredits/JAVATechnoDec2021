package kalyani;

import java.util.Scanner;

public class A12_Count_String {
	
	int stringOcc(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void stringOccCount(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = stringOcc(input, ch);
			System.out.println(ch + " Occurrence  " + count+ " times");
		}
	}

	public static void main(String args []) {
		A12_Count_String countstring = new A12_Count_String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input string");
		String input = sc.nextLine();
		countstring.stringOccCount(input);
		sc.close();
	}
}