package sagarAcharya;

import java.util.Scanner;

class A19_CharacterMethods{
	
	public static void main(String[] args){
		A19_CharacterMethods a19 = new A19_CharacterMethods();
		/* Scanner sc = new Scanner(System.in);
		System.out.println("Enter your input : ");
		String input = sc.next(); */
		a19.printMethodDetails("TE1ch2noC2red9iTs");
	}
	
	void printMethodDetails(String input){
		int digitCount = 0;
		int upperCount = 0;
		int lowerCount = 0;
		for(int index = 0;index<input.length();index++){
			char ch = input.charAt(index);
			if(Character.isLetter(ch)){
				if(Character.isUpperCase(ch)){
					upperCount++;
				}
				else{
					lowerCount++;
				}
			}else{
				digitCount++;
			}
		}
		System.out.println("Total Letters = " + (upperCount+lowerCount));
		System.out.println("Total UpperCase characters = "+upperCount);
		System.out.println("Total LowerCase characters = "+lowerCount);
		System.out.println("Total Digits = "+digitCount);
	}
}

/* Assignment - 19 : 5th Jan'2022

Print total Letters, Uppercase , Lowercase , Digits from given String.

Input : TE1ch2noC2red9iTs
output :  Total Letters -> 13
               Total UpperCase characters -> 4
               Total LowerCase characters -> 9
               Total Digits -> 4
 */