package sandip.Assignment_24;

public class Vowels_in_string {

	void splitWords(String s1) {
		String[] arg = s1.split(" ");
		for (int index = 0; index < arg.length; index++) {
			vowel(arg[index]);
		}
	}

	void vowel(String s1) {
		int count = 0;
		for (int index = 0; index < s1.length(); index++) {
			if (s1.charAt(index) == 'a' || s1.charAt(index) == 'e' || s1.charAt(index) == 'i' || s1.charAt(index) == 'o'
					|| s1.charAt(index) == 'u') {
				count++;
			}
		}
		System.out.println(s1 + " :- " + count);
	}

	public static void main(String[] args) {
		Vowels_in_string v1 = new Vowels_in_string();
		System.out.println("Words and there vowels count: ");
		v1.splitWords("Hi hello how are you");
	}
}
