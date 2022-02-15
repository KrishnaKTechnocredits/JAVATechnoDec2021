package pranoti;

public class A24_P6_ReverseConvertFirstLetterOfWord {

	String reverseString(String input) {
		String revStr = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			char ch = input.charAt(index);
			if (index == input.length() - 1)
				ch = Character.toUpperCase(ch);
			revStr = revStr + ch;
		}
		return revStr;
	}

	void convertFirstLetterCapital(String input) {
		String[] arr = input.split(" ");
		String temp = "";
		for (int index = 0; index < arr.length; index++) {
			temp = temp + " " + reverseString(arr[index]);
		}
		System.out.println(temp.trim());
	}

	public static void main(String[] args) {
		A24_P6_ReverseConvertFirstLetterOfWord p6 = new A24_P6_ReverseConvertFirstLetterOfWord();
		p6.convertFirstLetterCapital("Vrushali Sagar Shital");
	}
}
