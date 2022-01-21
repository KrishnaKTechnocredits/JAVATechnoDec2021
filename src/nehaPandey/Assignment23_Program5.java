package nehaPandey;

public class Assignment23_Program5 {
	void findTheDifferenceBetweenEvenAndOddNumbers(String str) {
		String temp = "";
		int oddNumber = 0;
		int evenNumber = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			} else if (temp.length() > 0) {
				if (Integer.parseInt(temp) % 2 == 0) {
					evenNumber = evenNumber + Integer.parseInt(temp);
				} else {
					oddNumber = oddNumber + Integer.parseInt(temp);
				}
				temp = "";
			}
		}
		if (temp.length() > 0)
			if (Integer.parseInt(temp) % 2 == 0) {
				evenNumber = evenNumber + Integer.parseInt(temp);
			} else {
				oddNumber = oddNumber + Integer.parseInt(temp);
			}
		System.out.println("Difference between even and odd numbers from given string: " + (evenNumber - oddNumber));
	}

	public static void main(String[] args) {
		Assignment23_Program5 program5 = new Assignment23_Program5();
		program5.findTheDifferenceBetweenEvenAndOddNumbers("te112ch34no29");
	}

}
