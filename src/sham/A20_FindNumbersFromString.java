package sham;

public class A20_FindNumbersFromString {

	void displayNumericValue(String name) {
		// int charSum = 0,numberSum=0;
		String temp = "";
		System.out.println("Given String is: " + name);
		for (int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);

			if (Character.isDigit(ch)) {
				temp = temp + ch;
			}
		}
		System.out.println("Numbers from the Strings are: " + temp);
	}

	public static void main(String[] args) {
		A20_FindNumbersFromString findNumber = new A20_FindNumbersFromString();
		findNumber.displayNumericValue("Techno1c6re2di9t3s");

	}

}
