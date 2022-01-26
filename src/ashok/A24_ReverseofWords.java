package ashok;

import java.util.Arrays;

public class A24_ReverseofWords {
	
	String[] reverseOFWords(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			String word = arr[index];
			String temp = "";
			for (int innerIndex = wordLength - 1; innerIndex >= 0; innerIndex--) {
				char ch = word.charAt(innerIndex);
				temp += ch;
			}
			arr[index] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A24_ReverseofWords assignment = new A24_ReverseofWords();
		
		System.out.println("Output of Program 4: ");
		String[] revArr = assignment.reverseOFWords("Hi Techno Hello");
		System.out.println(Arrays.toString(revArr));
		System.out.println();

	}

}
