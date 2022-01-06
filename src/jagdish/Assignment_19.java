package jagdish;

public class Assignment_19 {

	void allcaseMethod(String input) {
		int uppercount = 0;
		int lowercount = 0;
		int countletter = 0;
		int countdigit = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isLetter(ch)) {
				countletter++;
			} else if (Character.isDigit(ch)) {
				countdigit++;
			}

			if (Character.isUpperCase(ch)) {
				uppercount++;
			} else if (Character.isLowerCase(ch)) {
				lowercount++;
			}

		}
		System.out.println("The Total letter count is:- " + countletter);
		System.out.println("The Total Digit count is:- " + countdigit);
		System.out.println("The Total UpperCase count is:- " + uppercount);
		System.out.println("The Total LowerCase count is:- " + lowercount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_19 p2 = new Assignment_19();
		p2.allcaseMethod("TE1ch2noC2red9iTs");
	}

}
