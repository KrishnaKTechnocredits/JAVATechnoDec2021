package tanu;

import java.util.Scanner;
import java.lang.Character;

class Assignment20 {
	char letter;
	int sumcount=0;

	void sumOfDigits(String name) {
		for (int index = 0; index < name.length(); index++) {
			letter = name.charAt(index);
			if (Character.isDigit(letter)) {
				sumcount= Character.getNumericValue(letter) + sumcount;
			}
		}
           System.out.println("Sum of all digits in given name "+sumcount);
	}

	public static void main(String[] arg) {
		Assignment20 assignment = new Assignment20();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String userinput = input.next();
		assignment.sumOfDigits(userinput);

	}

}