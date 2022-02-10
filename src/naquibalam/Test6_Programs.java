package naquibalam;

import java.util.ArrayList;

public class Test6_Programs {
	
	char getFirstNonRepeatingCaptialChar(String input) {
		char output = 0;
		for (int i = 0; i <input.length(); i++) {
			char eachChar = input.charAt(i);
			if (input.indexOf(eachChar) == input.lastIndexOf(eachChar)) {
				if (Character.isUpperCase(eachChar)) {
					return eachChar;
				}
			}
		}
		return output;
	}
	
	String getMaxWordLength(String input) {
		String[] inputArr = input.split(" ");
		int maxLength = 0;
		String output = null;
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i].length() > maxLength) {
				maxLength = inputArr[i].length();
				output = inputArr[i];
			}
		}
		return output;
	}
	
	int getSumOfNumbers(String input) {
		int outputSum = 0;
		String[] inputArrString = input.split(" ");
		ArrayList<Integer> inputArrInteger = new ArrayList<Integer>();
		for (int i = 0; i < inputArrString.length; i++) {
			inputArrInteger.add(Integer.valueOf(inputArrString[i]));
			outputSum = outputSum + inputArrInteger.get(i);
		}
		return outputSum;
	}

	public static void main(String[] args) {
		Test6_Programs test6_Programs = new Test6_Programs();
		
		System.out.println("*************Program - 1 : Get first non-repeating capital character from input*************");
		String input1 = "tEChNoCrEdits";
		System.out.println("Input - " + input1);
		System.out.println("Output - " + test6_Programs.getFirstNonRepeatingCaptialChar(input1));
		System.out.println();
		System.out.println("*************Program - 2 : Get max word length from the statement*************");
		String input2 = "good morning technocredits hi hello";
		System.out.println("Input - " + input2);
		System.out.println("Output - " + test6_Programs.getMaxWordLength(input2));
		System.out.println();
		System.out.println("*************Program - 2 : Get sum of numbers from the string*************");
		String input3 = "10 10 20 30";
		System.out.println("Input - " + input3);
		System.out.println("Output - " + test6_Programs.getSumOfNumbers(input3));
	}
}
