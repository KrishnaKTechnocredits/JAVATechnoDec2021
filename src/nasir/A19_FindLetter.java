package nasir;

public class A19_FindLetter {
	void letterAndDigit(String input) {
		int countUpper = 0;
		int countLower = 0;
		int countDigit=0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					countUpper++;
				else
					countLower++;
			}
			if(Character.isDigit(ch))
				countDigit++;				
		}
		System.out.println("Total Letters are "+(countUpper+countLower));
		System.out.println("Total Upper case letters are "+countUpper);
		System.out.println("Total Lower case letters are "+countLower);
		System.out.println("Total digits are "+countDigit);
	}

	public static void main(String[] args) {
		A19_FindLetter findLetter = new A19_FindLetter();
		findLetter.letterAndDigit("TE1ch2noC2red9iTs");
	}
}
