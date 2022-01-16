package nishika;

public class Assignment_19_charletter {

	void findChar(String name) {

		int uppercasecount = 0;
		int lowercasecount = 0;
		int digitcasecount = 0;

		for (int index = 0; index < name.length(); index++) {

			char ch = name.charAt(index);
			if (Character.isLetter(ch)) {

				if (Character.isUpperCase(ch)) {
					uppercasecount++;
				} else {
					lowercasecount++;
				}
			}

			else if (Character.isDigit(ch)) {
				digitcasecount++;
			}

		}
		System.out.println("Total Letters" + "--->" + (uppercasecount + lowercasecount));
		System.out.println("Total Uppercase count" + "--->" + uppercasecount);
		System.out.println("Total Lowercasecount" + "--->" + lowercasecount);
		System.out.println("Total Digitcasecount" + "--->" + digitcasecount);
	}

	public static void main(String[] args) {
		Assignment_19_charletter assignment_19_charletter = new Assignment_19_charletter();
		assignment_19_charletter.findChar("TE1ch2noC2red9iTs");
	}
}
