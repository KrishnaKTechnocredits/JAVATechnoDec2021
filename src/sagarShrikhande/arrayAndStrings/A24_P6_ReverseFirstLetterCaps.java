package sagarShrikhande.arrayAndStrings;

public class A24_P6_ReverseFirstLetterCaps {
	
	String reverseString(String input) {
		String reverseString = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			if(index== input.length() -1)
				ch= Character.toUpperCase(ch);
			reverseString += ch;
		}
		
		return reverseString;
	}

	void spiltWordsInString(String input) {
		String[] arr = input.split(" ");
		String temp = "";
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + reverseString(arr[index]);
		}
		System.out.println(temp.trim());
	}

	public static void main(String[] args) {
		A24_P6_ReverseFirstLetterCaps a24_P6_ReverseFirstLetterCaps = new A24_P6_ReverseFirstLetterCaps();
		a24_P6_ReverseFirstLetterCaps.spiltWordsInString("Vrushali Sagar Shital");
	}
}
