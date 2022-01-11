package ashwini;

public class A19_CharPro {

	void findCharactersCount(String s) {

		int lettersCount = 0;
		int UpperCount = 0;
		int LowerCount = 0;
		int digitCount = 0;
		
		for (int index = 0; index < s.length(); index++) {
			if (Character.isLetter(s.charAt(index))) {
				lettersCount++;
				if (Character.isUpperCase(s.charAt(index))) {
					UpperCount++;
				} else {
					LowerCount++;
				}
			} else if (Character.isDigit(s.charAt(index))) {
				digitCount++;
			}
		}
		System.out.println(lettersCount);
		System.out.println(UpperCount);
		System.out.println(LowerCount);
		System.out.println(digitCount);
	}

	public static void main(String[] args) {
		A19_CharPro p = new A19_CharPro();
		p.findCharactersCount("Tecd23");
	}
}
