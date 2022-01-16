package vishakha;

public class A19_Overloading {
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

				}
			if (Character.isDigit(ch)) {
				dCount++;
		}
		temp = uCase + lCase;

	}
	System.out.println("Upper case is present: "+uCase);
	System.out.println("Lower case is present: "+lCase);
	System.out.println("Digit is present: "+dCount);
	System.out.println("Total Letter present: "+temp);
}
	public static void main(String[] args) {
		A19_Overloading a19 = new A19_Overloading();
		a19.totalLetters("TE1ch2noC2red9iTs");
	}
}