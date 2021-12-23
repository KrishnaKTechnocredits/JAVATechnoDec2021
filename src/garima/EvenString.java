package garima;

public class EvenString {
	void displayCharactors(String s) {
		System.out.println("Even positin from given string :");
		for (int index = 0; index < s.length(); index++) {
			if (index % 2 != 0)
				System.out.println(s.charAt(index));
		}
	}

	void voweldisplay(String s) {
		System.out.println("vowels from given string");
		for (int index = 0; index < s.length(); index++) {
			if (s.charAt(index) == 'a' || s.charAt(index) == 'e' || s.charAt(index) == 'i' || s.charAt(index) == 'o'
					|| s.charAt(index) == 'u')

				System.out.println(s.charAt(index));
		}
	}

	public static void main(String args[]) {
		EvenString evenstring = new EvenString();
		evenstring.displayCharactors("technocredits");
		evenstring.voweldisplay("technocredits");
	}
}
