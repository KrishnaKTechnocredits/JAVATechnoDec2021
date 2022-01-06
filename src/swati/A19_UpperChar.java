package swati;

public class A19_UpperChar {
	/*
	 * //Alternate method int findDigit(char c) { int count=0;
	 * if(Character.isDigit(c)) { count++; } return count; } void findCount(String
	 * name) { int count=0; int sum=0; for (int i = 0; i < name.length(); i++) {
	 * char c = name.charAt(i); count=findDigit(c); sum=sum+count; }
	 * System.out.println(sum); }
	 */

	void findChar(String name) {
		int countDigit = 0;
		int countLetter = 0;
		int countUC = 0;
		int countLC = 0;
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (Character.isLetter(c)) {
				if (Character.isUpperCase(c)) {
					countUC++;
				} else {
					countLC++;
				}

			}
			else if(Character.isDigit(c)) {
				countDigit++;
			}
			/*
			 * if (Character.isDigit(c)) { countDigit++; } if (Character.isLetter(c)) {
			 * countLetter++; } if (Character.isUpperCase(c)) { countUC++; } if
			 * (Character.isLowerCase(c)) { countLC++; }
			 */
		}
		System.out.println("Number of Digit " + countDigit);
		System.out.println("Number of Letter " + (countUC+countLC));
		System.out.println("Number of UpperCase " + countUC);
		System.out.println("Number of LowerCase " + countLC);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A19_UpperChar a19 = new A19_UpperChar();
		a19.findChar("TE1ch2noC2red9iTs");
		// a19.findCount("TE1ch2noC2red9iTs");
	}

}
