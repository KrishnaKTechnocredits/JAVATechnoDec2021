package sagarShrikhande;

import java.util.Scanner;

public class A19_CountCharactersNDigits {

	void findCharacterNDigitCount(String input) {
		int upperCaseCount =0;
		int lowerCaseCount =0;
		int digitCount =0;
		for(int index=0; index< input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isLetter(ch) == true) {
				if(Character.isUpperCase(ch))
					upperCaseCount++;
				else
					lowerCaseCount++;
			}
			else if(Character.isDigit(ch))
				digitCount++;			
		}
		System.out.println("Uppercase letter count is: "+upperCaseCount);
		System.out.println("Lowercase letter count is: "+lowerCaseCount);
		System.out.println("Total letter count is: "+ (upperCaseCount + lowerCaseCount));
		System.out.println("Digit count is: "+digitCount);
	}
	
	public static void main(String[] ar) {
		A19_CountCharactersNDigits a19_CountCharactersNDigits = new A19_CountCharactersNDigits();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String input: ");
		String input = 	sc.next();
		a19_CountCharactersNDigits.findCharacterNDigitCount(input);
		sc.close();
	}
}
