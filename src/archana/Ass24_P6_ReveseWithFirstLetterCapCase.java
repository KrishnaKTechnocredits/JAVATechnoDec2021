package archana;

public class Ass24_P6_ReveseWithFirstLetterCapCase {
	String reverseString(String input) {
		String reverseCase = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			if (index == input.length() - 1) // 0th index
				ch = Character.toUpperCase(ch);
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
		System.out.println("Reverse String with first letter caps : " + temp.trim());
	}

	public static void main(String[] args) {
		Ass24_P6_ReveseWithFirstLetterCapCase ass24 = new Ass24_P6_ReveseWithFirstLetterCapCase();
		ass24.spiltString("Vrushali Sagar Shital");
	}
}
