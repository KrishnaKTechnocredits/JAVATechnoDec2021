package archana;

public class Ass24_P4_PrintReverseString {
	String reverseString(String input) {
		String reverseCase = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			reverseCase = reverseCase + ch;
		}
		return reverseCase;
	}

	void spiltString(String input) {
		String[] arr = input.split(" ");
		String temp = "";
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + reverseString(arr[index]);
		}
		System.out.println("String in revese : "+temp.trim());
	}

	public static void main(String[] args) {
		Ass24_P4_PrintReverseString ass24 = new Ass24_P4_PrintReverseString();
		ass24.spiltString("Hi techno hello");
	}
}
