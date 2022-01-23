package sandip.Assignment_24;

public class Reverse_and_Caps {
	
	public void splitWord(String s1) {
		String[] args = s1.split(" ");
		for (int index = 0; index < args.length; index++) {
			reverseString(args[index]);
		}
	}

	private void reverseString(String s1) {
		String temp = "";
		for (int index = s1.length() - 1; index >= 0; index--) {
			char ch = s1.charAt(index);
			temp = temp + ch;
		}
		capitalLetters(temp);
	}

	private void capitalLetters(String input) {
		String temp = "";
		char ch = ' ';
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(0);
			ch = Character.toUpperCase(ch);
		}
		temp = temp + ch + input.substring(1);
		System.out.print(temp + " ");
	}

	public static void main(String[] args) {
		Reverse_and_Caps r1 = new Reverse_and_Caps();
		r1.splitWord("sandip techno credits");
	}
}
