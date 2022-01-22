package rushikesh.assign24;

import java.util.Arrays;
//Program 6. WAP to reverse each word and convert first letter of each word into capital
//Input    : "Vrushali Sagar Shital"
//Output : "IlahsurV Ragas LatihS"

public class Assign24_6 {
	String[] convertFirstLetter(String input) {
		String[] str = input.split(" ");
		for (int index = 0; index < str.length; index++) {
			String word = str[index];
			String temp = "";
			int length = str[index].length();
			temp += Character.toUpperCase(word.charAt(length - 1));
			for (int innerIndex = length - 2; innerIndex >= 0; innerIndex--) {
				temp += word.charAt(innerIndex);
			}
			str[index] = temp;
		}
		return str;
	}
	public static void main(String[] args) {
		Assign24_6 assign24_6=new Assign24_6();
		String input = "Vrushali Sagar Shital";
		String arr[] =assign24_6.convertFirstLetter(input);
		System.out.println("Output: " + Arrays.toString(arr));
		
		
	}
}
