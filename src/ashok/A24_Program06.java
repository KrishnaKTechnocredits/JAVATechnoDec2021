package ashok;

import java.util.Arrays;

public class A24_Program06 {
	
	String[] firstCapRevLastCap(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			int wordLength = arr[index].length();
			String word = arr[index];
			String temp = "";
			temp += Character.toUpperCase(word.charAt(wordLength - 1));
			for (int innerIndex = wordLength - 2; innerIndex >= 0; innerIndex--) {
				temp += word.charAt(innerIndex);
			}
			arr[index] = temp;
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A24_Program06 assignment = new A24_Program06();
		System.out.println("Output of Program 6: ");
		String[] firstRev = assignment.firstCapRevLastCap("Vrushali Sagar Shital");
		System.out.println(Arrays.toString(firstRev));
		System.out.println();

	}

}
