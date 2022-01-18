package pradeep.A24;

import java.util.Arrays;

public class Program3 {
	// 3. WAP to return array of words containing only digits.

	void getArrayOfDigit(String input) {
		String[] arr = input.split(" ");
		String digit = "";
		String[] output = new String[arr.length];

		for (int index = 0; index < arr.length; index++) {
			String str = arr[index];
			for (int innerIndex = 0; innerIndex < str.length(); innerIndex++) {
				char ch = str.charAt(innerIndex);
				if (Character.isDigit(ch)) {
					digit += ch;
				}
			}
			output[index] = digit;
			digit = "";
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		Program3 program3 = new Program3();
		String input = "Te1c2h C94re3";
		System.out.println("Input : " + input);
		System.out.println("Output : ");
		program3.getArrayOfDigit(input);
	}
}
