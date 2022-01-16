package amruta.Assignment_19;

/*	Assignment - 19 : 5th Jan'2022

Print total Letters, Uppercase , Lowercase , Digits from given String.

Input : TE1ch2noC2red9iTs
output :  Total Letters -> 13
               Total UpperCase characters -> 4
               Total LowerCase characters -> 9
               Total Digits -> 4

*/

class CharacterMethods{
	
	void digitCount(String str){
		int digitCount = 0;
		
		for(int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
				if(Character.isDigit(ch))
					digitCount++;			
		}
		System.out.println("Total Digit Count is : "+digitCount);
	}
	
	void upperCaseCount(String str){
		int uppercaseCount = 0;
		
		for(int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
				if(Character.isUpperCase(ch))
					uppercaseCount++;
		}
		System.out.println("Total UpperCase Character Count is : "+uppercaseCount);	
	}
	
	void lowerCaseCount(String str){
		int lowercaseCount = 0;
		
		for(int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
				if(Character.isLowerCase(ch))
					lowercaseCount++;
		}
		System.out.println("Total LowerCase Character Count is : "+lowercaseCount);	
	}
	
	void letterCount(String str){
		int lettercount = 0;
		
		for(int index = 0; index < str.length(); index++){
			char ch = str.charAt(index);
				if(Character.isLetter(ch))
					lettercount++;
		}
		System.out.println("Total Letter Count is : "+lettercount);	
	}
	
	public static void main(String[] args){
		CharacterMethods charactermethods = new CharacterMethods();
		charactermethods.digitCount("TE1ch2noC2red9iTs");
		charactermethods.upperCaseCount("TE1ch2noC2red9iTs");
		charactermethods.lowerCaseCount("TE1ch2noC2red9iTs");
		charactermethods.letterCount("TE1ch2noC2red9iTs");
	}
}