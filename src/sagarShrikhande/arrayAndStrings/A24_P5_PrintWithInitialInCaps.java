package sagarShrikhande.arrayAndStrings;

public class A24_P5_PrintWithInitialInCaps {

	String stringWithInitialInCaps(String input) {
		String reverseString = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (index == 0)
				ch = Character.toUpperCase(ch);
			reverseString += ch;
		}
		return reverseString;
	}

	void spiltWordsInString(String input) {
		String[] arr = input.split(" ");
		String temp = "";
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + stringWithInitialInCaps(arr[index]);
		}
		System.out.println(temp.trim());
	}

	public static void main(String[] args) {
		A24_P5_PrintWithInitialInCaps a24_P5_PrintWithInitialInCaps = new A24_P5_PrintWithInitialInCaps();
		a24_P5_PrintWithInitialInCaps.spiltWordsInString("anvit harsh dipali");
	}
}
