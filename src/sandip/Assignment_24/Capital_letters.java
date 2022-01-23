package sandip.Assignment_24;

public class Capital_letters {

	void splitWords(String input) {
		String[] s1 = input.split(" ");
		for (int index = 0; index < s1.length; index++) {
			capitalLetters(s1[index]);
		}
	}

	void capitalLetters(String s2) {
		String temp = "";
		char ch = s2.charAt(0);
		ch = Character.toUpperCase(ch);
		s2 = ch + s2.substring(1);
		temp = temp + " " + s2;
		System.out.print(temp);
	}

	public static void main(String[] args) {
		Capital_letters c1 = new Capital_letters();
		c1.splitWords("sandip techno credits");
	}
}
