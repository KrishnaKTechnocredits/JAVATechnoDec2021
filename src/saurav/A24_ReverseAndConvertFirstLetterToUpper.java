package saurav;

public class A24_ReverseAndConvertFirstLetterToUpper {
	
	
	String home(String input) {
		String word = " ";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			if (index == input.length() - 1)
				ch = Character.toUpperCase(ch);
			word = word + ch;
		}
		return word;
	}

	void reverseAndConvertFirstLetter(String input) {
		String[] arr = input.split(" ");
		String temp = " ";
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + home(arr[index]);
		}
		System.out.println("Reverse string with first letter capital : " + temp.trim());
	}

	public static void main(String[] a) {
		A24_ReverseAndConvertFirstLetterToUpper program6 = new A24_ReverseAndConvertFirstLetterToUpper();
		program6.reverseAndConvertFirstLetter("saurav monali");
	}
}
