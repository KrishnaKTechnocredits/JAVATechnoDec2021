package tanu;

import java.util.Scanner;
import java.lang.Character;

class Assignment19 {
	char letter;
	int countupper = 0;
	int countlower = 0;
	int countdigit = 0;

	void totalUpperLowerLetter(String name) {
		for (int index = 0; index < name.length(); index++) {
			letter = name.charAt(index);
			if (Character.isUpperCase(letter)) {
				countupper++;
			}
			if (Character.isLowerCase(letter)) {
				countlower++;
			}

			if (Character.isDigit(letter)) {
				countdigit++;
			}
		}
		System.out.println("Total Letters "+(countupper+countlower));
		System.out.println("Total UpperCase Characters are "+countupper);
		System.out.println("Total LowerCase Characters are "+countlower);
		System.out.println("Total Digits "+countdigit);
		
	}

	public static void main(String[] arg) {
		Assignment19 assignment = new Assignment19();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String userinput = input.next();
		assignment.totalUpperLowerLetter(userinput);

	}

}