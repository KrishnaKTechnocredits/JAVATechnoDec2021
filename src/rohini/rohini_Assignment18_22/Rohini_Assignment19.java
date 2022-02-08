package rohini.rohini_Assignment18_22;

import java.util.Scanner;

/*Assignment - 19 : 5th Jan'2022

Print total Letters, Uppercase , Lowercase , Digits from given String.

Input : TE1ch2noC2red9iTs
output :  Total Letters -> 13
               Total UpperCase characters -> 4
               Total LowerCase characters -> 9
               Total Digits -> 4
*/

	public class Rohini_Assignment19 {

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
			Rohini_Assignment19 rohini_assignment19 = new Rohini_Assignment19();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter String input: ");
			String input = 	sc.next();
			rohini_assignment19.findCharacterNDigitCount(input);
			sc.close();
		}
	}


