package saurav;

public class A24_FirstLetterUpperCase {
	
	String firstLetterUppercase(String input) {
		String finalWord = " ";
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String word = arr[index];
			word = word.substring(0, 1).toUpperCase();
			finalWord = word + arr[index].substring(1) + " ";
			System.out.println(finalWord.trim());
		}
		return input;
	}
	
	public static void main(String[] a) {
		A24_FirstLetterUpperCase program5 = new A24_FirstLetterUpperCase();
		program5.firstLetterUppercase("anvit harsh dipali");
	}	
}
