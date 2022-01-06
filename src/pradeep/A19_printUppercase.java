package pradeep;

import java.util.Scanner;

public class A19_printUppercase {
	int letter,upperCase, lowerCase, digit;
	
	void printLetterUpperLowerDigit(String input){
		for(int index=0; index<input.length(); index++) {
			if(Character.isLetter(input.charAt(index))) {
				letter++;
				if(Character.isUpperCase(input.charAt(index))) {
					upperCase++;
				}else {
					lowerCase++;
				}				
			}else if(Character.isDigit(input.charAt(index))) {
				digit++;
			}
		}
		System.out.println("Total Letters --> "+ letter);
		System.out.println("Total UpperCase characters -->  "+ upperCase);
		System.out.println("Total LowerCase characters --> "+ lowerCase);
		System.out.println("Total Digits --> "+ digit);
	}
	
	public static void main(String[] args) {
		A19_printUppercase a19_printUppercase = new A19_printUppercase();
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter input :");
		String input = sc.next();
		a19_printUppercase.printLetterUpperLowerDigit(input);
		sc.close();
	}
}
