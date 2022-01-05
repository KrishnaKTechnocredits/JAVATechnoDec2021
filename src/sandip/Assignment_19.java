package sandip;

public class Assignment_19 {
	int uc;
	int lc;
	int total;

	void characterCase(String s1) {
		int count = 0;
		for (int index = 0; index < s1.length(); index++) {
			if (Character.isDigit(s1.charAt(index))) {
				count++;
			} else if (Character.isUpperCase(s1.charAt(index))) {
				uc++;
				total++;
			} else if (Character.isLowerCase(s1.charAt(index))) {
				lc++;
				total++;
			}
		}
		System.out.println("Number of Digits :" + count);
		System.out.println("Total Upper case letters are :" + uc);
		System.out.println("Total lower case letters are :" + lc);
		System.out.println("Total letters are :" + total);
	}

	public static void main(String[] args) {
		Assignment_19 a1 = new Assignment_19();
		a1.characterCase("TE1ch2noC2red9iTs");
	}
}
