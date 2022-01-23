package anvit;

public class A24_4_Reverse_Word {
	
	String reverseString(String str) {
		String output = "";
		char ch;
		for (int index = str.length() - 1; index >= 0; index--) {
			ch = str.charAt(index);
			output += ch;
		}
		return output;
	}

	void getString(String input) {
		String[] arr = input.split(" ");
		String str = "";
		for (int index=0;index<arr.length;index++) {
			str = str + " " + reverseString(arr[index]);
		}
		System.out.println(str.trim());
	}

	public static void main(String[] args) {
		A24_4_Reverse_Word a24_4_Reverse_Word = new A24_4_Reverse_Word();
		a24_4_Reverse_Word.getString("Hi techno hello");
	}
}
