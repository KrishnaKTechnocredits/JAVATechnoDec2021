package ashok;

public class A19_assignment {

	void isDigit(String str) {
		int digitcnt = 0;
		int uppercnt = 0;
		int lowercnt = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				digitcnt++;
			} else if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					uppercnt++;
				} else if (Character.isLowerCase(ch))
					lowercnt++;
			}

		}
		System.out.println("Total Digit count is : " + digitcnt);
		System.out.println("Lowercase count is : " + lowercnt);
		System.out.println("Uppercase count is : " + uppercnt);
		System.out.println(lowercnt + uppercnt + " Total letters");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A19_assignment a19_assignment = new A19_assignment();
		a19_assignment.isDigit("TE1ch2noC2red9iTs");

	}

}
