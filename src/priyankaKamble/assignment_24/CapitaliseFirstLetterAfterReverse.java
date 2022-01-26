package priyankaKamble.assignment_24;
/*
6. WAP to reverse each word and convert first letter of each word into capital
Input    : "Vrushali Sagar Shital"
Output : "IlahsurV Ragas LatihS"*/

import java.util.Arrays;

public class CapitaliseFirstLetterAfterReverse {

	String reverseString(String input) {
		String outputReverString = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			outputReverString += input.charAt(index);
		}
		outputReverString = outputReverString.replace(outputReverString.charAt(0),
				Character.toUpperCase(outputReverString.charAt(0)));
		return outputReverString;
	}

	void reversewordArr(String input) {
		String[] outputArr = input.split(" ");
		for (int index = 0; index < outputArr.length; index++) {
			outputArr[index] = reverseString(outputArr[index]);
		}
		System.out.println("Output Array => "+Arrays.toString(outputArr));
	}

	public static void main(String[] args) {
		CapitaliseFirstLetterAfterReverse capitalReverse = new CapitaliseFirstLetterAfterReverse();
		String input = "Vrushali Sagar Shital";
		System.out.println("Input String = " + input);
		capitalReverse.reversewordArr(input);
		// capitalReverse.reverseString(input);
	}
}
