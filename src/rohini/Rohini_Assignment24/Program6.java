package rohini.Rohini_Assignment24;


/*6. WAP to reverse each word and convert first letter of each word into capital
Input    : "Vrushali Sagar Shital"
Output : "IlahsurV Ragas LatihS"*/

public class Program6 {
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
		Program6 prg6 = new Program6();
		prg6.splitWord("rohini techno credits");
	}
}
