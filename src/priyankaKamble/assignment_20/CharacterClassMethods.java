package priyankaKamble.assignment_20;

import java.util.Scanner;

/*Assignment - 20 : 5th Jan'2022

Print total Sum of Digits  from String.

Input : TE1ch2noC2red9iTs
output :       Total Digits Sum -> 14*/

public class CharacterClassMethods {
	int upperCaseCount = 0, lowerCaseCount = 0,totalCount =0 , digitCount=0 , digitSum=0;
	
		int checkString(String input) {
			for(int index =0 ; index< input.length(); index++) {
				char ch = input.charAt(index);
				if(Character.isLetter(ch)) {
					if(Character.isUpperCase(ch)) 
						upperCaseCount++;
					if(Character.isLowerCase(ch)) 
						lowerCaseCount++;
			}
				else if(Character.isDigit(ch)) {
					digitSum = digitSum+ Character.getNumericValue(ch);
					digitCount++;
				}
			
				else
					System.out.println("String contains Special Character");
			}	
			return digitSum;
		}
	
	public static void main(String[] args) {
			CharacterClassMethods characterClassMethods = new CharacterClassMethods();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String input = sc.nextLine();
		System.out.println("\nInput String is = "+ input+"\n");
		System.out.println("\nSum of all the Digits in String = " +characterClassMethods.checkString(input));
	}
}
