package saurav;

public class A24_ReverseStringOnString {
	
	String reverse(String word) {
		String output = " ";
		for (int index = word.length() - 1; index >= 0; index--) {
			output += word.charAt(index);
		}
		return output;
	}

	String reverseString(String input) {
		String temp = " ";
		String[] word = input.split(" ");
		for (int index = 0; index < word.length; index++) {
			temp += " " + reverse(word[index]);
		}
		System.out.println("Reverse String : " + temp.trim());
		return temp;
	}
	
	public static void main(String[] a) {
		A24_ReverseStringOnString program4 = new A24_ReverseStringOnString();
		program4.reverseString("saurav monali");
	}
}
	
