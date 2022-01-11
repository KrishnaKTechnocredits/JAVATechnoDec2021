package pranoti;

public class A19_CharacterOperations {

	void charOperations(String input) {
		int upperCnt = 0, lowerCnt = 0, digitCnt = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					upperCnt++;
				else
					lowerCnt++;
			} else if (Character.isDigit(ch))
				digitCnt++;
		}
		System.out.println("Total Letters : " + (upperCnt + lowerCnt));
		System.out.println("Total UpperCase characters : " + upperCnt);
		System.out.println("Total LowerCase characters : " + lowerCnt);
		System.out.println("Total Digits : " + digitCnt);
	}

	public static void main(String[] args) {
		A19_CharacterOperations a19 = new A19_CharacterOperations();
		a19.charOperations("TE1ch2noC2red9iTs");
	}
}
