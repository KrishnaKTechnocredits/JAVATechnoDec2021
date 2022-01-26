package rushikesh.assign24;

import java.util.Arrays;

//Program 5. WAP to convert first character of word with capital letter
//Input    : "anvit harsh dipali"
//Output : "Anvit Harsh Dipali"

public class Assign24_5 {
	String[] convertFirstLetter(String input) {
		String[] arr = input.split(" ");
		char ch = ' ';
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			ch = Character.toUpperCase(word.charAt(0));
			word = ch + word.substring(1, word.length()); 
			arr[index] = word;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Assign24_5 assign24_5=new Assign24_5();
		String input = "anvit harsh dipali";
		String arr[] =assign24_5.convertFirstLetter(input);
		System.out.println("Output: " + Arrays.toString(arr));
	}
}
