package naquibalam;

import java.util.Arrays;

public class A24_ArrayPrograms {

	void getArrayLength(String input) {
		String arr[] = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " --> " + arr[i].length());
		}
	}
	
	void getVowelCountArray(String input) {
		String arr[] = input.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " --> " + getvowelCount(arr[i]));
		}	
	}
	
	int getvowelCount(String input) {
		char c1 = 'a', c2 = 'e', c3 = 'i', c4 = 'o', c5 = 'u';
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char characterAtIndex = input.charAt(i);
			if ((characterAtIndex == c1) || (characterAtIndex == c2) || (characterAtIndex == c3) || (characterAtIndex == c4) || (characterAtIndex == c5)) {
				count++;			
			}
		}
		return count;
	}
	
	String[] getDigitArray(String input) {
		String arr[] = input.split(" ");
		String arrOut[] = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			arrOut[i] = getDigits(arr[i]);
		}
		return arrOut;	
	}
	
	String getDigits(String input) {
		String temp = "";
		String Output = "";
		for (int i = 0; i < input.length(); i++) {
			char eachChar = input.charAt(i);
			if (Character.isDigit(eachChar)) {
				temp = temp + eachChar;
			} else {
				Output = Output + temp;
				temp = "";
			}
		}
		if (temp != "") {
			Output = Output + temp;;
		}
		return Output;
	}
	
	String getReverseString(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output = output + input.charAt(i) + "";
		}
		return output;
	}
	
	String getReverseStringArray(String input) {
		String arr[] = input.split(" ");
		String output = "";
		for (int i = 0; i < arr.length; i++) {
			output = output + " " + getReverseString(arr[i]);
		}
		return output.trim();	
	}
	
	String getFirstLetterCaps(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char eachChar = input.charAt(i);
			if (i == 0) {
				output = Character.toUpperCase(eachChar) + "";
			} else {
				output = output + eachChar;
			}
		}
		return output;	
	}
	
	String getFirstLetterCapsArray(String input) {
		String arr[] = input.split(" ");
		String output = "";
		for (int i = 0; i < arr.length; i++) {
			output = output + " " + getFirstLetterCaps(arr[i]);
		}
		return output.trim();	
	}
	
	String getReverseFirstLetterCapsArray(String input) {
		String arr[] = input.split(" ");
		String output = "";
		for (int i = 0; i < arr.length; i++) {
			output = output + " " + getFirstLetterCaps(getReverseString(arr[i]));
		}
		return output.trim();	
	}
	
	String reverseCaseString(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char eachChar = input.charAt(i);
			if (Character.isUpperCase(eachChar)) {
				output = output + Character.toLowerCase(eachChar);
			} else if (Character.isLowerCase(eachChar)) {
				output = output + Character.toUpperCase(eachChar);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		A24_ArrayPrograms a24_ArrayPrograms = new A24_ArrayPrograms();
		System.out.println("Get length of each word from given sentence");
		a24_ArrayPrograms.getArrayLength("Hi Hello");
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("Get vowel count of each word from given sentence");
		a24_ArrayPrograms.getVowelCountArray("aashvi technocredits");
		System.out.println("-----------------------------------------------------------------------------");
		String input1 = "Te1c2h C94re3";
		System.out.println("Return array of words containing only digits from string : " + input1);
		System.out.println(Arrays.toString(a24_ArrayPrograms.getDigitArray(input1)));
		System.out.println("-----------------------------------------------------------------------------");
		String input2 = "Hi techno hello";
		System.out.println("Return reverse of each word from given sentence : " + input2);
		System.out.println(a24_ArrayPrograms.getReverseStringArray(input2));
		System.out.println("-----------------------------------------------------------------------------");
		String input3 = "anvit harsh dipali";
		System.out.println("Return first letter of each word from given sentence in capital : " + input3);
		System.out.println(a24_ArrayPrograms.getFirstLetterCapsArray(input3));
		System.out.println("-----------------------------------------------------------------------------");
		String input4 = "Vrushali Sagar Shital";
		System.out.println("Return reverse and capital first letter of each word from given sentence : " + input4);
		System.out.println(a24_ArrayPrograms.getReverseFirstLetterCapsArray(input4));
		System.out.println("-----------------------------------------------------------------------------");
		String input5 = "TeCHnoC";
		System.out.println("Return reverse case of each character from the given string : " + input5);
		System.out.println(a24_ArrayPrograms.reverseCaseString(input5));
		System.out.println("-----------------------------------------------------------------------------");
	}
}
