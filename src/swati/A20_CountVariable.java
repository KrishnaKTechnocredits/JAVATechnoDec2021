package swati;

public class A20_CountVariable {

	void findChar(String name) {
		int countDigit = 0;
		// int countLetter = 0;
		int countUC = 0;
		int countLC = 0;
		int sum=0;
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (Character.isLetter(c)) {
				if (Character.isUpperCase(c)) {
					countUC++;
				} else {
					countLC++;
				}

			} else if (Character.isDigit(c)) {
				int num=Character.getNumericValue(c);
				sum=sum+num;
				countDigit++;
			}
			/*
			 * if (Character.isDigit(c)) { countDigit++; } if (Character.isLetter(c)) {
			 * countLetter++; } if (Character.isUpperCase(c)) { countUC++; } if
			 * (Character.isLowerCase(c)) { countLC++; }
			 */
		}
		/*
		 * System.out.println("Number of Digit " + countDigit);
		 * System.out.println("Number of Letter " + (countUC + countLC));
		 * System.out.println("Number of UpperCase " + countUC);
		 * System.out.println("Number of LowerCase " + countLC);
		 */
		System.out.println(sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A20_CountVariable a20 = new A20_CountVariable();
		a20.findChar("tech1noc9red3its");
	
	}

}
