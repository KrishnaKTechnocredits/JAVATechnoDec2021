package ashok;

import java.util.Arrays;

public class A24_FindDigitinString {

	String[] arrayOFWordsContainingDigits(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			String word = arr[index];
			String temp = "";
			for (int innerIndex = 0; innerIndex < wordLength; innerIndex++) {
				char ch = word.charAt(innerIndex);
				if (Character.isDigit(ch))
					temp += ch;
			}
			arr[index] = temp;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A24_FindDigitinString assignment = new A24_FindDigitinString();
		System.out.println("Digit from String as follows : ");
		String[] arr = assignment.arrayOFWordsContainingDigits("ATe1c2h C94re3");
		System.out.println(Arrays.toString(arr));
		System.out.println();

	}

}
