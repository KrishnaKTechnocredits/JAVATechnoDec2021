package ashok;

import java.util.Arrays;

public class A24_conFirsttoUpper {

	String[] conFirsttoUpper(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			String word = arr[index];
			String temp = "";
			temp += Character.toUpperCase(word.charAt(0));
			for (int innerIndex = 1; innerIndex < wordLength; innerIndex++) {
				temp += word.charAt(innerIndex);
			}
			arr[index] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A24_conFirsttoUpper assignment = new A24_conFirsttoUpper();
		System.out.println("Output of Program ");
		String[] convertFirstLetterofWordsArr = assignment.conFirsttoUpper("ashok vinay dipali");
		System.out.println(Arrays.toString(convertFirstLetterofWordsArr));
		System.out.println();

	}

}
