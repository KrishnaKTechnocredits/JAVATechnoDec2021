package krishna_Inheritance_Exp;

public class Assignment_19_OverLoading {
	int temp = 0;
	int tCount = 0;
	int dCount = 0;
	int uCase = 0;
	int lCase = 0;

	void totalLetters(String provide) {
		for (int index = 0; index < provide.length(); index++) {
			char ch = provide.charAt(index);
			if (Character.isLetter(ch))
				if (Character.isUpperCase(ch)) {
				uCase++;
			} else if (Character.isLowerCase(ch)) {
				lCase++;
			} else if (Character.isDigit(ch)) {
				dCount++;
			}
			temp = uCase + lCase;
		}
		System.out.println("Total Letter Available : " + temp);
		System.out.println("Upper Case Available : " + uCase);
		System.out.println("Lower Case Available : " + lCase);
		System.out.println("Digit Available : " + dCount);
	}

	public static void main(String[] args) {
		Assignment_19_OverLoading ass19 = new Assignment_19_OverLoading();
		ass19.totalLetters("TE1ch2noC2red9iTs");
	}
}
