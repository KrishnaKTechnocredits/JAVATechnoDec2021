package ashok;

public class A20_assignment {

	void isDigit(String str) {
		int digitcnt = 0;
		int uppercnt = 0;
		int lowercnt = 0;
		int totalnumber = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				int number = Character.getNumericValue(ch);
				totalnumber = totalnumber + number;
				digitcnt++;
			} else if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {

					uppercnt++;
				} else if (Character.isLowerCase(ch))
					lowercnt++;
			}

		}
		System.out.println("Total Digit count is : " + digitcnt);
		System.out.println("Total Digit sum is : " + totalnumber);
		System.out.println("Lowercase count is : " + lowercnt);
		System.out.println("Uppercase count is : " + uppercnt);
		System.out.println(lowercnt + uppercnt + " Total letters");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A20_assignment a20_assignment = new A20_assignment();
		a20_assignment.isDigit("TE1ch2noC2red9iTs");

	}

}
