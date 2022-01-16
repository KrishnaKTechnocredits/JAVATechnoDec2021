package sagarShrikhande.arrayAndStrings;

public class A24_P4_PrintInReverse {

	String reverseString(String input) {
		String reverseString = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
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
		A24_P4_PrintInReverse a24_P4_PrintInReverse = new A24_P4_PrintInReverse();
		a24_P4_PrintInReverse.spiltWordsInString("Hi techno hello");
	}
}

/*
 * Program 4. WAP to reverse each word on the same index Input :
 * "Hi techno hello" Output : "iH onhcet olleh"
 */